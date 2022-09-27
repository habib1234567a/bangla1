package com.stepdev;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

import com.action.Alertaction;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Alertdemo {
	
	//WebDriver driver;
	Alertaction ra = new Alertaction();
	
	@Given("user able to open omayo home page")
	public void user_able_to_open_omayo_home_page() {
		ra.getalert();
	   
	}

	@When("user able to select alert button")
	public void user_able_to_select_alert_button() {
		ra.getalert();
	    
	}

	@Then("user able to accept the alert")
	public void user_able_to_accept_the_alert() {
		
	//	ra.alert2();
		//Alert alert = driver.switchTo().alert();
		//alert.accept();
		
	}


}
