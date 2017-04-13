package com.tests;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.Test;

import com.pages.HomePage;
import com.pages.SearchResultsPage;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;

public class SearchTests {
	WebDriver driver;

  
  @BeforeTest
  public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", ".\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://amazon.co.uk");
  }
  
  @Test
  public void shouldDisplayResultsContainingKeyword() {
	 // HomePage hp = new HomePage(driver);
	  HomePage hp = PageFactory.initElements(driver, HomePage.class);
	  hp.searchFor("test");
	  
	  SearchResultsPage sp = PageFactory.initElements(driver, SearchResultsPage.class);
	  System.out.println(sp.listOfResultsIsDisplayed());
	 //System.out.println(driver.getCurrentUrl());
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
