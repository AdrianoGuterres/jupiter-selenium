package br.com.dbserver.selenium_jupiter.appObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import br.com.dbserver.selenium_jupiter.tools.ElementsTools;

public class MyAccountPageAppObject {
	
	private WebDriver driver;
	
	public MyAccountPageAppObject(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	public WebElement getTitleMisterRadioButton() {		
		return ElementsTools.waitForElement(this.driver, By.id("id_gender1"));		
	}
	
	public WebElement getTitleMissRadioButton() {
		return ElementsTools.waitForElement(this.driver, By.id("id_gender2"));		
	}
	
	public WebElement getFirstNameTexfield() {
		return ElementsTools.waitForElement(this.driver, By.id("customer_firstname"));		
	}
	
	public WebElement getLastNameTexfield() {
		return ElementsTools.waitForElement(this.driver, By.id("customer_lastname"));		
	}
	
	public WebElement getEmailTexfield() {
		return ElementsTools.waitForElement(this.driver, By.id("email"));		
	}
	
	public WebElement getPasswordTexfield() {
		return ElementsTools.waitForElement(this.driver, By.id("passwd"));		
	}
	
	public WebElement getDaysBithdayCombobox() {
		return this.driver.findElement(By.id("days"));
	}
	
	public WebElement getMonthBithdayCombobox() {
		return this.driver.findElement(By.id("months"));		
	}
	
	public WebElement getYearBithdayCombobox() {
		return this.driver.findElement(By.id("years"));		
	}
	
	public WebElement getCompanyTextfield() {
		return ElementsTools.waitForElement(this.driver, By.id("company"));		
	}
	
	public WebElement getAddressTextfield() {
		return ElementsTools.waitForElement(this.driver, By.id("address1"));		
	}
	
	public WebElement getCityTextfield() {
		return ElementsTools.waitForElement(this.driver, By.id("city"));		
	}
	
	public WebElement getStateCombobox() {
		return this.driver.findElement(By.id("id_state"));		
	}
	
	public WebElement getPostCodeTextfield() {
		return ElementsTools.waitForElement(this.driver, By.id("postcode"));		
	}
	
	public WebElement getCountryCombobox() {
		return this.driver.findElement(By.id("id_country"));		
	}
	
	public WebElement getMobileTextfield() {
		return ElementsTools.waitForElement(this.driver, By.id("phone_mobile"));		
	}
	
	public WebElement getRegisterButton() {
		return ElementsTools.waitForElement(this.driver, By.id("submitAccount"));		
	}
	

}
