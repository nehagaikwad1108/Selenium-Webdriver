package com.ww.pages;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

import java.util.Date;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ww.base.TestBase;

public class StudioSchedulePage extends TestBase {
   @FindBy(className = "location__name")
   WebElement displayedLocationName;

   @FindBy(className ="hours-list-item-day")
   List<WebElement> todaysDay;
   
   @FindBy(className ="hours-list-item")
   List<WebElement> todaysHours;
   
    @FindBy(xpath ="//*[@class='schedule-detailed']/div[3]/div" )
    WebElement personName;
    
    @FindBy(className="schedule-detailed-day")
    List<WebElement> scheduleDays;
   
 
public StudioSchedulePage(){
	
	PageFactory.initElements(driver, this);
}

public String validateDisplayedLocationName(){
	return displayedLocationName.getText();
	
}

// Hours of operation 

public void printingTodaysHoursOfOperations(){
	 Date now = new Date();
	     SimpleDateFormat simpleDateformat = new SimpleDateFormat("E"); 
   for(WebElement results:todaysHours)
     {
       String value= results.getText();
       if (results.getText().contains(simpleDateformat.format(now).toUpperCase())) {
    	    	   System.out.println(value);
    	  
       }
    }
}
 
//  Number of meetings
public ArrayList<String> printNumberOfMeetings(){
   	  ArrayList<String> a = new ArrayList<String>();
      List<WebElement> lastName= personName.findElements(By.xpath("//*[@id='content']/div/div/ui-view/ui-view/div[1]/div[2]/div/div/div[1]/div/div/schedule-detailed/div/div[3]/div[2]//*[@class='schedule-detailed-day-meetings-item-leader']"));
    	   for(int RowCount =0; RowCount< lastName.size();RowCount++){
    	  	 String   list1= lastName.get(RowCount).getText();
    	     a.add(list1);
          }
		return a;  
	}
      
}
  

     

     	 
		
     
   
    

    




