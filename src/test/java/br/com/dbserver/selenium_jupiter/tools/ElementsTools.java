package br.com.dbserver.selenium_jupiter.tools;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementsTools {

	public static WebElement waitForElement(WebDriver driver, By locator) {
		WebDriverWait wait = new WebDriverWait(driver, 30); 
		return wait.until(ExpectedConditions.elementToBeClickable(locator));		
	}	
	
	public static void highlightElement(WebDriver driver, WebElement element){
		new Actions(driver).moveToElement(element);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		((JavascriptExecutor)driver).executeScript("arguments[0].style.border='2px solid red'", element);		
	}
	
	public static void unHighlightElement(WebDriver driver){ 
		((JavascriptExecutor)driver).executeScript("arguments[0].style.border=''", driver.findElement(By.tagName("body")));	
	}
	

}
