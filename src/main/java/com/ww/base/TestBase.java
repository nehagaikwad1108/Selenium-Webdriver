package com.ww.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.ww.util.TestUtil;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	public static WebDriver driver;
	public static Properties property;
	public TestBase(){
		
		try {
			property = new Properties();
			FileInputStream file = new FileInputStream(System.getProperty("user.dir")+ "/src/main/java/com/ww"
					+ "/config/config.properties");
			property.load(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void initialize(){
		String browserName =property.getProperty("browser");
		
		if (browserName.equals("chrome")){
		    WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver(); 
		}
		
	
	
	
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
	
	driver.get(property.getProperty("url"));
}
}

