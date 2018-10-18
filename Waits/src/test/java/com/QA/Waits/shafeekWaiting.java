package com.QA.Waits;

import java.io.IOException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import static org.junit.Assert.assertEquals;



public class shafeekWaiting {
	
		public WebDriver driver = null;
		
		ExtentReports extent = new ExtentReports("C:\\Users\\Admin\\Desktop\\Reporting\\ECLIPSEWAIT.HTML" , true);
		
		ExtentTest test;
		
		
		@Before
		public void setup() {
			
			test = extent.startTest("start the test and intialise the driver");
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\chromedriver.exe");
			driver = new ChromeDriver();
			
		}
		@Test
		public void inputsearch () throws InterruptedException, IOException {
			test.log(LogStatus.INFO, "Browser detected message" );
			
			
			driver.get("https://chrisperrins95.github.io/AutomatedTestingExample/"); 
			WebElement myDynamicElement = (new WebDriverWait(driver, 10)) .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"shafeeq\"]/h1"))); 
			String s = driver.findElement(By.xpath("//*[@id=\"shafeeq\"]/h1")).getText();
			assertEquals("check message status","I HATE YOU!",s);

		}
		@After
		public void teardown() {
			test.log(LogStatus.PASS,"verify WAITING PERIOD");
			extent.flush();
			driver.quit();
			
		}
}
