package br.com.dbserver.selenium_jupiter.tasks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import br.com.dbserver.selenium_jupiter.appObjects.PaymentAppObject;
import br.com.dbserver.selenium_jupiter.tools.ElementsTools;

public class PaymentTasks {
	private PaymentAppObject appObject;
	private WebDriver driver;
	
	public PaymentTasks(WebDriver driver) {
		super();
		this.driver = driver;
		this.appObject = new PaymentAppObject(driver);		
	}
	
	public void clickBankWireButton() {
		WebElement element = this.appObject.getBankWireButton();
		ElementsTools.highlightElement(driver, element);
		element.click();
	}	
	

}
