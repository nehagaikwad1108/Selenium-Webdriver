package com.ww.testCases;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ww.base.TestBase;
import com.ww.pages.FindAStudioPage;
import com.ww.pages.HomePage;
import com.ww.pages.MeetingLocationPage;

public class FindAStudioPageTest extends TestBase{
	FindAStudioPage findAStudioPage;
	MeetingLocationPage meetingLocationPage;
	HomePage homePage ;
	
	public FindAStudioPageTest(){
		super();
	}
	/*
 @BeforeMethod
	public void setUp(){
		initialize();
		findAStudioPage = new FindAStudioPage();
		meetingLocationPage = new MeetingLocationPage();
		homePage = new HomePage();
		findAStudioPage = homePage.clickFindStudioBtn();
		
		}
	
	@Test (priority=3)
	public void FindAStudioTitlePageTest() throws InterruptedException{
		WebDriverWait wait = new WebDriverWait(driver, 15);
		 wait.until(ExpectedConditions.titleContains("Find WW Studios & Meetings Near You | WW USA"));
   // Thread.sleep(8000);
	String StudioPagetitle=	findAStudioPage.validateFindAStudioPageTitle();
	
	Assert.assertEquals(StudioPagetitle, "Find WW Studios & Meetings Near You | WW USA");
	System.out.println("Title matches Find WW Studios & Meetings Near You | WW USA");
		
	}
	
	@Test (priority=4)
	public void sendingLocationClick(){
		//meetingLocationPage = findAStudioPage.sendLocationBtnClick(property.getProperty("location"));
		}
	
	
	
	@AfterMethod
	public void shutdown(){
		driver.quit();
	}
*/
	
}
