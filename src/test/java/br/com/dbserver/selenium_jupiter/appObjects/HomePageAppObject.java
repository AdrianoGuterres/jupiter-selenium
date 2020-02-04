package br.com.dbserver.selenium_jupiter.appObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import br.com.dbserver.selenium_jupiter.tools.ElementsTools;

public class HomePageAppObject {
	
	private WebDriver driver;
	
	public HomePageAppObject(WebDriver driver) {
		super();
		setDriver(driver);
	}
	public WebDriver getDriver() {
		return driver;
	}
	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}	
	public WebElement getSignInButton() {		
		WebElement element = ElementsTools.waitForElement(this.driver, By.className("login"));
		new Actions(driver).moveToElement(element).perform();
		return element;
	}
	
	public WebElement getTitlesMenu() {		
		WebElement element = ElementsTools.waitForElement(this.driver, By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/a"));
		new Actions(driver).moveToElement(element).perform();
		return element;
	}	
	public WebElement getFirstItemBlock() {
		WebElement element = ElementsTools.waitForElement(this.driver, By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/h5"));
		return element;
	}		
	public WebElement getFrame0SubmitButton() {
		WebElement element = ElementsTools.waitForElement(this.driver, By.tagName("Submit"));	
		new Actions(driver).moveToElement(element).perform();
		return element;
	}	
}
