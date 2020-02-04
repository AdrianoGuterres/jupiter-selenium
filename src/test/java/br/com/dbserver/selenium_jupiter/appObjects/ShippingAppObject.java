package br.com.dbserver.selenium_jupiter.appObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import br.com.dbserver.selenium_jupiter.tools.ElementsTools;

public class ShippingAppObject {
	
	private WebDriver driver;
	
	public ShippingAppObject(WebDriver driver){
		super();
		this.driver = driver;		
	}	
	
	public WebElement getIGreeCheckbox() {
		WebElement element = this.driver.findElement(By.id("cgv"));
		new Actions(driver).moveToElement(element).perform();
		return element;
		
	}
	
	public WebElement getCarrierRadioButton() {
		WebElement element = this.driver.findElement(By.id("uniform-delivery_option_263513_0"));
		new Actions(driver).moveToElement(element).perform();
		return element;
	}
	
	public WebElement getProceedCheckoutButton() {
		WebElement element = ElementsTools.waitForElement(this.driver, By.xpath("//*[@id=\"form\"]/p/button"));
		new Actions(driver).moveToElement(element).perform();
		return element;
	}
	

}
