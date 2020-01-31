package br.com.dbserver.selenium_jupiter.tasks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import br.com.dbserver.selenium_jupiter.appObjects.ShippingAppObject;
import br.com.dbserver.selenium_jupiter.tools.ElementsTools;

public class ShippingTasks {
	private ShippingAppObject appObject;
	private WebDriver driver;

	public ShippingTasks(WebDriver driver) {
		super();
		this.driver = driver;
		this.appObject = new ShippingAppObject(driver);
	}

	public void markIGreeCheckbox() {
		WebElement element = this.appObject.getIGreeCheckbox();
		ElementsTools.highlightElement(driver, element);
		element.click();
	}
	
	public void markCarrieRadioButton() {
		WebElement element = this.appObject.getCarrierRadioButton();
		ElementsTools.highlightElement(driver, element);
		element.click();
	}	
	
	public void clickProceedCheckout() {
		WebElement element = this.appObject.getProceedCheckoutButton();
		ElementsTools.highlightElement(driver, element);
		element.click();
	}

}
