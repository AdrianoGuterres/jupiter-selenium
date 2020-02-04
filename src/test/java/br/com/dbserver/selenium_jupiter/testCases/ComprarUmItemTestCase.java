package br.com.dbserver.selenium_jupiter.testCases;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.openqa.selenium.WebDriver;

import br.com.dbserver.selenium_jupiter.tasks.AddressTasks;
import br.com.dbserver.selenium_jupiter.tasks.HomePageTasks;
import br.com.dbserver.selenium_jupiter.tasks.ItemPageTasks;
import br.com.dbserver.selenium_jupiter.tasks.LoginPageTasks;
import br.com.dbserver.selenium_jupiter.tasks.MyAccountTasks;
import br.com.dbserver.selenium_jupiter.tasks.OrderSumariTasks;
import br.com.dbserver.selenium_jupiter.tasks.OrderTasks;
import br.com.dbserver.selenium_jupiter.tasks.PaymentTasks;
import br.com.dbserver.selenium_jupiter.tasks.ShippingTasks;
import br.com.dbserver.selenium_jupiter.tools.CustomerFake;
import br.com.dbserver.selenium_jupiter.tools.DriverConfig;
import br.com.dbserver.selenium_jupiter.tools.Report;
import br.com.dbserver.selenium_jupiter.verificationPoints.TestCase01VerificationPoints;

@TestInstance(Lifecycle.PER_CLASS)
class ComprarUmItemTestCase {	

	private WebDriver driver ;	

	private HomePageTasks    			 homePageTasks;
	private LoginPageTasks   			 loginPageTasks;
	private MyAccountTasks   			 accountTasks;
	private ItemPageTasks  				 itemPageTasks;
	private OrderTasks       			 orderTasks;
	private AddressTasks     			 addressTasks;
	private ShippingTasks  	 			 shippingTasks;
	private PaymentTasks   	 			 paymentTasks;	
	private OrderSumariTasks 			 orderSumariTasks;
	private TestCase01VerificationPoints verifications;
	private CustomerFake 				 customerFake;

	@BeforeAll  		
	public void setUp() {		
		
		Report.startTest("Comprar Um Item");
		
		this.customerFake = new CustomerFake();

		this.driver = DriverConfig.getWebdriverChrome("http://automationpractice.com/index.php");	

		this.homePageTasks    = new HomePageTasks 	(this.driver);
		this.loginPageTasks   = new LoginPageTasks	(this.driver);
		this.accountTasks     = new MyAccountTasks	(this.driver);
		this.itemPageTasks    = new ItemPageTasks 	(this.driver);
		this.orderTasks       = new OrderTasks    	(this.driver);
		this.addressTasks     = new AddressTasks  	(this.driver);
		this.shippingTasks    = new ShippingTasks 	(this.driver);
		this.paymentTasks     = new PaymentTasks    (this.driver);
		this.orderSumariTasks = new OrderSumariTasks(this.driver);
		this.verifications    = new TestCase01VerificationPoints(this.driver);
	} 

	@AfterAll 
	public void tearDown() {			
		this.driver.quit();
		Report.close();
	}

	@Test
	public void testMain() {	

		this.homePageTasks.selectItemMenu();		
		this.homePageTasks.chooseFirstItemBlock();		
		this.homePageTasks.clickFirstItemBlock();	

		String productName  = itemPageTasks.getProductNameLabel();
		String productQtd   = itemPageTasks.getProductQtdLabel();
		String productPrice = itemPageTasks.getProductPriceLabel();		

		this.itemPageTasks.clickAddCartButton();		
		this.itemPageTasks.clickProceedCheckoutButton();
		this.verifications.verifyProductNameInOrder(productName);		
		this.verifications.verifyProductPriceInOrder(productPrice);
		this.verifications.verifyProductQtdInOrder(productQtd);
		this.verifications.verifyProductPriceTotalLabel();		
		this.verifications.verifySumTotalOrderLabel();				
		this.orderTasks.clickProceedToCheckoutButton();
		this.loginPageTasks.fillEmailAddressTextfield(this.customerFake.getEmail());		
		this.loginPageTasks.clickCreateAccountButton();
		this.accountTasks.markMisterRadioButton();		
		this.accountTasks.fillFirstNameTextfield(this.customerFake.getName());		
		this.accountTasks.fillLastNameTextfield(this.customerFake.getLastName());		
		this.accountTasks.fillLastEmailTextfield(this.customerFake.getEmail());		
		this.accountTasks.fillPasswordTextfield(this.customerFake.getPassword());	
		this.accountTasks.choseDaysBithdayCombobox(this.customerFake.getDayBirthday()+"");		
		this.accountTasks.choseMonthBithdayCombobox(this.customerFake.getMonthBirthday()+"");		
		this.accountTasks.choseYearComboboxCombobox(this.customerFake.getYearBirthday()+"");		
		this.accountTasks.fillCompanyTextfield(this.customerFake.getCompany());		
		this.accountTasks.fillAddressTextfield(this.customerFake.getStreet());		
		this.accountTasks.fillCityTextfield(this.customerFake.getCity());				
		this.accountTasks.choseStateCombobox(this.customerFake.getState());		
		this.accountTasks.fillPostCodeTextfield(this.customerFake.getPostalCode());		
		this.accountTasks.choseCountryCombobox(this.customerFake.getCountry());		
		this.accountTasks.fillMobileTextfield(this.customerFake.getMobile());		
		this.accountTasks.clickRegisterButton();		
		this.verifications.verifyAddress(customerFake);		
		this.addressTasks.clickProceedCheckoutButton();		
		this.shippingTasks.markIGreeCheckbox();
		this.shippingTasks.clickProceedCheckout();		
		this.paymentTasks.clickBankWireButton();

		this.orderSumariTasks.clickIconfirmmButton();

	}
}