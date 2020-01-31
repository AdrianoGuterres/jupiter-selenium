package br.com.dbserver.selenium_jupiter.testSuite;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

import br.com.dbserver.selenium_jupiter.tools.Report;


@RunWith(JUnitPlatform.class)
@SelectPackages("br.com.dbserver.selenium_jupiter.testCases") 
public class AllUnitTest {
	@BeforeClass
	public static void start() {
		Report.create("automationpractice-com", "Test Case");		
	}
	
	@AfterClass
	public static void tearDown() {		
		Report.close();		
	}
}