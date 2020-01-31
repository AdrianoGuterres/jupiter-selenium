package br.com.dbserver.selenium_jupiter.appObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import br.com.dbserver.selenium_jupiter.tools.ElementsTools;

public class AddressAppObject {
	private WebDriver driver;
	
	public AddressAppObject(WebDriver driver) {
		super();
		this.driver = driver;			
	}
	
	public WebElement getAddressNameLabel() {
		return ElementsTools.waitForElement(this.driver, By.xpath("//*[@id=\"address_delivery\"]/li[2]"));
	}
	
	public WebElement getCompanyLabel() {
		return ElementsTools.waitForElement(this.driver, By.xpath("//*[@id=\"address_delivery\"]/li[3]"));
	}
	
	public WebElement getAddressLabel() {
		return ElementsTools.waitForElement(this.driver, By.xpath("//*[@id=\"address_delivery\"]/li[4]"));
	}
	
	public WebElement getCityStatePostCodeLabel() {
		return ElementsTools.waitForElement(this.driver, By.xpath("//*[@id=\"address_delivery\"]/li[5]"));
	}
	
	public WebElement getCountryLabel() {
		return ElementsTools.waitForElement(this.driver, By.xpath("//*[@id=\"address_delivery\"]/li[6]"));
	}
	
	public WebElement getMobileLabel() {
		return ElementsTools.waitForElement(this.driver, By.xpath("//*[@id=\"address_delivery\"]/li[7]"));
	}
	
	public WebElement getProceedCheckoutButton() {
		return ElementsTools.waitForElement(this.driver, By.name("processAddress"));
	}

}
