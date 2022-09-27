package com.stepdev;

import com.action.Radiobuttonaction;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Radiobutton {
	
	Radiobuttonaction abc =new Radiobuttonaction();
	
	@Given("user able to open omayo homepage")
	public void user_able_to_open_omayo_homepage() {
	    abc.geturl();
	}

	@When("user able to click on male radio button")
	public void user_able_to_click_on_male_radio_button() throws InterruptedException {
	    try {
			abc.radiobutton();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@When("user able to click on getAlert button")
	public void user_able_to_click_on_get_alert_button() throws InterruptedException {
	   abc.getAlertButton();
	}

	@When("user able to pop up ok button")
	public void user_able_to_pop_up_ok_button() {
		abc.getAlertPopup();
	}

}
