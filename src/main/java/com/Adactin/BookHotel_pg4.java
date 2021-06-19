package com.Adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotel_pg4 {
	public WebDriver driver;
	@FindBy (name="first_name")
	private WebElement firstname;
	@FindBy(name="last_name")
	private WebElement lastname;
	@FindBy(name="address")
	private WebElement billingadd;
	@FindBy (name="cc_num")
	private WebElement cardno;
	@FindBy(name="cc_type")
	private WebElement cardtype;
	@FindBy(name="cc_exp_month")
	private WebElement expirymonth;
	@FindBy(id="cc_exp_year")
	private WebElement expiryyear;
	@FindBy(name="cc_cvv")
	private WebElement cvv;
	@FindBy(name="book_now")
	private WebElement book;
	@FindBy(name="cancel")
	private WebElement cancel;
	
	public BookHotel_pg4(WebDriver adriver) {
		this.driver=adriver;
		PageFactory.initElements(driver, this);
	}


	public WebElement getFirstname() {
		return firstname;
	}
	public WebElement getLastname() {
		return lastname;
	}
	public WebElement getBillingadd() {
		return billingadd;
	}
	public WebElement getCardno() {
		return cardno;
	}
	public WebElement getCardtype() {
		return cardtype;
	}
	public WebElement getExpirymonth() {
		return expirymonth;
	}
	public WebElement getExpiryyear() {
		return expiryyear;
	}
	public WebElement getCvv() {
		return cvv;
	}
	public WebElement getBook() {
		return book;
	}
	public WebElement getCancel() {
		return cancel;
	}
	


}
