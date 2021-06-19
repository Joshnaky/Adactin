package com.Adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel_pg3 {
	public WebDriver driver;
	@FindBy (name="radiobutton_0")
	private WebElement selectbtn;
	@FindBy(name="continue")
	private WebElement cont;
	@FindBy(name="cancel")
	private WebElement cancel;
	public SelectHotel_pg3(WebDriver adriver) {
		this.driver=adriver;
		PageFactory.initElements(driver,this);
	}
	public WebElement getSelectbtn() {
		return selectbtn;
	}
	public WebElement getCont() {
		return cont;
	}
	public WebElement getCancel() {
		return cancel;
	}
	

}
