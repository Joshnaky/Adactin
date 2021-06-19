package com.Adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel_pg2 {
	public WebDriver driver;
	@FindBy (name="location")
	private WebElement location;
	@FindBy (name="hotels")
	private WebElement hotels;
	@FindBy (name="room_type")
	private WebElement roomtype;
	@FindBy(name="room_nos")
	private WebElement noofroom;
	@FindBy(name="datepick_in")
	private WebElement checkin;
	@FindBy(name="datepick_out")
	private WebElement checkout;
	@FindBy(name="adult_room")
	private WebElement noofadults;
	@FindBy(name="child_room")
	private WebElement noofkids;
	@FindBy (name="Submit")
	private WebElement search;
	@FindBy(name="Reset")
	private WebElement reset;
	public SearchHotel_pg2(WebDriver adriver) {
		this.driver=adriver;
		PageFactory.initElements(driver, this);
		
	}
	public WebElement getLocation() {
		return location;
	}
	public WebElement getHotels() {
		return hotels;
	}
	public WebElement getRoomtype() {
		return roomtype;
	}
	public WebElement getNoofroom() {
		return noofroom;
	}
	public WebElement getCheckin() {
		return checkin;
	}
	public WebElement getCheckout() {
		return checkout;
	}
	public WebElement getNoofadults() {
		return noofadults;
	}
	public WebElement getNoofkids() {
		return noofkids;
	}
	public WebElement getSearch() {
		return search;
	}
	public WebElement getReset() {
		return reset;
	}
	
}
