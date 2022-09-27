package com.utility;

import org.junit.After;

public class Afterclass {
	@After
	public void afterAction(){
		Setupdriver.tearDownDriver();
		System.out.println("---Test Completed---");
	}

}
