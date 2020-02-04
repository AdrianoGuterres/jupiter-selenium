package br.com.dbserver.selenium_jupiter.appObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import br.com.dbserver.selenium_jupiter.tools.ElementsTools;

public class AddressAppObject {
	private WebDriver driver;
	
	public AddressAppObject(WebDriver driver) {
		super();
		this.driver = driver;			
	}
	
	public WebElement getAddressNameLabel() {
		WebElement element = ElementsTools.waitForElement(this.driver, By.xpath("//*[@id=\"address_delivery\"]/li[2]"));
		new Actions(driver).moveToElement(element).perform();
		return element;
	}
	
	public WebElement getCompanyLabel() {
		WebElement element = ElementsTools.waitForElement(this.driver, By.xpath("//*[@id=\"address_delivery\"]/li[3]"));
		new Actions(driver).moveToElement(element).perform();
		return element;
	}
	
	public WebElement getAddressLabel() {
		WebElement element = ElementsTools.waitForElement(this.driver, By.xpath("//*[@id=\"address_delivery\"]/li[4]"));
		new Actions(driver).moveToElement(element).perform();
		return element;
	}
	
	public WebElement getCityStatePostCodeLabel() {
		WebElement element = ElementsTools.waitForElement(this.driver, By.xpath("//*[@id=\"address_delivery\"]/li[5]"));
		new Actions(driver).moveToElement(element).perform();
		return element;
	}
	
	
	public WebElement getCountryLabel() {
		WebElement element = ElementsTools.waitForElement(this.driver, By.xpath("//*[@id=\"address_delivery\"]/li[6]"));
		new Actions(driver).moveToElement(element).perform();
		return element;
	}
	
	public WebElement getMobileLabel() {
		WebElement element = ElementsTools.waitForElement(this.driver, By.xpath("//*[@id=\"address_delivery\"]/li[7]"));
		new Actions(driver).moveToElement(element).perform();
		return element;
	}
	
	public WebElement getProceedCheckoutButton() {
		WebElement element = ElementsTools.waitForElement(this.driver, By.name("processAddress"));
		new Actions(driver).moveToElement(element).perform();
		return element;
	}

}
