package com.Adactin.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Adactin.Base_Class;
import com.Adactinesite.helper.File_Reader_Manager;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src//test//java//com//Adactine//Feature",
glue="com.Adactin.Stepdefinition", 
monochrome = true,dryRun = false,strict=false,
tags=("~@RegressionTest"),
plugin= {"html:Report/Adactin_html",
		"pretty",
		"json:Report/Adactin_JSON.jason",
		"com.cucumber.listener.ExtentCucumberFormatter:Reports/Adactin_Extent.html"})

  public class Test_runner {
	public static WebDriver driver;
	
	@BeforeClass
	public static void set_Up() throws Throwable {
		String browser=File_Reader_Manager.getInstance().getInstanceCR().get_browser();
		driver=Base_Class.browserLaunch(browser);

	}
	@AfterClass
	public static void tear_Down() {
		driver.close();        

	}

}
