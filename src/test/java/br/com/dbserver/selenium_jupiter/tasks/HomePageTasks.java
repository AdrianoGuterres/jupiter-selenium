package br.com.dbserver.selenium_jupiter.tasks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import br.com.dbserver.selenium_jupiter.appObjects.HomePageAppObject;

public class HomePageTasks {

	private HomePageAppObject appObject;

	public HomePageTasks(WebDriver driver) {
		super();
		this.appObject = new HomePageAppObject(driver);		
	}

	public void clickSingInButton() {
		WebElement element = this.appObject.getSignInButton();
		element.click();
	}
	public void selectItemMenu() {
		WebElement element = this.appObject.getTitlesMenu();
		element.click();
	}
	
	
	public void chooseFirstItemBlock() {
		WebElement element = this.appObject.getFirstItemBlock();
		element.click();
	}
	
	public void clickFirstItemBlock() {
		WebElement element = this.appObject.getFirstItemBlock();
		element.click();
	}	
}
