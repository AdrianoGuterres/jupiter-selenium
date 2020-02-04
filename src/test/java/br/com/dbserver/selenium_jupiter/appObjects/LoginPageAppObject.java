package br.com.dbserver.selenium_jupiter.appObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import br.com.dbserver.selenium_jupiter.tools.ElementsTools;

public class LoginPageAppObject {
	
	private WebDriver driver;

	public LoginPageAppObject(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	public WebElement getEmailAddressTextfield() {		
		WebElement element = ElementsTools.waitForElement(this.driver, By.id("email_create"));
		new Actions(driver).moveToElement(element).perform();
		return element;
	}	
	
	public WebElement getCreateAccountButton() {		
		WebElement element = ElementsTools.waitForElement(this.driver, By.name("SubmitCreate"));
		new Actions(driver).moveToElement(element).perform();
		return element;
	}

}
