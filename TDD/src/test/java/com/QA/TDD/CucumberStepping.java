package com.QA.TDD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class CucumberStepping {
	
	public WebDriver driver = null;
@Given("^the correct web address$")
public void the_correct_web_address() throws Throwable {
    // Write code here that turns the phrase above into concrete actions   
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.youidraw.com/apps/painter/");
	throw new PendingException();
   
}

@When("^I navigate to the 'Menu' page$")
public void i_navigate_to_the_Menu_page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.xpath("//*[@id=\"wsb-nav-00000000-0000-0000-0000-000450914915\"]/ul/li[3]/a")).click();
	throw new PendingException();
}

@Then("^I can browse a list of the available products\\.$")
public void i_can_browse_a_list_of_the_available_products() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	WebElement checkElement = driver.findElement(By.xpath("//*[@id=\"wsb-element-00000000-0000-0000-0000-000453230000\"]/div/p/span/span/strong"));
      String k = checkElement.getText();
k.contains("Green Tea");
	
 
	throw new PendingException();
}

@When("^I click the checkout button$")
public void i_click_the_checkout_button() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.xpath("//*[@id=\"wsb-nav-00000000-0000-0000-0000-000450914915\"]/ul/li[5]/a")).click();
	throw new PendingException();
}
@Then("^I am taken to the checkout page$")
public void i_am_taken_to_the_checkout_page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	WebElement checkElement = driver.findElement(By.xpath("//*[@id=\"wsb-element-00000000-0000-0000-0000-000452010925\"]/div/div/form/fieldset[1]/legend"));
	String s = checkElement.getText();
	s.contains("Customer Info");
	
	throw new PendingException();
}



}
