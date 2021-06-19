package com.Adactin;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base_Class {
	public static WebDriver driver;
	
	public static WebDriver browserLaunch(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\eclipse-workspace\\Adactin\\Driver\\chromedriver.exe" );
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver","path");
			driver=new FirefoxDriver();
		}
		else {
			System.out.println("INVALID BROWSER");
		}
		driver.manage().window().maximize();
		return driver;
		}
		
	public static void getURL(String URL) {
		driver.get(URL);
	}
	//Click
	public static void ClickonElement(WebElement element) {
			element.click();
			
		}
	//SendKeys	
	public static void InputEnter(WebElement element,String values) {
			element.sendKeys(values);
		}
	//DropDown-Select
	public static void dropdownvalue(WebElement element,String a) {
			Select s=new Select(element);
			s.selectByValue(a);
		}
		
	public static void dropdowntext(WebElement element,String a) {
			Select s=new Select(element);
			s.selectByVisibleText(a);
		}
	
	public static void dropdownIndex(WebElement element,int a) {
		Select s=new Select(element);
		s.selectByIndex(a);
	}
	
	// close
	public static void close() {
		driver.close();
	}
	
	//quit
	public static void quit() {
		driver.quit();
	}
	
	//Navigate
	public static void naviTo(String URL) {
		driver.navigate().to(URL);
		}
	
	public static void naviBack() {
		driver.navigate().back();
	}
	
	public static void naviFrwd() {
		driver.navigate().forward();
	}
	
	public static void navirefresh() {
		driver.navigate().refresh();
	}
	
	//Alert
	public static void alertAccept() {
		 Alert al=driver.switchTo().alert();
		 al.accept();
	 }
	 public static void alertDismiss() {
		 Alert al=driver.switchTo().alert();
		 al.dismiss();
	
	}
	 public static void alertInputEnter(String text) {
		 Alert al=driver.switchTo().alert();
		 al.sendKeys(text);
		 System.out.println(al.getText());
		 
	 }
	
	 //Action 
	 public static void contextClick(WebElement element) {
		 Actions ac=new Actions(driver);
		 ac.contextClick(element).build().perform();
	 }
	 
	 public static void doubleClick(WebElement element) {
		 Actions ac=new Actions(driver);
		 ac.doubleClick(element).build().perform();
	 }
	 
	 public static void hover(WebElement element) {
		 Actions ac=new Actions(driver);
		 ac.moveToElement(element).build().perform();
	 }
	 
	 //Robot
	 public static void robotDown() throws Throwable {
		 Robot r=new Robot();
		 r.keyPress(KeyEvent.VK_DOWN);
		 r.keyRelease(KeyEvent.VK_DOWN);
	 }
	 
	 public static void robotEnter() throws Throwable {
		 Robot r=new Robot();
		 r.keyPress(KeyEvent.VK_ENTER);
		 r.keyRelease(KeyEvent.VK_ENTER);
		 
	 }
	 
	 //Frames
	 public static void frameIndex(int a) {
		 driver.switchTo().frame(a);
	 }
	 
	 public static void frameElement(WebElement element) {
		 driver.switchTo().frame(element);
	 }
	 
	 public static void frameName(String name) {
		 driver.switchTo().frame(name);
	 }
	 
	 //Window Handles
	 public static void mainHandle(){
		 String maintitle=driver.getWindowHandle();
			String mtitle=driver.switchTo().window(maintitle).getTitle();
			System.out.println("main title"+mtitle);
		 
	 }
	 public static void childHandle() {
		 Set<String> childwindow = driver.getWindowHandles();
		 for(String titles:childwindow) {
				String title2 = driver.switchTo().window(titles).getTitle();
				System.out.println(title2);
		}
	 }
		 
	//Checkbox
		 public static void checkBox(WebElement element) {
			 element.click();
		 }
		 
	//Is Enabled
		 public static void enabled(WebElement element) {
			 boolean enabled = element.isEnabled();
			 System.out.println(enabled);
		 }
		 
	//Is displayed
		 public static void displayed(WebElement element) {
			 boolean displayed = element.isDisplayed();
			 System.out.println(displayed);
		 }
		 
	//Is selected
		 public static void selected(WebElement element) {
			 boolean selected = element.isSelected();
			 System.out.println(selected);
		 }
		 
	//get options
		public static void getOptions(WebElement element) {
			Select s=new Select(element);
			List<WebElement> options = s.getOptions();
			for(WebElement option:options) {
				System.out.println(option.getText());
			}
			
		}
		
	//get title
		public static void getTitle() {
			String title = driver.getTitle();
			System.out.println(title);
		}
		
   //get currentURL
		public static void getCurrentURL() {
			String currentUrl = driver.getCurrentUrl();
			System.out.println(currentUrl);
			
		}
		
  //get text
		public static void getText(WebElement element) {
			String text = element.getText();
			System.out.println(text);
			
		}
		
  //get attribute
		public static void getAttribute(WebElement element,String type) {
			String attribute = element.getAttribute(type);
			System.out.println(attribute);
		}
		
	//wait
		
		public static void implicitWait(int a) {
			driver.manage().timeouts().implicitlyWait(a,TimeUnit.SECONDS);
				}
		
		public static void explicitWait(long a,WebElement element) {
			WebDriverWait wait=new WebDriverWait(driver,a);
			wait.until(ExpectedConditions.visibilityOf(element));
		}
		
		public static void fluentWait() {
			
		}
		
		//Screenshot
		public static void screenShot(String img) throws Throwable {
			TakesScreenshot ts=(TakesScreenshot) driver;
			 File source = ts.getScreenshotAs(OutputType.FILE);
			 File destination=new File("C:\\Users\\User\\eclipse-workspace\\AutomationPractice\\ScreenShot\\"+img+".png");
			 FileUtils.copyFile(source, destination);
		}
		
		//scroll up and down
		
		public static void scrollUp(WebElement element) {
			JavascriptExecutor js=(JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();",element);
		}
		
		public static void scrollDown(){
			 JavascriptExecutor js=(JavascriptExecutor) driver;
			 js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		}
		
		//get first selected options
		public static void firstSelected(WebElement element) {
			Select s=new Select(element);
			WebElement firstSelectedOption = s.getFirstSelectedOption();
			System.out.println("First Selected option:"+firstSelectedOption);
			
		}
		
		//get all selected options
		public static void allSelected(WebElement element) {
			Select s=new Select(element);
			List<WebElement> options = s.getAllSelectedOptions();
			for(WebElement opt:options) {
				System.out.println("All selected options:"+opt.getText());
			}
		}
			
		//Is multiple
		public static void isMultiple(WebElement element) {
			Select s=new Select(element);
			boolean multiple = s.isMultiple();
			System.out.println("Multiple??"+multiple);
		}
			
		
		 }
		 
	 





