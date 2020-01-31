package br.com.dbserver.selenium_jupiter.tasks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import br.com.dbserver.selenium_jupiter.appObjects.LoginPageAppObject;
import br.com.dbserver.selenium_jupiter.tools.ElementsTools;

public class LoginPageTasks {
	
	private LoginPageAppObject appObject;
	private WebDriver driver;

	public LoginPageTasks(WebDriver driver) {
		super();
		this.driver = driver;
		this.appObject = new LoginPageAppObject(driver);
	}
	
	public void fillEmailAddressTextfield(String email) {
		WebElement element = this.appObject.getEmailAddressTextfield();
		ElementsTools.highlightElement(driver, element);
		element.sendKeys(email);		
	}
	
	public void clickCreateAccountButton() {		
		WebElement element = this.appObject.getCreateAccountButton();
		ElementsTools.highlightElement(driver, element);
		element.click();		
	}
}
