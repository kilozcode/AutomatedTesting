package com.QA.AutomatedTesting;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.junit.Test;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;



public class website{
	public WebDriver driver = null;
ExtentReports extent = new ExtentReports("C:\\Users\\Admin\\Desktop\\Reporting\\ECLIPSEDRESS.HTML" , true);
	
	ExtentTest test;
	
	@Before
	
	
	public void setup() {
		test = extent.startTest("start the test and intialise the driver");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		

	}

	@Test
	public void inputsearch () throws InterruptedException, IOException {
		test.log(LogStatus.INFO, "Browser Started" );
		websiteCall search = PageFactory.initElements(driver, websiteCall.class);
		driver.get("http://automationpractice.com/index.php");
		search.input("dress");
		WebElement checkElement = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/h5/a")); //saves the xpath into checkElement
		String s = checkElement.getText().toLowerCase();  //checks the string within check element and converts it to lower case
		boolean isDress = s.contains("dress"); 
		assertEquals(true , isDress);
		
}
	@After
	public void teardown() {
		test.log(LogStatus.PASS,"verify TITLE OF PAGE");
		driver.quit();
		extent.flush();
	}
}