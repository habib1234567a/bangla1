package com.stepdev;

import com.action.Multyaction;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Multyselectionbox {
	
	Multyaction xyz = new Multyaction ();
	
	@Given("user open to omayo homepage")
	public void user_open_to_omayo_homepage() {
		xyz.geturl();
	    
	}

	@When("user able to click volvo")
	public void user_able_to_click_volvo() {
	   xyz.volvo();
	}


	    
	}
	
	
	 
