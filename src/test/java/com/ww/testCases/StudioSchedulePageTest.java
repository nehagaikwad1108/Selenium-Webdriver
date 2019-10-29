package com.ww.testCases;


import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.AssertJUnit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import com.ww.base.TestBase;
import com.ww.pages.FindAStudioPage;
import com.ww.pages.HomePage;
import com.ww.pages.MeetingLocationPage;
import com.ww.pages.StudioSchedulePage;

public class StudioSchedulePageTest extends TestBase{
    StudioSchedulePage studioSchedulePage;
    FindAStudioPage findAStudioPage;
    HomePage homePage;
    MeetingLocationPage meetingLocationPage;
    
	public StudioSchedulePageTest(){
		super();
	}
	
	
	@BeforeMethod
	public void setUp(){
		initialize();
		findAStudioPage = new FindAStudioPage();
		meetingLocationPage = new MeetingLocationPage();
		homePage = new HomePage();
	}

	
	@Test(priority =6)
	public void DisplayedLocationNameTest(){
		// Test to validate title of homepage
		System.out.println("--------------------------------------------------------------------------------------------\n");
		String title=	homePage.validateHomePageTitle();
		Assert.assertEquals(title, "WW (Weight Watchers): Weight Loss & Wellness Help","Title not matched");
		System.out.println("Title matches with \" WW (Weight Watchers): Weight Loss & Wellness Help\"");
		System.out.println("--------------------------------------------------------------------------------------------\n");
		
		// Go to Find a Studio page
		findAStudioPage = homePage.clickFindStudioBtn();

		// Test to validate title of  Find a Studio Page
		WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.titleContains("Find WW Studios & Meetings Near You | WW USA"));
 	    String StudioPagetitle=	findAStudioPage.validateFindAStudioPageTitle();
	    Assert.assertEquals(StudioPagetitle, "Find WW Studios & Meetings Near You | WW USA");
	    System.out.println("Title matches with\" Find WW Studios & Meetings Near You | WW USA\"");
	    System.out.println("--------------------------------------------------------------------------------------------\n");
	
		// Go to Meeting Location Page
	    meetingLocationPage = findAStudioPage.sendLocationBtnClick(property.getProperty("location"));
	
	    // Printing location and distance
	    System.out.println("First location and distance for zip code 10011 is: ");
	    studioSchedulePage = meetingLocationPage.printFirstLocation();
	    System.out.println("--------------------------------------------------------------------------------------------\n");
			
		// Test to validate if title matches the first displayed result, Hours of Operations and number of meetings
	    String locationName=	studioSchedulePage.validateDisplayedLocationName();	
	    AssertJUnit.assertEquals(locationName,"WW Studio Flatiron");
	    System.out.println("Title matches with the name of the first searched result\"WW Studio Flatiron\"");
	    System.out.println("--------------------------------------------------------------------------------------------\n");
	    System.out.println("Today's hours of operation:");
	    studioSchedulePage.printingTodaysHoursOfOperations();
	    studioSchedulePage.printNumberOfMeetings();
	    System.out.println("--------------------------------------------------------------------------------------------\n");
	    System.out.println("Number of meetings that each person has on Tuesday");
	    ArrayList<String> arr = studioSchedulePage.printNumberOfMeetings();
 	    Set<String> uniqueWords = new HashSet<String>(arr);
        for (String word : uniqueWords) {
        System.out.println(word + "  " + Collections.frequency(arr, word));
	
     }
	
        System.out.println("--------------------------------------------------------------------------------------------\n");
	 
     
 } 
	@AfterMethod
	public void shutdown(){
		driver.quit();
	}
}
