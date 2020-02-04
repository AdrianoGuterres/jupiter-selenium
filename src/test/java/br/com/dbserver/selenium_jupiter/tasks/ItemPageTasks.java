package br.com.dbserver.selenium_jupiter.tasks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import br.com.dbserver.selenium_jupiter.appObjects.ItemPageAppObject;

public class ItemPageTasks {
	private ItemPageAppObject appObject;

	public ItemPageTasks(WebDriver driver) {
		super();
		this.appObject = new  ItemPageAppObject(driver);
	}	
	
	public String getProductPriceLabel() {
		WebElement element = this.appObject.getProductPriceLabel();
		return element.getText();	
	}
	public String getProductNameLabel() {
		WebElement element =  this.appObject.getProductNameLabel();
		return element.getText();
	}
	public String getProductQtdLabel() {
		WebElement element = this.appObject.getProductQtdLabel();
		return element.getText();
	}
	
	public void clickAddCartButton() {
		WebElement element = this.appObject.getAddCartButton();
		element.click();	
	}
	public void clickProceedCheckoutButton() {
		WebElement element = this.appObject.getProceedToCheckoutButton();
		element.click();
	}	
}