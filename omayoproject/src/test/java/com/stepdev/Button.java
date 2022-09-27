package com.stepdev;



import com.action.Buttonthree;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Button {
	
	Buttonthree ha = new Buttonthree();
	
	@Given("open the omayo home page")
	public void open_the_omayo_home_page() {
		ha.getURL();
	    
	}

	@When("user able to click button")
	public void user_able_to_click_button() throws InterruptedException {
		Thread.sleep(2000);
	   // ha.button();
	   // Alert alert = driver.switch().alert();
	  //  alet.accept();
	//	ha.buttonthree();
	}

	@Then("user able to click pop up ok")
	public void user_able_to_click_pop_up_ok() {
	   
	}

}
