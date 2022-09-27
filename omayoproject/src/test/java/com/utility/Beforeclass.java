package com.utility;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Beforeclass {
	@Before
	public void beforeActions(Scenario scen){ 
		System.out.println(">> Initializing Chrome Driver");
		Setupdriver.setupdriver(); 
		System.out.println(scen.getName()); 
	}

}
