package br.com.dbserver.selenium_jupiter.verificationPoints;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.Status;

import br.com.dbserver.selenium_jupiter.tasks.AddressTasks;
import br.com.dbserver.selenium_jupiter.tasks.OrderTasks;
import br.com.dbserver.selenium_jupiter.tools.CustomerFake;
import br.com.dbserver.selenium_jupiter.tools.ElementsTools;
import br.com.dbserver.selenium_jupiter.tools.Report;

public class TestCase01VerificationPoints {
	private WebDriver    driver;
	private OrderTasks   orderTasks;
	private AddressTasks addressTasks;

	public TestCase01VerificationPoints(WebDriver driver) {
		super();
		this.driver       = driver;		
		this.orderTasks   = new OrderTasks  (this.driver);
		this.addressTasks = new AddressTasks(this.driver);
	}

	public void verifyProductQtdInOrder(String productQtdActual) {   
		String productQtdExpected = this.orderTasks.getProductQtdLabel();  				
		if (productQtdExpected.contains(productQtdActual)) {
			Report.log(Status.PASS, "A quantidade esta correta.", this.driver);
		}else {
			Report.log(Status.FAIL, "A quantidade não esta correta.", this.driver);
		}				
		ElementsTools.unHighlightElement(driver);
	}

	public void verifyProductPriceInOrder(String productPriceActual) {    	
		String productPriceExpected = this.orderTasks.getProductPriceLabel(); 

		if (productPriceExpected.contains(productPriceActual)) {
			Report.log(Status.PASS, "O preço esta correto.", this.driver);
		}else {
			Report.log(Status.FAIL, "O preço não esta correto.", this.driver);
		}	
		ElementsTools.unHighlightElement(driver);
	}

	public void verifyProductNameInOrder(String productNameActual) {    	
		String productNameExpected = this.orderTasks.getProductNameLabel();    	

		if (productNameExpected.contains(productNameActual)) {
			Report.log(Status.PASS, "O produto esta correto.", this.driver);
		}else {
			Report.log(Status.FAIL, "O produto não esta correto.", this.driver);
		}	
		ElementsTools.unHighlightElement(driver);
	}

	public void verifyProductPriceTotalLabel() {    	
		double priceTotal = Double.parseDouble(this.orderTasks.getProductPriceTotalLabel().replace("$",""));
		double price = Double.parseDouble(this.orderTasks.getProductPriceLabel().replace("$", ""));
		int    qtd = Integer.parseInt(this.orderTasks.getProductQtdLabel());

		if (priceTotal == (price*qtd)) {
			Report.log(Status.PASS, "A soma dos itens esta correta.", this.driver);
		}else {
			Report.log(Status.FAIL, "A soma dos itens não total não esta correta.", this.driver);
		}
		ElementsTools.unHighlightElement(driver);
	} 

	public void verifySumTotalOrderLabel() {    	
		double totalOrderExpected = Double.parseDouble(this.orderTasks.getTotalOrderLabel().replace("$",""));		
		double totalShipping      = Double.parseDouble(this.orderTasks.getTotalShippingLabel().replace("$",""));
		double totalTax           = Double.parseDouble(this.orderTasks.getTotalTaxLabel().replace("$",""));
		double totalAllProducts   = Double.parseDouble(this.orderTasks.getTotalAllProductsLabel().replace("$",""));		
		double totalOrderActual = totalShipping + totalAllProducts + totalTax ;	

		if (totalOrderExpected == totalOrderActual) {
			Report.log(Status.PASS, "A soma total esta correta.", this.driver);
		}else {
			Report.log(Status.FAIL, "A soma total não esta correta.", this.driver);
		}	

		ElementsTools.unHighlightElement(driver);
	}	

	public void verifyAddressMobile(CustomerFake customer) {
		String addressMobileActual	 = this.addressTasks.getMobileLabel();		
		String addressMobileExpected = customer.getMobile();		

		if(addressMobileActual.equalsIgnoreCase(addressMobileExpected)) {
			Report.log(Status.PASS, "O telefone esta correto.", this.driver);
		}else {
			Report.log(Status.FAIL, "O telefone não esta correto.", this.driver);
		}	
	}

	public void verifyAddressCountry(CustomerFake customer) {		
		String addressCountryActual   = this.addressTasks.getCountryLabel();		
		String addressCountryExpected = customer.getCountry();

		if(addressCountryActual.equalsIgnoreCase(addressCountryExpected)) {
			Report.log(Status.PASS, "O país esta correto.", this.driver);
		}else {
			Report.log(Status.FAIL, "O país não esta correto.", this.driver);
		}	
	}	

	public void verifyAddressCityStatePostcode(CustomerFake customer) {		
		String addressCityStatePostcodeActual 	= this.addressTasks.getCityStatePostCodeLabel();		
		String addressCityStatePostcodeExpected = customer.getCity()+", "+customer.getState() +" "+customer.getPostalCode();

		if (addressCityStatePostcodeActual.equalsIgnoreCase(addressCityStatePostcodeExpected)) {
			Report.log(Status.PASS, "O endereço esta correto.", this.driver);
		}else {
			Report.log(Status.FAIL, "O endereço não esta correto.", this.driver);
		}	
	}

	public void verifyAddressStreet(CustomerFake customer) {
		String addressAddressActual	  = this.addressTasks.getAddressLabel();		
		String addressAddressExpected = customer.getStreet();		

		if (addressAddressActual.equalsIgnoreCase(addressAddressExpected)) {
			Report.log(Status.PASS, "A rua do endereço esta correta.", this.driver);
		}else {
			Report.log(Status.FAIL, "A rua do endereço não esta correta.", this.driver);
		}	
	}	

	public void verifyAddressCompany(CustomerFake customer) {
		String addressCompanyActual   = this.addressTasks.getCompanyLabel();		
		String addressCompanyExpected = customer.getCompany();		

		if (addressCompanyActual.equalsIgnoreCase(addressCompanyExpected)) {
			Report.log(Status.PASS, "O nome da compania esta correto.", this.driver);
		}else {
			Report.log(Status.FAIL, "O nome da compania não esta correto.", this.driver);
		}	
	}

	public void verifyAddressName(CustomerFake customer) {
		String addressNameActual   = this.addressTasks.getAddressNameLabel();		
		String addressNameExpected = customer.getName()+" "+customer.getLastName();		

		if (addressNameActual.equalsIgnoreCase(addressNameExpected)) {
			Report.log(Status.PASS, "O nome do cliente esta correto.", this.driver);
		}else {
			Report.log(Status.FAIL, "O nome do cliente não esta correto.", this.driver);
		}	
	}

}
