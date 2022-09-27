package com.element;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;


public class Multiselectionelement {
	
	//Select select = new Select(driver.findElement(By.id("multiselect1")));
//	select.selectByVisibleText('First value');

	
	@FindBy(xpath=("//select[@id='multiselect1']/option[1]")) 
	public WebElement multiselection;
	
	
//	By.xpath("//select[@id='groupSelect']/option[@value=???']"))
	
  // @FindBy(xpath=("//select[@id='multiselect1']/child::option[@value='1']"))
		 //  public WebElement multiselection;
}
