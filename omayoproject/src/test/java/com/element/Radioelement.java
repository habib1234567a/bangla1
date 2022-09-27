package com.element;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Radioelement {
	
	@FindBy(xpath=("(//*[@id='radio1'])"))
	public WebElement radiobutton;
	
	@FindBy(xpath=("(//*[@id='alert1'])"))
	public WebElement alertPopup;

}
