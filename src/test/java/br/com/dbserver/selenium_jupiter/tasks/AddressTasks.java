package br.com.dbserver.selenium_jupiter.tasks;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import br.com.dbserver.selenium_jupiter.appObjects.AddressAppObject;
import br.com.dbserver.selenium_jupiter.tools.ElementsTools;

public class AddressTasks {
	
	private AddressAppObject addressAppObject;
	private WebDriver 		 driver;
	
	public AddressTasks(WebDriver driver) {
		super();
		this.driver = driver;
		this.addressAppObject = new AddressAppObject(driver);		
	}
	
	public String getAddressNameLabel() {
		WebElement element = this.addressAppObject.getAddressNameLabel();
		ElementsTools.highlightElement(driver, element);	
		//ElementsTools.unHighlightElement(driver, element);	
		return element.getText();
	}
	
	public String getCompanyLabel() {
		WebElement element = this.addressAppObject.getCompanyLabel();
		element.sendKeys(Keys.SHIFT);
		ElementsTools.highlightElement(driver, element);	
		//ElementsTools.unHighlightElement(driver, element);	
		return element.getText();		
	}
	
	public String getAddressLabel() {
		WebElement element = this.addressAppObject.getAddressLabel(); 
		element.sendKeys(Keys.SHIFT);
		ElementsTools.highlightElement(driver, element);
		//ElementsTools.unHighlightElement(driver, element);	
		return element.getText();
	}
	
	public String getCityStatePostCodeLabel() {
		WebElement element = this.addressAppObject.getCityStatePostCodeLabel();
		element.sendKeys(Keys.SHIFT);
		ElementsTools.highlightElement(driver, element);
		//ElementsTools.unHighlightElement(driver, element);	
		return element.getText();
	}
	
	public String getCountryLabel() {
		WebElement element = this.addressAppObject.getCountryLabel();
		element.sendKeys(Keys.SHIFT);
		ElementsTools.highlightElement(driver, element);
		//ElementsTools.unHighlightElement(driver, element);	
		return element.getText();
	}
	
	public String getMobileLabel() {
		WebElement element = this.addressAppObject.getMobileLabel();
		element.sendKeys(Keys.SHIFT);
		ElementsTools.highlightElement(driver, element);
		//ElementsTools.unHighlightElement(driver, element);	
		return element.getText();
	}
	
	public void clickProceedCheckoutButton() {
		WebElement element = this.addressAppObject.getProceedCheckoutButton();
		element.sendKeys(Keys.SHIFT);
		ElementsTools.highlightElement(driver, element);
		//ElementsTools.unHighlightElement(driver, element);	
		element.click();
	}
}
