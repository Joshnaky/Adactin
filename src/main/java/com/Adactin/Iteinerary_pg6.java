package com.Adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Iteinerary_pg6 {
	public WebDriver driver;
	@FindBy(name="logout")
	private WebElement logout;

	public Iteinerary_pg6(WebDriver adriver) {
		 this.driver=adriver;
		 PageFactory.initElements(driver, this);	}

	public WebElement getLogout() {
		return logout;
	}

}
