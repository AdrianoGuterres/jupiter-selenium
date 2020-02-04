package br.com.dbserver.selenium_jupiter.tasks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import br.com.dbserver.selenium_jupiter.appObjects.OrderAppObject;
import br.com.dbserver.selenium_jupiter.tools.ElementsTools;

public class OrderTasks {
	private OrderAppObject appObject;
	private WebDriver driver;
	
	public OrderTasks(WebDriver driver) {
		super();
		this.driver = driver;
		this.appObject = new OrderAppObject(driver);		
	}
	
	public String getProductNameLabel() {
		WebElement element = appObject.getProductNameLabel();
		ElementsTools.highlightElement(this.driver, element);
		return element.getText();
	}	
	public String getProductQtdLabel() {
		WebElement element = appObject.getProductQtdLabel(); 		
		ElementsTools.highlightElement(this.driver, element);
		return element.getAttribute("value");
	}
	public String getProductPriceLabel() {	
		WebElement element = appObject.getProductPriceLabel();
		ElementsTools.highlightElement(this.driver, element);
		return element.getText();
	}
	public String getProductPriceTotalLabel() {
		WebElement element = appObject.getProductPriceTotalLabel();
		ElementsTools.highlightElement(this.driver, element);
		return element.getText();
	}	
	
	public String getTotalAllProductsLabel() {
		WebElement element = appObject.getTotalProductsLabel();
		ElementsTools.highlightElement(this.driver, element);
		return element.getText();
	}
	public String getTotalShippingLabel() {
		WebElement element = appObject.getTotalShippinglLabel();
		ElementsTools.highlightElement(this.driver, element);
		return element.getText();
	}	
	public String getTotalTaxLabel() {
		WebElement element = appObject.getTotalTaxlLabel();
		ElementsTools.highlightElement(this.driver, element);
		return element.getText();
	}
	public String getTotalOrderLabel() {
		WebElement element = appObject.getTotalOrderLabel();
		ElementsTools.highlightElement(this.driver, element);
		return element.getText();
	}	
	public void clickProceedToCheckoutButton() {
		WebElement element = this.appObject.getProceedToCheckoutButton();
		ElementsTools.highlightElement(this.driver, element);
		element.click();
	}
	
}
