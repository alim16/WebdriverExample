package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.FindAll;


public class HomePage extends BasePage {
	//WebDriver driver;
	
	
	@FindBy(id = (""))
	public WebElement slideShow;
	
	
	public HomePage(WebDriver driver){
		super(driver);
	}
	
	public boolean slideShowIsDisplayed(){
		return slideShow.isDisplayed();
	}
	

}
