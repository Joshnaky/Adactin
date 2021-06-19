package com.Adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_pg1 {
	public WebDriver driver;
	@FindBy(name = "username")
	private WebElement username;
	@FindBy(id = "password")
	private WebElement password;
	@FindBy(name = "login")
	private WebElement login;

	public Login_pg1(WebDriver adriver) {
		 this.driver=adriver;
		 PageFactory.initElements(driver, this);
		 

	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}

}
