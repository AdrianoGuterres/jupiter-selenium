package br.com.dbserver.selenium_jupiter.appObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import br.com.dbserver.selenium_jupiter.tools.ElementsTools;

public class PaymentAppObject {
	WebDriver driver;
	
	public PaymentAppObject(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getBankWireButton() {
		WebElement element = ElementsTools.waitForElement(this.driver, By.partialLinkText("Pay by bank wire"));		
		new Actions(driver).moveToElement(element).perform();
		return element;
	}
	
	public WebElement getTotalPriceLabel() {
		WebElement element = ElementsTools.waitForElement(this.driver, By.id("total_price_container"));		
		new Actions(driver).moveToElement(element).perform();
		return element;
	}

}
