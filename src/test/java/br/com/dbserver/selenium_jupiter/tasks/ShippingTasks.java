package br.com.dbserver.selenium_jupiter.tasks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import br.com.dbserver.selenium_jupiter.appObjects.ShippingAppObject;

public class ShippingTasks {
	private ShippingAppObject appObject;

	public ShippingTasks(WebDriver driver) {
		super();
		this.appObject = new ShippingAppObject(driver);
	}
	public void markIGreeCheckbox() {
		WebElement element = this.appObject.getIGreeCheckbox();
		element.click();
	}	
	public void markCarrieRadioButton() {
		WebElement element = this.appObject.getCarrierRadioButton();
		element.click();
	}		
	public void clickProceedCheckout() {
		WebElement element = this.appObject.getProceedCheckoutButton();
		element.click();
	}
}
