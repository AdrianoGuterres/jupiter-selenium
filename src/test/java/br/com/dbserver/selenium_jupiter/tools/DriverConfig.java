package br.com.dbserver.selenium_jupiter.tools;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverConfig {
	
	public static WebDriver getWebdriverChrome(String url) {		
		WebDriverManager.chromedriver().setup();		
		WebDriver driver = new ChromeDriver();		
		driver.manage().window().maximize();		
		driver.get(url);		
		return driver;
	} 

}


