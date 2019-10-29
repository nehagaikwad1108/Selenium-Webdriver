package com.ww.testCases;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ww.base.TestBase;
import com.ww.pages.FindAStudioPage;
import com.ww.pages.HomePage;

public class HomePageTest extends TestBase {
	HomePage homePage;
	FindAStudioPage findAStudioPage;
	
	public HomePageTest(){
		super ();
	}
/*
	@BeforeMethod
	public void setUp(){
		initialize();
		 homePage = new HomePage();
		 findAStudioPage = new FindAStudioPage();
	}

	
	@Test(priority =1)
	public void HomePageTitleTest(){
	String title=	homePage.validateHomePageTitle();
	
	Assert.assertEquals(title, "WW (Weight Watchers): Weight Loss & Wellness Help","Title not matched");
	System.out.println("Title matches with WW (Weight Watchers): Weight Loss & Wellness Help");
		
	}
	
	@Test(priority =2)
	public void TestBtnTest(){
	//	findAStudioPage = homePage.clickFindStudioBtn();
		
	}
	
	@AfterMethod
	public void shutdown(){
		driver.quit();
	}*/
}
