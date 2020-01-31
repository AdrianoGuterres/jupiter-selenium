package br.com.dbserver.selenium_jupiter.appObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import br.com.dbserver.selenium_jupiter.tools.ElementsTools;

public class LoginPageAppObject {
	
	private WebDriver driver;

	public LoginPageAppObject(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	public WebElement getEmailAddressTextfield() {		
		return ElementsTools.waitForElement(this.driver, By.id("email_create"));
	}	
	
	public WebElement getCreateAccountButton() {		
		return ElementsTools.waitForElement(this.driver, By.name("SubmitCreate"));
	}

}
