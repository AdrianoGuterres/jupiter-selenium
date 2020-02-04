package br.com.dbserver.selenium_jupiter.tasks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import br.com.dbserver.selenium_jupiter.appObjects.OrderSumariAppObject;

public class OrderSumariTasks {
	
	private OrderSumariAppObject appObject ;
	
	public OrderSumariTasks(WebDriver driver) {
		super();
		this.appObject = new OrderSumariAppObject(driver);
	}
	
	public void clickIconfirmmButton() {
		WebElement element = this.appObject.getIconfirmButton();
		element.click();
	}

}
