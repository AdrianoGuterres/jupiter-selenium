package br.com.dbserver.selenium_jupiter.appObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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
		return ElementsTools.waitForElement(this.driver, By.className("login"));
	}
	public WebElement getTitlesMenu() {		
		return ElementsTools.waitForElement(this.driver, By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/a"));
	}	
	public WebElement getFirstItemBlock() {
		return ElementsTools.waitForElement(this.driver, By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[1]/div/a[1]/img"));
	}		
	public WebElement getFrame0SubmitButton() {
		return ElementsTools.waitForElement(this.driver, By.tagName("Submit"));		
	}	
}
