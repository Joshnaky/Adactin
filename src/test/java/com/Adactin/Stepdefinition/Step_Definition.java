package com.Adactin.Stepdefinition;

import org.openqa.selenium.WebDriver;

import com.Adactin.Base_Class;
import com.Adactin.BookHotel_pg4;
import com.Adactin.Confirmation_pg5;
import com.Adactin.Iteinerary_pg6;
import com.Adactin.Login_pg1;
import com.Adactin.SearchHotel_pg2;
import com.Adactin.SelectHotel_pg3;
import com.Adactin.runner.Test_runner;
import com.Adactinesite.helper.File_Reader_Manager;
import com.Adactinesite.helper.Page_Object_Manager;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Definition extends Base_Class {
	public static WebDriver driver = Test_runner.driver;
	Page_Object_Manager pom=new Page_Object_Manager(driver);
	@Given("^user Launch The Application$")
	public void user_Launch_The_Application() throws Throwable {
		String url=File_Reader_Manager.getInstance().getInstanceCR().get_url();
		getURL(url);
	   
	}
	
	@When("^user Enter The \"([^\"]*)\" In Username Field$")
	public void user_Enter_The_In_Username_Field(String arg1) throws Throwable {
	InputEnter(pom.get_Instance_Login().getUsername(),arg1);
	
	}

	@When("^user Enter The \"([^\"]*)\" In Password Field$")
	public void user_Enter_The_In_Password_Field(String arg1) throws Throwable {
	InputEnter(pom.get_Instance_Login().getPassword(),arg1);
	}

	@Then("^user Click on The Login Button And It Navigates To The Select Hotel page$")
	public void user_Click_on_The_Login_Button_And_It_Navigates_To_The_Select_Hotel_page() throws Throwable {
	    ClickonElement(pom.get_Instance_Login().getLogin());
	}
	
	@When("^user Select The\"([^\"]*)\" In Location Field$")
	public void user_Select_The_In_Location_Field(String arg1) throws Throwable {
		dropdowntext(pom.get_Instance_Search().getLocation(),arg1); 
	}
	@When("^user Select The \"([^\"]*)\" In Hotels Field$")
	public void user_Select_The_In_Hotels_Field(String arg1) throws Throwable {
		dropdownvalue(pom.get_Instance_Search().getHotels(),arg1);
	}
	
	@When("^user Select The \"([^\"]*)\" In Room Type Field$")
	public void user_Select_The_In_Room_Type_Field(String arg1) throws Throwable {
		dropdowntext(pom.get_Instance_Search().getRoomtype(),arg1);
	}

	@When("^user Select The \"([^\"]*)\" In Number Of Rooms Field$")
	public void user_Select_The_In_Number_Of_Rooms_Field(String arg1) throws Throwable {
		dropdownvalue(pom.get_Instance_Search().getNoofroom(),arg1);
	}

	@When("^user Enter The \"([^\"]*)\" Check In Date Field$")
	public void user_Enter_The_Check_In_Date_Field(String arg1) throws Throwable {
		InputEnter(pom.get_Instance_Search().getCheckin(),arg1);
	}

	@When("^user Enter The \"([^\"]*)\" Date In Check Out Date Field$")
	public void user_Enter_The_Date_In_Check_Out_Date_Field(String arg1) throws Throwable {
		InputEnter(pom.get_Instance_Search().getCheckout(), arg1);
	}

	@When("^user Select The \"([^\"]*)\" In Adults Per Room Field$")
	public void user_Select_The_In_Adults_Per_Room_Field(String arg1) throws Throwable {
		dropdowntext(pom.get_Instance_Search().getNoofadults(),arg1);
	}

	@When("^user Select The \"([^\"]*)\" In Children Per Room Field$")
	public void user_Select_The_In_Children_Per_Room_Field(String arg1) throws Throwable {
		dropdowntext(pom.get_Instance_Search().getNoofkids(),arg1);
	}



	/*@When("^user Select The Location Of the Hotel In Location Field$")
	public void user_Select_The_Location_Of_the_Hotel_In_Location_Field() throws Throwable {
	    dropdowntext(pom.get_Instance_Search().getLocation(),"Brisbane");
	}

	@When("^user Select The Hotel Name In Hotels Field$")
	public void user_Select_The_Hotel_Name_In_Hotels_Field() throws Throwable {
	   dropdownvalue(pom.get_Instance_Search().getHotels(),"Hotel Sunshine");
	}

	@When("^user Select The Type of Room In Room Type Field$")
	public void user_Select_The_Type_of_Room_In_Room_Type_Field() throws Throwable {
	   dropdowntext(pom.get_Instance_Search().getRoomtype(),"Super Deluxe");
	}

	@When("^user Select The Number Of Rooms In Number Of Rooms Field$")
	public void user_Select_The_Number_Of_Rooms_In_Number_Of_Rooms_Field() throws Throwable {
	   dropdownvalue(pom.get_Instance_Search().getNoofroom(),"2");
	}

	@When("^user Enter The Check-In Date In Check In Date Field$")
	public void user_Enter_The_Check_In_Date_In_Check_In_Date_Field() throws Throwable {
	   pom.get_Instance_Search().getCheckin().clear();
		InputEnter(pom.get_Instance_Search().getCheckin(),"16/06/2021");
	}

	@When("^user Enter The Check-Out Date In Check Out Date Field$")
	public void user_Enter_The_Check_Out_Date_In_Check_Out_Date_Field() throws Throwable {
	    pom.get_Instance_Search().getCheckout().clear();
	    InputEnter(pom.get_Instance_Search().getCheckout(), "17/06/2021");
	}

	@When("^user Select The Number Of Adults In Adults Per Room Field$")
	public void user_Select_The_Number_Of_Adults_In_Adults_Per_Room_Field() throws Throwable {
	    dropdowntext(pom.get_Instance_Search().getNoofadults(),"4 - Four");
	}

	@When("^user Select The Number Of Children In Children Per Room Field$")
	public void user_Select_The_Number_Of_Children_In_Children_Per_Room_Field() throws Throwable {
	   dropdowntext(pom.get_Instance_Search().getNoofkids(),"2 - Two");
	}*/

	@Then("^user Click The Search Button And It Navigates To the Select Hotel Page$")
	public void user_Click_The_Search_Button_And_It_Navigates_To_the_Select_Hotel_Page() throws Throwable {
	    ClickonElement(pom.get_Instance_Search().getSearch());
	}

	@When("^user Selects the Hotel In Select RadioButton$")
	public void user_Selects_the_Hotel_In_Select_RadioButton() throws Throwable {
	    ClickonElement(pom.get_Instance_Select().getSelectbtn());
	}

	@Then("^user Clicks On Continue Button And It Navigates To Book A Hotel page$")
	public void user_Clicks_On_Continue_Button_And_It_Navigates_To_Book_A_Hotel_page() throws Throwable {
	   ClickonElement(pom.get_Instance_Select().getCont());
	}

	@When("^user Enters First Name In First Name Field$")
	public void user_Enters_First_Name_In_First_Name_Field() throws Throwable {
	   InputEnter(pom.get_Instance_Book().getFirstname(),"aaa"); 
	}

	@When("^user Enters Last Name In Last Name Field$")
	public void user_Enters_Last_Name_In_Last_Name_Field() throws Throwable {
	    InputEnter(pom.get_Instance_Book().getLastname(),"bbbb");
	}

	@When("^user Enters The Billing Address In Billing Address Field$")
	public void user_Enters_The_Billing_Address_In_Billing_Address_Field() throws Throwable {
	    InputEnter(pom.get_Instance_Book().getBillingadd(), "ffdhtrhrthr");
	}

	@When("^user Enters The Credit Card No In Credit Card No Field$")
	public void user_Enters_The_Credit_Card_No_In_Credit_Card_No_Field() throws Throwable {
	    InputEnter(pom.get_Instance_Book().getCardno(),"1234567891234567");
	}

	@When("^user Selects The Credit Card Type In Credit Card Type Field$")
	public void user_Selects_The_Credit_Card_Type_In_Credit_Card_Type_Field() throws Throwable {
	    dropdownvalue(pom.get_Instance_Book().getCardtype(),"AMEX");
	}

	@When("^user Selects The EXpiry Month in Select Month DropDown$")
	public void user_Selects_The_EXpiry_Month_in_Select_Month_DropDown() throws Throwable {
	    dropdownvalue(pom.get_Instance_Book().getExpirymonth(),"8");
	}

	@When("^user Selects The Expiry Year in Select Year DropDown$")
	public void user_Selects_The_Expiry_Year_in_Select_Year_DropDown() throws Throwable {
	    dropdownvalue(pom.get_Instance_Book().getExpiryyear(),"2022");
	}

	@When("^user Enters CVV Number In CVV Number Field$")
	public void user_Enters_CVV_Number_In_CVV_Number_Field() throws Throwable {
	    InputEnter(pom.get_Instance_Book().getCvv(),"295");
	}

	@Then("^user Clicks Book Now Button and It Navigates to Booking Confirmation Page$")
	public void user_Clicks_Book_Now_Button_and_It_Navigates_to_Booking_Confirmation_Page() throws Throwable {
	    ClickonElement(pom.get_Instance_Book().getBook());
	    implicitWait(5000);
	}
	
	

	@Then("^user Clicks My Itinerary To Check And It Navigates to Booked Itinerary page$")
	public void user_Clicks_My_Itinerary_To_Check_And_It_Navigates_to_Booked_Itinerary_page() throws Throwable {
	    ClickonElement(pom.get_Instance_Cnfrm().getMyitinery());
	}

	@Then("^user Clicks Logout Button To Logout from Application$")
	public void user_Clicks_Logout_Button_To_Logout_from_Application() throws Throwable {
	    ClickonElement(pom.get_Instance_log().getLogout());
	}


	

}
