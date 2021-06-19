package com.Adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Confirmation_pg5 {
	public WebDriver driver;
	@FindBy(name="my_itinerary")
	private WebElement myitinery;

	public Confirmation_pg5(WebDriver adriver) {
		 this.driver=adriver;
		 PageFactory.initElements(driver, this);	}

	public WebElement getMyitinery() {
		return myitinery;
	}

}
