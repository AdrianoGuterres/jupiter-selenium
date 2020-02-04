package br.com.dbserver.selenium_jupiter.appObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import br.com.dbserver.selenium_jupiter.tools.ElementsTools;

public class ItemPageAppObject {

	private WebDriver driver;	

	public ItemPageAppObject(WebDriver driver) {
		super();
		this.driver = driver;
	}	
	
	public WebElement getProductPriceLabel() {
		WebElement element = ElementsTools.waitForElement(this.driver, By.id("our_price_display"));
		new Actions(driver).moveToElement(element).perform();
		return element;
	}	
	public WebElement getProductNameLabel() {
		WebElement element = ElementsTools.waitForElement(this.driver, By.xpath("//*[@id=\"center_column\"]/div/div/div[3]/h1"));
		new Actions(driver).moveToElement(element).perform();
		return element;
	}
	public WebElement getProductQtdLabel() {
		WebElement element = ElementsTools.waitForElement(this.driver, By.id("quantity_wanted"));
		new Actions(driver).moveToElement(element).perform();
		return element;
	}
	
	public WebElement getAddCartButton() {
		WebElement element = ElementsTools.waitForElement(this.driver, By.id("add_to_cart")); 
		new Actions(driver).moveToElement(element).perform();
		return element;
	}	
	public WebElement getProceedToCheckoutButton() {
		WebElement element = ElementsTools.waitForElement(this.driver, By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a"));
		new Actions(driver).moveToElement(element).perform();
		return element;
	}		
}
