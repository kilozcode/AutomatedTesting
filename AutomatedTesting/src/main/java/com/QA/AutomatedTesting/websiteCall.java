package com.QA.AutomatedTesting;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class websiteCall {
@FindBy (xpath = "//*[@id=\"search_query_top\"]")
private WebElement searchbar ;
@FindBy (xpath = "//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/h5/a")
private WebElement itemname;
@FindBy (name = "submit_search")
private WebElement searchbutton;

public void input (String text1) throws InterruptedException {
	searchbar.sendKeys(text1);
	searchbutton.click();
}
}

