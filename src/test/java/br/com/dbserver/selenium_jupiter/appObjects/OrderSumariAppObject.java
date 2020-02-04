package br.com.dbserver.selenium_jupiter.appObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import br.com.dbserver.selenium_jupiter.tools.ElementsTools;

public class OrderSumariAppObject {
	private WebDriver driver;
	
	public OrderSumariAppObject(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	public WebElement getIconfirmButton() {
		WebElement element = ElementsTools.waitForElement(this.driver, By.xpath("//*[@id=\"cart_navigation\"]/button"));
		new Actions(driver).moveToElement(element).perform();
		return element;
	}

}
