package br.com.dbserver.selenium_jupiter.tools;

import java.io.IOException;
import java.net.InetAddress;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Report { 
	
	private static ExtentReports extentReport;
	private static ExtentTest extentTest;

	public static void create(String title, String description) {		
		String date = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MMM-yyyy_HH-mm"));
		String name = title.replace(" ", "_");		
		String path = "./reports/"+name+"__"+date+".html";		
		
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(String.format(path, LocalDateTime.now().getNano()));
		
		htmlReporter.config().setDocumentTitle(title); 
		htmlReporter.config().setReportName(description);
		htmlReporter.config().setTheme(Theme.DARK);
		htmlReporter.config().setEncoding("UTF-8");
		htmlReporter.config().setTimeStampFormat("dd-MMM-yyyy HH:mm:ss");
		

		extentReport = new ExtentReports();		
		extentReport.attachReporter(htmlReporter);		
		
		extentReport.setSystemInfo("OS: "             , System.getProperty("os.name"));
		extentReport.setSystemInfo("OS Version: "     , System.getProperty("os.version"));
		extentReport.setSystemInfo("OS Architecture:" , System.getProperty("os.arch"));
		extentReport.setSystemInfo("Java Version: "   , System.getProperty("java.version"));		
		try {extentReport.setSystemInfo("IP Address: ", InetAddress.getLocalHost().getHostAddress());} catch (Exception e) {System.err.println(e +"  "+ e.getMessage());}
	}

	public static void startTest(String testDescription) {
		if(extentReport == null) {
			create("DBServer Testes Automatizados de Interface", testDescription);
		}
		extentTest = extentReport.createTest(testDescription);
	}	

	public static void log(Status logStatus, String message, WebDriver driver) {		
		try {
			if(extentTest == null) {
				startTest("DBServer Testes Automatizados de Interface");
			}
			String base64String = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BASE64);
			extentTest.log(logStatus, message, MediaEntityBuilder.createScreenCaptureFromBase64String(base64String).build());
		} catch (IOException ex) {
			extentTest.log(logStatus, message + " (Screenshot fail)");
		}
	}	

	public static void log(Status logStatus, String message) {		
		if(extentTest == null) {
			startTest("DBServer Testes Automatizados de Interface");
		}
		extentTest.log(logStatus, message);
	}

	public static void close() {
		if(extentReport != null) {
			extentReport.flush();
		} else {
			startTest("The test passed!");
			log(Status.INFO, "The tests ended.");
			close();
		}
	}	
}
