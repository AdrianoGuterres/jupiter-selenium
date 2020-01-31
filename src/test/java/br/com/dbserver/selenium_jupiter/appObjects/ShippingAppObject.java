package br.com.dbserver.selenium_jupiter.appObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import br.com.dbserver.selenium_jupiter.tools.ElementsTools;

public class ShippingAppObject {
	
	private WebDriver driver;
	
	public ShippingAppObject(WebDriver driver){
		super();
		this.driver = driver;		
	}	
	
	public WebElement getIGreeCheckbox() {
		return this.driver.findElement(By.id("cgv"));
	}
	
	public WebElement getCarrierRadioButton() {
		return this.driver.findElement(By.id("uniform-delivery_option_263513_0"));
	}
	
	public WebElement getProceedCheckoutButton() {
		return ElementsTools.waitForElement(this.driver, By.xpath("//*[@id=\"form\"]/p/button"));
	}
	

}
