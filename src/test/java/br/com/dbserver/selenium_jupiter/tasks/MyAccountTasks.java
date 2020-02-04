package br.com.dbserver.selenium_jupiter.tasks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import br.com.dbserver.selenium_jupiter.appObjects.MyAccountPageAppObject;
import br.com.dbserver.selenium_jupiter.tools.ElementsTools;

public class MyAccountTasks {
	
	private MyAccountPageAppObject accountPageAppObject;
	private WebDriver driver;
	
	public MyAccountTasks(WebDriver driver) {
		super();
		this.driver = driver;
		this.accountPageAppObject = new MyAccountPageAppObject(driver);		
	}
	
	public void markMisterRadioButton() {
		WebElement element = this.accountPageAppObject.getTitleMisterRadioButton();	
		element.click();		
	}
	
	public void markMissRadioButton() {
		WebElement element = this.accountPageAppObject.getTitleMissRadioButton();
		element.click();		
	}
	
	public void fillFirstNameTextfield(String firstName) {
		WebElement element = this.accountPageAppObject.getFirstNameTexfield(); 
		element.sendKeys(firstName);	
	}
	
	public void fillLastNameTextfield(String lastName) {
		WebElement element = this.accountPageAppObject.getLastNameTexfield();
		element.sendKeys(lastName);
	}
	
	public void fillLastEmailTextfield(String email) {
		this.accountPageAppObject.getEmailTexfield().clear();
		WebElement element =  this.accountPageAppObject.getEmailTexfield();
		element.sendKeys(email);
	}
	
	public void fillPasswordTextfield(String password) {
		WebElement element =  this.accountPageAppObject.getPasswordTexfield();
		element.sendKeys(password);
	}
	
	public void choseDaysBithdayCombobox(String day) {
		WebElement element =  this.accountPageAppObject.getDaysBithdayCombobox();
		Select select = new Select(element);
		select.selectByValue(day);
	}
	
	public void choseMonthBithdayCombobox(String month) {
		WebElement element = this.accountPageAppObject.getMonthBithdayCombobox();
		Select select = new Select(element);
		select.selectByValue(month);
	}
	
	public void choseYearComboboxCombobox(String year) {
		WebElement element = this.accountPageAppObject.getYearBithdayCombobox();
		Select select = new Select(element);
		select.selectByValue(year);
	}

	public void fillCompanyTextfield(String company) {
		WebElement element = this.accountPageAppObject.getCompanyTextfield();
		element.sendKeys(company);		
	}
	
	public void fillAddressTextfield(String address) {
		WebElement element = this.accountPageAppObject.getAddressTextfield();
		element.sendKeys(address);	
	}
	
	public void fillCityTextfield(String city) {
		WebElement element = this.accountPageAppObject.getCityTextfield();
		element.sendKeys(city);
	}
	
	public void choseStateCombobox(String state) {
		WebElement element = this.accountPageAppObject.getStateCombobox();
		Select select = new Select(element);
		select.selectByVisibleText(state);
	}
	
	public void fillPostCodeTextfield(String postCode) {
		WebElement element = this.accountPageAppObject.getPostCodeTextfield();
		element.sendKeys(postCode);
	}
	
	public void choseCountryCombobox(String country) {
		WebElement element = this.accountPageAppObject.getCountryCombobox();
		ElementsTools.highlightElement(driver, element);
		Select select = new Select(element);
		select.selectByVisibleText(country);
	}
	
	public void fillMobileTextfield(String phone) {
		WebElement element = this.accountPageAppObject.getMobileTextfield();
		element.sendKeys(phone);
	}
	
	public void clickRegisterButton() {
		WebElement element = this.accountPageAppObject.getRegisterButton();
		element.click();				
	}
}
