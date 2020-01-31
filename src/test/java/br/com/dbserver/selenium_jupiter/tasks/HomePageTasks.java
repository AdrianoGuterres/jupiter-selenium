package br.com.dbserver.selenium_jupiter.tasks;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import br.com.dbserver.selenium_jupiter.appObjects.HomePageAppObject;
import br.com.dbserver.selenium_jupiter.tools.ElementsTools;

public class HomePageTasks {

	private HomePageAppObject appObject;
	private WebDriver driver;

	public HomePageTasks(WebDriver driver) {
		super();
		this.appObject = new HomePageAppObject(driver);		
		this.driver	   = driver;
	}

	public void clickSingInButton() {
		WebElement element = this.appObject.getSignInButton();
		ElementsTools.highlightElement(driver, element);	
		element.click();
	}

	public void selectItemMenu() {
		WebElement element = this.appObject.getTitlesMenu();
		ElementsTools.highlightElement(driver, element);
		element.click();
	}
	
	public void chooseFirstItemBlock() {
		WebElement element = this.appObject.getFirstItemBlock();
		ElementsTools.highlightElement(driver, element);
		element.click();
	}
	
	public void clickFirstItemBlock() {
		WebElement element = this.appObject.getFirstItemBlock();
		ElementsTools.highlightElement(driver, element);
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
	}	
}
