package br.com.dbserver.selenium_jupiter.tasks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import br.com.dbserver.selenium_jupiter.appObjects.PaymentAppObject;

public class PaymentTasks {
	private PaymentAppObject appObject;
	
	public PaymentTasks(WebDriver driver) {
		super();
		this.appObject = new PaymentAppObject(driver);		
	}
	
	public void clickBankWireButton() {
		WebElement element = this.appObject.getBankWireButton();
		element.click();
	}	
	

}
