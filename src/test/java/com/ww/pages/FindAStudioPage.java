package com.ww.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ww.base.TestBase;

public class FindAStudioPage extends TestBase{
	
	@FindBy(id="meetingSearch")
	WebElement searchBox;
    
	@FindBy(xpath="//button[@class='btn spice-translated']")
    WebElement searchButton;
	
		
	public FindAStudioPage(){
		PageFactory.initElements(driver, this);
		
	}
	
	// Validate PageTitle
	public String validateFindAStudioPageTitle(){
		return driver.getTitle();
	}
	
	// Clicking on button to search according to zip entered 
	public MeetingLocationPage sendLocationBtnClick(String location){
	searchBox.sendKeys(location);
	searchButton.click();
	return new MeetingLocationPage();
	
	}
}
	

