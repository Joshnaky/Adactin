package com.Adactinesite.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class Configuration_Reader {
	public static Properties p;
	public Configuration_Reader() throws Throwable {
		File f=new File("C:\\Users\\User\\eclipse-workspace\\Adactin\\src\\test\\java\\com\\Adactin\\header\\Configuration.properties");
		FileInputStream fis= new FileInputStream(f);
		p=new Properties();
		p.load(fis);
		
	}
	
	public String get_browser() {
     String browser = p.getProperty("browser");
     return browser;
	}
	
	public String get_url() {
		String url=p.getProperty("url");
		return url;
	}

}
