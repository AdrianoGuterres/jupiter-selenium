package br.com.dbserver.selenium_jupiter.tasks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import br.com.dbserver.selenium_jupiter.appObjects.AddressAppObject;

public class AddressTasks {
	
	private AddressAppObject addressAppObject;
	private WebDriver driver;
	
	public AddressTasks(WebDriver driver) {
		super();
		this.driver = driver;
		this.addressAppObject = new AddressAppObject(driver);		
	}
	
	public String getAddressNameLabel() {		
		WebElement element = this.addressAppObject.getAddressNameLabel();
		new Actions(driver).moveToElement(element).perform();
		return element.getText();
	}
	
	public String getCompanyLabel() {
		WebElement element = this.addressAppObject.getCompanyLabel();
		new Actions(driver).moveToElement(element).perform();
		return element.getText();		
	}
	
	public String getAddressLabel() {
		WebElement element = this.addressAppObject.getAddressLabel(); 
		new Actions(driver).moveToElement(element).perform();
		return element.getText();
	}
	
	public String getCityStatePostCodeLabel() {
		WebElement element = this.addressAppObject.getCityStatePostCodeLabel();
		new Actions(driver).moveToElement(element).perform();
		return element.getText();
	}
	
	public String getCountryLabel() {
		WebElement element = this.addressAppObject.getCountryLabel();
		new Actions(driver).moveToElement(element).perform();
		return element.getText();
	}
	
	public String getMobileLabel() {
		WebElement element = this.addressAppObject.getMobileLabel();
		new Actions(driver).moveToElement(element).perform();
		return element.getText();
	}
	
	public void clickProceedCheckoutButton() {
		WebElement element = this.addressAppObject.getProceedCheckoutButton();
		new Actions(driver).moveToElement(element).perform();
		element.click();
	}
}
