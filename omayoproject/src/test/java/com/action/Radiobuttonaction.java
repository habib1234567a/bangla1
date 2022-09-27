package com.action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.element.Radioelement;
import com.utility.Setupdriver;

public class Radiobuttonaction {

	WebDriver driver;
	Radioelement ovj;

	public Radiobuttonaction() {
		
		
		ovj = new Radioelement();
		PageFactory.initElements(Setupdriver.driver, ovj);
	}

	public String geturl() {
		  Setupdriver.driver.get("http://omayo.blogspot.com/");
		  Setupdriver.driver.manage().window().maximize();
		  Setupdriver.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  
		 String title = Setupdriver.driver.getTitle();
			return title;
		}
	public void radiobutton() {
		ovj.radiobutton.click();
		
	//	ovj.alertPopup.click();  
		
	//	Thread.sleep(2000);
	//	Alert alert = Setupdriver.getDrive().switchTo().alert();
	//	alert.accept();
	//	Setupdriver.getDrive().switchTo().defaultContent();
		
		
	}
	
	public void getAlertButton() {
          ovj.alertPopup.click();  
		
	//	Thread.sleep(2000);
		
	}
	
	public void getAlertPopup() {
		Alert alert = Setupdriver.getDrive().switchTo().alert();
		alert.accept();
		Setupdriver.getDrive().switchTo().defaultContent();
		
		
	}
	
	
	
	
}
