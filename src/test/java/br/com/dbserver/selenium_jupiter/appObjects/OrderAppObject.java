package br.com.dbserver.selenium_jupiter.appObjects;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import br.com.dbserver.selenium_jupiter.tools.ElementsTools;

public class OrderAppObject {
	
	private WebDriver driver;
	
	public OrderAppObject(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	public WebElement getProductNameLabel() {
		WebElement table = ElementsTools.waitForElement(this.driver, By.cssSelector("#cart_summary > tbody"));	
		ArrayList<WebElement> td = new ArrayList<WebElement>();
		td.addAll( table.findElements(By.cssSelector("td")));	
		return td.get(1);
	}
	
	public WebElement getProductQtdLabel() {
		WebElement table = ElementsTools.waitForElement(this.driver,By.id("cart_summary"));	
		ArrayList<WebElement> rows = new ArrayList<WebElement>();
		rows.addAll( table.findElements(By.xpath("//*[@id=\"cart_summary\"]/tbody")));			
		ArrayList<WebElement> elements = (ArrayList<WebElement>) rows.get(0).findElements(By.cssSelector("td"));
		return elements.get(4).findElement(By.cssSelector("input"));
	}
	
	public WebElement getProductPriceLabel() {				
		WebElement table = ElementsTools.waitForElement(this.driver, By.id("cart_summary"));	
		ArrayList<WebElement> rows = new ArrayList<WebElement>();
		rows.addAll( table.findElements(By.xpath("//*[@id=\"cart_summary\"]/tbody")));			
		ArrayList<WebElement> elements = (ArrayList<WebElement>) rows.get(0).findElements(By.cssSelector("td"));				
		return elements.get(3);
	}
	
	public WebElement getProductPriceTotalLabel() {				
		WebElement table = ElementsTools.waitForElement(this.driver, By.id("cart_summary"));	
		ArrayList<WebElement> rows = new ArrayList<WebElement>();
		rows.addAll( table.findElements(By.xpath("//*[@id=\"cart_summary\"]/tbody")));			
		ArrayList<WebElement> elements = (ArrayList<WebElement>) rows.get(0).findElements(By.cssSelector("td"));				
		return elements.get(5);
	}	
	
	public WebElement getTotalProductsLabel() {			
		return ElementsTools.waitForElement(this.driver, By.id("total_product"));
	}
	
	public WebElement getTotalShippinglLabel() {			
		return ElementsTools.waitForElement(this.driver, By.id("total_shipping"));		
	}
		
	public WebElement getTotalTaxlLabel() {			
		return ElementsTools.waitForElement(this.driver, By.id("total_tax"));		
	}	
	
	public WebElement getTotalOrderLabel() {			
		return ElementsTools.waitForElement(this.driver, By.id("total_price_container"));
	}
	
	
	
	
	
	
	
	
	
	public WebElement getProceedToCheckoutButton() {
		return this.driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]"));
	}
	
}
