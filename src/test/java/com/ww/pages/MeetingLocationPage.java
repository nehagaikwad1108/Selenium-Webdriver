package com.ww.pages;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.ww.base.TestBase;

public class MeetingLocationPage extends TestBase {

	@FindBy (className="location__top")
	List<WebElement> locationList;
			
	public MeetingLocationPage(){
		PageFactory.initElements(driver, this);
	}
	
	// Printing first location and distance
	public StudioSchedulePage printFirstLocation(){
	     for (int i=0; i<locationList.size() ;i++){		
		 String list= locationList.get(0).getText();
		 System.out.println(list);
		locationList.get(i).click();
		}
	return new StudioSchedulePage();
			
}
	// Matching first result
	public StudioSchedulePage matchFirstResult(){
		 for (int i=0; i<locationList.size() ;i++){
		 locationList.get(i).click();
			}
	return new StudioSchedulePage();
    }

}
