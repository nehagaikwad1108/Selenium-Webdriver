package com.ww.testCases;

import java.text.SimpleDateFormat;

import java.util.Date;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ww.base.TestBase;
import com.ww.pages.FindAStudioPage;
import com.ww.pages.HomePage;
import com.ww.pages.MeetingLocationPage;
import com.ww.pages.StudioSchedulePage;

public class MeetingLocationPageTest extends TestBase {
    
	MeetingLocationPage meetingLocationPage;
	FindAStudioPage findAStudioPage;
	StudioSchedulePage studioSchedulePage;
	HomePage homePage;
	
	public MeetingLocationPageTest(){
		super();
	}
	/*	 @BeforeMethod
			public void setUp(){
				initialize();
				findAStudioPage = new FindAStudioPage();
				meetingLocationPage = new MeetingLocationPage();
				homePage = new HomePage();
				findAStudioPage = homePage.clickFindStudioBtn();
				meetingLocationPage = findAStudioPage.sendLocationBtnClick(property.getProperty("location")); 
				
				}
	
		 

			@Test(priority =5)
			public void clickingFirstLocation(){
				System.out.println("First location and distance is: ");
				studioSchedulePage = meetingLocationPage.printFirstLocation();
				
				 
			}
			
			@AfterMethod
			public void shutdown(){
				driver.quit();
			}
			*/
		
}
