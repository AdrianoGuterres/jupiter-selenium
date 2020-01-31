package br.com.dbserver.selenium_jupiter.appObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import br.com.dbserver.selenium_jupiter.tools.ElementsTools;

public class PaymentAppObject {
	WebDriver driver;
	
	public PaymentAppObject(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getBankWireButton() {
		return ElementsTools.waitForElement(this.driver, By.partialLinkText("Pay by bank wire"));		
	}
	
	public WebElement getTotalPriceLabel() {
		return ElementsTools.waitForElement(this.driver, By.id("total_price_container"));		
	}

}
