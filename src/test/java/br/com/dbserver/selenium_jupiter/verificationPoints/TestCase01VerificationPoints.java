package br.com.dbserver.selenium_jupiter.verificationPoints;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import br.com.dbserver.selenium_jupiter.tasks.AddressTasks;
import br.com.dbserver.selenium_jupiter.tasks.OrderTasks;
import br.com.dbserver.selenium_jupiter.tools.CustomerFake;
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
	}

	public void verifyProductPriceInOrder(String productPriceActual) {    	
		String productPriceExpected = this.orderTasks.getProductPriceLabel(); 
		
		if (productPriceExpected.contains(productPriceActual)) {
			Report.log(Status.PASS, "O preço esta correto.", this.driver);
		}else {
			Report.log(Status.FAIL, "O preço não esta correto.", this.driver);
		}	
	}
	
	public void verifyProductNameInOrder(String productNameActual) {    	
		String productNameExpected = this.orderTasks.getProductNameLabel();    	
		
		if (productNameExpected.contains(productNameActual)) {
			Report.log(Status.PASS, "O produto esta correto.", this.driver);
		}else {
			Report.log(Status.FAIL, "O produto não esta correto.", this.driver);
		}	
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
	}	
	
	public void verifyAddress(CustomerFake customer) {
		String addressNameActual    			= this.addressTasks.getAddressNameLabel();
		String addressCompanyActual  			= this.addressTasks.getAddressNameLabel();
		String addressAddressActual				= this.addressTasks.getAddressNameLabel();
		String addressCityStatePostcodeActual 	= this.addressTasks.getAddressNameLabel();
		String addressCountryActual 			= this.addressTasks.getAddressNameLabel();
		String addressMobileActual	 			= this.addressTasks.getAddressNameLabel();
		
		String addressNameExpected  			= customer.getName()+" "+customer.getLastName();
		String addressCompanyExpected 			= customer.getCompany();
		String addressAddressExpected			= customer.getAliasAddress();
		String addressCityStatePostcodeExpected = customer.getCity()+" , "+customer.getState() +" "+customer.getPostalCode();
		String addressCountryExpected 			= customer.getCountry();
		String addressMobileExpected	 		= customer.getMobile();
		
		int count = 0;
		
		if(addressNameActual.equalsIgnoreCase(addressNameExpected)) {
			System.out.println(addressNameActual +"  "+ addressNameExpected);
			count++;
		}		
		if(addressCompanyActual.equalsIgnoreCase(addressCompanyExpected)) {
			System.out.println(addressCompanyActual+"  "+addressCompanyExpected);
			count++;
		}		
		if(addressAddressActual.equalsIgnoreCase(addressAddressExpected)) {
			System.out.println(addressAddressActual +"  "+ addressAddressExpected);
			count++;
		}
		if(addressCityStatePostcodeActual.equalsIgnoreCase(addressCityStatePostcodeExpected)) {
			System.out.println(addressCityStatePostcodeActual+"  "+addressCityStatePostcodeExpected);
			count++;
		}
		if(addressCountryActual.equalsIgnoreCase(addressCountryExpected)) {
			System.out.println(addressCountryActual+"  "+addressCountryExpected);
			count++;
		}
		if(addressMobileActual.equalsIgnoreCase(addressMobileExpected)) {
			System.out.println(addressMobileActual+"  "+addressMobileExpected);
			count++;
		}
		
		if (count == 6) {
			Report.log(Status.PASS, "O endereço esta correto.", this.driver);
		}else {
			Report.log(Status.FAIL, "O endereço não esta correto.", this.driver);
		}	
	}
	
}
