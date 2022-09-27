package com.action;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.element.Multiselectionelement;

import com.stepdev.Multyselectionbox;
import com.utility.Setupdriver;

public class Multyaction {

	WebDriver driver;

	Multiselectionelement abc;

	public Multyaction() {

		Multiselectionelement abc = new Multiselectionelement();
		PageFactory.initElements(Setupdriver.driver, abc);
	}

	public String geturl() {
		Setupdriver.driver.get("http://omayo.blogspot.com/");
		Setupdriver.driver.manage().window().maximize();
		Setupdriver.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		String title = Setupdriver.driver.getTitle();
		return title;
	}

	public void volvo() throws Throwable  {
		abc.multiselection.click();

		// public void getAlertButton() {
		// ovj.alertPopup.click();

		//Thread.sleep(15);

      //  throw new Exception("e");
		

	}

}
