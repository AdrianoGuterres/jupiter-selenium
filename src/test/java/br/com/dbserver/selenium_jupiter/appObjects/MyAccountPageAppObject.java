package br.com.dbserver.selenium_jupiter.appObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import br.com.dbserver.selenium_jupiter.tools.ElementsTools;

public class MyAccountPageAppObject {
	
	private WebDriver driver;
	
	public MyAccountPageAppObject(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	public WebElement getTitleMisterRadioButton() {		
		WebElement element = ElementsTools.waitForElement(this.driver, By.id("id_gender1"));	
		new Actions(driver).moveToElement(element).perform();
		return element;
	}
	
	public WebElement getTitleMissRadioButton() {
		WebElement element = ElementsTools.waitForElement(this.driver, By.id("id_gender2"));		
		new Actions(driver).moveToElement(element).perform();
		return element;
	}
	
	public WebElement getFirstNameTexfield() {
		WebElement element = ElementsTools.waitForElement(this.driver, By.id("customer_firstname"));
		new Actions(driver).moveToElement(element).perform();
		return element;
	}
	
	public WebElement getLastNameTexfield() {
		WebElement element = ElementsTools.waitForElement(this.driver, By.id("customer_lastname"));		
		new Actions(driver).moveToElement(element).perform();
		return element;
	}
	
	public WebElement getEmailTexfield() {
		WebElement element = ElementsTools.waitForElement(this.driver, By.id("email"));		
		new Actions(driver).moveToElement(element).perform();
		return element;
	}
	
	public WebElement getPasswordTexfield() {
		WebElement element = ElementsTools.waitForElement(this.driver, By.id("passwd"));	
		new Actions(driver).moveToElement(element).perform();
		return element;
	}
	
	public WebElement getDaysBithdayCombobox() {
		WebElement element = this.driver.findElement(By.id("days"));
		new Actions(driver).moveToElement(element).perform();
		return element;
	}
	
	public WebElement getMonthBithdayCombobox() {
		WebElement element = this.driver.findElement(By.id("months"));		
		new Actions(driver).moveToElement(element).perform();
		return element;
	}
	
	public WebElement getYearBithdayCombobox() {
		WebElement element = this.driver.findElement(By.id("years"));		
		new Actions(driver).moveToElement(element).perform();
		return element;
	}
	
	public WebElement getCompanyTextfield() {
		WebElement element = ElementsTools.waitForElement(this.driver, By.id("company"));
		new Actions(driver).moveToElement(element).perform();
		return element;
	}
	
	public WebElement getAddressTextfield() {
		WebElement element = ElementsTools.waitForElement(this.driver, By.id("address1"));		
		new Actions(driver).moveToElement(element).perform();
		return element;
	}
	
	public WebElement getCityTextfield() {
		WebElement element = ElementsTools.waitForElement(this.driver, By.id("city"));		
		new Actions(driver).moveToElement(element).perform();
		return element;
	}
	
	public WebElement getStateCombobox() {
		WebElement element = this.driver.findElement(By.id("id_state"));	
		new Actions(driver).moveToElement(element).perform();
		return element;
	}
	
	public WebElement getPostCodeTextfield() {
		WebElement element = ElementsTools.waitForElement(this.driver, By.id("postcode"));		
		new Actions(driver).moveToElement(element).perform();
		return element;
	}
	
	public WebElement getCountryCombobox() {
		WebElement element = this.driver.findElement(By.id("id_country"));		
		new Actions(driver).moveToElement(element).perform();
		return element;
	}
	
	public WebElement getMobileTextfield() {
		WebElement element = ElementsTools.waitForElement(this.driver, By.id("phone_mobile"));	
		new Actions(driver).moveToElement(element).perform();
		return element;
	}
	
	public WebElement getRegisterButton() {
		WebElement element = ElementsTools.waitForElement(this.driver, By.id("submitAccount"));		
		new Actions(driver).moveToElement(element).perform();
		return element;
	}
	

}
