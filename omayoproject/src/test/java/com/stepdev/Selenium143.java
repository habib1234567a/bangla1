package com.stepdev;

import com.action.Selenium11;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Selenium143 {
	
	Selenium11 habib1 =new Selenium11();
	
	@Given("open omayo home page")
	public void open_omayo_home_page() {
		habib1.getur2();
	}
	  
	

	@When("user click on selenium  link")
	public void user_click_on_selenium_link() {
		habib1.selenium143();
	   
	}

	@Then("user able to chose an option")
	public void user_able_to_chose_an_option() {
		habib1.choseoption();
		
	   
	}



}
