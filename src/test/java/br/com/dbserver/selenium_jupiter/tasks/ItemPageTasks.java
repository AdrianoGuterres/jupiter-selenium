package br.com.dbserver.selenium_jupiter.tasks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import br.com.dbserver.selenium_jupiter.appObjects.ItemPageAppObject;
import br.com.dbserver.selenium_jupiter.tools.ElementsTools;

public class ItemPageTasks {
	private ItemPageAppObject appObject;
	private WebDriver driver;

	public ItemPageTasks(WebDriver driver) {
		super();
		this.driver = driver;
		this.appObject = new  ItemPageAppObject(driver);
	}	
	
	public String getProductPriceLabel() {
		WebElement element = this.appObject.getProductPriceLabel();
		ElementsTools.highlightElement(driver, element);
		return element.getText();	
	}
	public String getProductNameLabel() {
		WebElement element =  this.appObject.getProductNameLabel();
		ElementsTools.highlightElement(driver, element);
		return element.getText();
	}
	public String getProductQtdLabel() {
		WebElement element = this.appObject.getProductQtdLabel();
		ElementsTools.highlightElement(driver, element);
		return element.getText();
	}
	
	public void clickAddCartButton() {
		WebElement element = this.appObject.getAddCartButton();
		ElementsTools.highlightElement(driver, element);
		element.click();	
	}
	public void clickProceedCheckoutButton() {
		WebElement element = this.appObject.getProceedToCheckoutButton();
		ElementsTools.highlightElement(driver, element);
		element.click();
	}	
}