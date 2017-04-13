package com.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.FindAll;


public class SearchResultsPage extends BasePage{

	//add list element for found items here
	@FindBy(id = "s-results-list-atf")
	public List<WebElement> searchResultList;
	
	public SearchResultsPage(WebDriver driver) {
		super(driver);
	}
	
	public boolean listOfResultsIsDisplayed(){
		if(!searchResultList.isEmpty()){
			return true;
		} else {
			return false;
		}
		
	}

}
