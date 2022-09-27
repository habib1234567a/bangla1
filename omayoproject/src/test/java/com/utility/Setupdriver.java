
package com.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Setupdriver {
   
	public static WebDriver driver;
	
	public static void setupdriver() {
		
	System.setProperty("WebDriver.chrome.driver","C:\\Users\\md200\\eclipse-workspace\\omayoproject\\chromedriver.exe");
		//ChromeOptions options = new ChromeOptions();    //argument: dont show me any notification from chrome.
		//options.addArguments("--disable-notifications");
	 driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
		
	}  
	//thread
	//public static WebDriver getDrive(){   //encapsulation
	//	return driver;
	
	public static void tearDownDriver(){
		driver.quit();   //quit the driver
		
		
		

	}
}
