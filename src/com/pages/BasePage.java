package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.FindAll;


public class BasePage {

	WebDriver driver;
	
	@FindBy(id = ("twotabsearchtextbox"))
	public WebElement searchBox;
	
	@FindBy(css = "#nav-search .nav-search-submit .nav-input")
	public WebElement searchButton;
	
	public BasePage(WebDriver driver){
		this.driver = driver;
	}
	
	public void searchFor(String s){
		searchBox.sendKeys(s);
		searchButton.click();
	}


}
