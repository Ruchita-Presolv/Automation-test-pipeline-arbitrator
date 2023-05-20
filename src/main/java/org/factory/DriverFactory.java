package org.factory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	
	public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<WebDriver>();
	
	public WebDriver initdriver(String browser) {
		System.out.println("browser value is: " + browser);
	
		  if(browser.equalsIgnoreCase("ch")||browser.equalsIgnoreCase("chrome")){
		  
		  System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		  System.out.println("browser value is: inside chrome");///
		  //WebDriverManager.chromedriver().setup(); 
		  tlDriver.set(new ChromeDriver());
		  //upcast
		  
		  }else if (browser.equalsIgnoreCase("Edge")|| browser.contains("Edge")){
		  //System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
		  WebDriverManager.edgedriver().setup();
		  tlDriver.set(new EdgeDriver());
		  
		  }else if (browser.equalsIgnoreCase("ff")){
		  
		  WebDriverManager.firefoxdriver().setup(); 
		  tlDriver.set(new FirefoxDriver());
		  
		  }else{ 
			  System.out.println("Invalid Browser");
			  }
		 
		//tlDriver.get().manage().window().maximize();
		getDriver().manage().window().maximize();
		getDriver().manage().timeouts().implicitlyWait (Duration.ofSeconds(30));
		return getDriver();
	}
	// user defined method 
	public static synchronized WebDriver getDriver(){
		return tlDriver.get();
	}
}
/*
 * tlDriver.set(WebDriverManager.chromedriver().setup());
 * tlDriver.set(getDriver(new ChromeDriver()));
 */

/*
 * System.setProperty("webdriver.chrome.chrome.driver",
 * "./driver/chromedriver.exe"); tlDriver.set(new ChromeDriver());
 */
//ChromeDriver Chobj = new ChromeDriver();
//driver = new ChromeDriver();  // upcasting 
//driver.get(url);
//driver.getCurrentUrl();




//System.setProperty("webdriver.edge.driver","./driver/msedgedriver.exe");
//EdgeDriver Edgobj = new EdgeDriver();
//driver = new EdgeDriver();  // upcasting 
//driver.get(url);