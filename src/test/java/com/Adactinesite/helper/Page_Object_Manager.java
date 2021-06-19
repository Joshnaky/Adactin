package com.Adactinesite.helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.Adactin.BookHotel_pg4;
import com.Adactin.Confirmation_pg5;
import com.Adactin.Iteinerary_pg6;
import com.Adactin.Login_pg1;
import com.Adactin.SearchHotel_pg2;
import com.Adactin.SelectHotel_pg3;

public class Page_Object_Manager {
public WebDriver driver;
private Login_pg1 login;
private SearchHotel_pg2 searchH;
private SelectHotel_pg3 selectH;
private BookHotel_pg4 bookh;
private Confirmation_pg5 cnfrm;
private Iteinerary_pg6 log;

public Page_Object_Manager(WebDriver driver2) {
this.driver=driver2;
PageFactory.initElements(driver, this);
}

public Login_pg1 get_Instance_Login() {
login=new Login_pg1(driver);
return login;
}

public SearchHotel_pg2 get_Instance_Search() {
	searchH=new SearchHotel_pg2(driver);
	return searchH;
}

public SelectHotel_pg3 get_Instance_Select() {
selectH=new SelectHotel_pg3(driver);
return selectH;
}

public BookHotel_pg4 get_Instance_Book(){
	bookh=new BookHotel_pg4(driver);
	return bookh;
}

public Confirmation_pg5 get_Instance_Cnfrm() {
	cnfrm=new Confirmation_pg5(driver);
	return cnfrm;
	
}

public Iteinerary_pg6 get_Instance_log() {
	log=new Iteinerary_pg6(driver);
	return log;
}




}
