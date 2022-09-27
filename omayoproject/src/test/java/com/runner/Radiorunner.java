package com.runner;

import java.io.File;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;

import cucumber.api.testng.AbstractTestNGCucumberTests;
import io.cucumber.junit.CucumberOptions;


     
	@CucumberOptions(features = { "com.Features" }, 
			glue = {"com.Stepdev","com.utility"},plugin= { "pretty",
				 	"html:target/cucumber-htmlreport", 
				 	"json:target/cucumber-report.json",
				 	"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html" },
							 
					tags= "@reg",		 		 
							monochrome = true
							)


	public class Radiorunner extends AbstractTestNGCucumberTests {
	//@AfterClass
//	public static void writeExtentReport() {
	//Reporter.loadXMLConfig(new File("config/config.xml"));

	//			}
			
	}
