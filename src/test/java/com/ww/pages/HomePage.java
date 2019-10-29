package com.ww.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ww.base.TestBase;

public class HomePage extends TestBase {
	
	@FindBy (linkText="Find a Studio")
    WebElement findStudioBtn;
	
	
	public HomePage(){
		PageFactory.initElements(driver, this);
	}
	
	// Validate Page title 
	public String validateHomePageTitle(){
		return driver.getTitle();
	}
	
	// Clicking on Find a Studio button 
	public FindAStudioPage clickFindStudioBtn(){
		
		findStudioBtn.click();
		return new FindAStudioPage();
	}
}
