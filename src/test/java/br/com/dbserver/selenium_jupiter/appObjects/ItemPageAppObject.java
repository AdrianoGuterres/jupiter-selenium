package br.com.dbserver.selenium_jupiter.appObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import br.com.dbserver.selenium_jupiter.tools.ElementsTools;

public class ItemPageAppObject {

	private WebDriver driver;	

	public ItemPageAppObject(WebDriver driver) {
		super();
		this.driver = driver;
	}	
	
	public WebElement getProductPriceLabel() {
		return ElementsTools.waitForElement(this.driver, By.id("our_price_display"));
	}	
	public WebElement getProductNameLabel() {
		return ElementsTools.waitForElement(this.driver, By.xpath("//*[@id=\"center_column\"]/div/div/div[3]/h1"));
	}
	public WebElement getProductQtdLabel() {
		return ElementsTools.waitForElement(this.driver, By.id("quantity_wanted"));
	}
	
	public WebElement getAddCartButton() {
		return ElementsTools.waitForElement(this.driver, By.id("add_to_cart")); 
	}	
	public WebElement getProceedToCheckoutButton() {
		return ElementsTools.waitForElement(this.driver, By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a"));
	}		
}
