package br.com.dbserver.selenium_jupiter.tasks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import br.com.dbserver.selenium_jupiter.appObjects.OrderSumariAppObject;
import br.com.dbserver.selenium_jupiter.tools.ElementsTools;

public class OrderSumariTasks {
	
	private OrderSumariAppObject appObject ;
	private WebDriver driver;
	
	public OrderSumariTasks(WebDriver driver) {
		super();
		this.driver = driver;
		this.appObject = new OrderSumariAppObject(driver);
	}
	
	public void clickIconfirmmButton() {
		WebElement element = this.appObject.getIconfirmButton();
		ElementsTools.highlightElement(driver, element);
		element.click();
	}

}
