package br.com.dbserver.selenium_jupiter.verificationPoints;

import org.openqa.selenium.WebDriver;

import br.com.dbserver.selenium_jupiter.tasks.AddressTasks;
import br.com.dbserver.selenium_jupiter.tasks.OrderTasks;
import br.com.dbserver.selenium_jupiter.tools.CustomerFake;

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

	public boolean verifyProductQtdInOrder(String productQtdActual) {    	
		String productQtdExpected = this.orderTasks.getProductQtdLabel();  		
		return productQtdExpected.contains(productQtdActual) ? true : false;		
	}

	public boolean verifyProductPriceInOrder(String productPriceActual) {    	
		String productPriceExpected = this.orderTasks.getProductPriceLabel();  		
		return productPriceExpected.contains(productPriceActual)? true : false;
	}
	
	public boolean verifyProductNameInOrder(String productNameActual) {    	
		String productNameExpected = this.orderTasks.getProductNameLabel();    		
		return productNameExpected.contains(productNameActual)? true : false;
	}
	
	public boolean verifyProductPriceTotalLabel() {    	
		double priceTotal = Double.parseDouble(this.orderTasks.getProductPriceTotalLabel().replace("$",""));
		double price = Double.parseDouble(this.orderTasks.getProductPriceLabel().replace("$", ""));
		int    qtd = Integer.parseInt(this.orderTasks.getProductQtdLabel());
		
		return priceTotal == (price*qtd)? true: false;					
	} 
	
	public boolean verifySumTotalOrderLabel() {    	
		double totalOrderExpected = Double.parseDouble(this.orderTasks.getTotalOrderLabel().replace("$",""));		
		double totalShipping      = Double.parseDouble(this.orderTasks.getTotalShippingLabel().replace("$",""));
		double totalTax           = Double.parseDouble(this.orderTasks.getTotalTaxLabel().replace("$",""));
		double totalAllProducts   = Double.parseDouble(this.orderTasks.getTotalAllProductsLabel().replace("$",""));		
		double totalOrderActual = totalShipping + totalAllProducts + totalTax ;				
		return totalOrderExpected == totalOrderActual ? true: false;					
	}
	
	public boolean verifyAddress(CustomerFake customer) {
		String addressNameActual    			= this.addressTasks.getAddressNameLabel();
		String addressCompanyActual  			= this.addressTasks.getAddressNameLabel();
		String addressAddressActual				= this.addressTasks.getAddressNameLabel();
		String addressCityStatePostcodeActual 	= this.addressTasks.getAddressNameLabel();
		String addressCountryActual 			= this.addressTasks.getAddressNameLabel();
		String addressMobileActual	 			= this.addressTasks.getAddressNameLabel();
		
		String addressNameExpected  			= customer.getName()+" "+customer.getLastName();
		String addressCompanyExpected 			= customer.getCompany();
		String addressAddressExpected			= customer.getAliasAddress()			;
		String addressCityStatePostcodeExpected = customer.getCity()+" , "+customer.getState() +" "+customer.getPostalCode();
		String addressCountryExpected 			= customer.getCountry();
		String addressMobileExpected	 		= customer.getMobile();
		
		int count = 0;
		
		if(addressNameActual.equalsIgnoreCase(addressNameExpected)) {
			count++;
		}else if(addressCompanyActual.equalsIgnoreCase(addressCompanyExpected)) {
			count++;
		}else if(addressAddressActual.equalsIgnoreCase(addressAddressExpected)) {
			count++;
		}else if(addressCityStatePostcodeActual.equalsIgnoreCase(addressCityStatePostcodeExpected)) {
			count++;
		}else if(addressCountryActual.equalsIgnoreCase(addressCountryExpected)) {
			count++;
		}else if(addressMobileActual.equalsIgnoreCase(addressMobileExpected)) {
			count++;
		}
		
		return count == 6  ? true : false;		
	}
	
}
