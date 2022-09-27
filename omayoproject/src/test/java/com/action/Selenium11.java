package com.action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.element.Selenium143;
import com.utility.Setupdriver;

public class Selenium11 {
	
	WebDriver driver;
	Selenium143 habib;

	
	public Selenium11 (){
		habib = new Selenium143();
		

		PageFactory.initElements(Setupdriver.driver, habib);
	}

	public String getur2() {
		Setupdriver.driver.get("http://omayo.blogspot.com/");	
	//	driver.manage().window().maximize();
	//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		String title = Setupdriver.driver.getTitle();
		return title;
	}
		public void selenium143() {
			habib.Selenium143.click();
		}
		
		public void choseoption() {
			habib.chose.click();
		}
		

	}
