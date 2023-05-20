package org.pages;


import org.factory.DriverFactory;
import org.openqa.selenium.WebDriver;

//import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utilities.ElementUtil;



public class LoginPage {
	private WebDriver driver;
	// WebElement
	@FindBy(xpath="//input[@name='username']")
	private WebElement userName;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement password;
	
	@FindBy(xpath="//button[text()='Log In']")
	private WebElement loginButton;
	
	
	
	/*
	 * private By userName = By.xpath("//input[@id='username']"); private By
	 * password = By.xpath("//input[@name='pwd']"); private By loginButton =
	 * By.xpath("//a[@id='loginButton']/div"); private By keepMeLoggedInCheckbox =
	 * By.xpath("//input[@id='keepLoggedInCheckBox']");
	 */
	
	
	//constructor
	public LoginPage(WebDriver driver)	
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
		//PageFactory.initElements(driver,LoginPage.class);
	}
	
	// page action methods
	public boolean isUseNameFieldDisplayed() {
		return userName.isDisplayed();
	}
	public boolean isPasswordFieldDisplayed() {
		return password.isDisplayed();
	}
	public boolean isLoginFieldDisplayed() {
		return loginButton.isDisplayed();
	}
	
	public String getLoginPageTitle()
	{
		return driver.getTitle();
	}

	
	public void enterUserName(String username)
	{
		userName.sendKeys(username);
	}
	public void enterPassword(String pwd)
	{
		password.sendKeys(pwd);
	}
	public void clickLoginButton()
	{
		loginButton.click();
	}
	public  LoginPage (String username, String pwd)
	{
		System.out.println("Login creds: "+username+" and "+pwd);
		userName.sendKeys(username);
		password.sendKeys(pwd);
		loginButton.click();
		//ElementUtil.eu.waitForPageLoad(DriverFactory.getDriver());
		//return  DashBoardpage (driver);
		//return new DashBoardpage(driver);
	}
}


	

	/*
	 * public WebDriver ldriver; public LoginPage (WebDriver driver){ ldriver =
	 * driver; PageFactory.initElements(driver, this); }
	 * 
	 * @FindBy(xpath="//input[@name='username']")
	 * 
	 * @CacheLookup WebElement txtusername;
	 * 
	 * @FindBy(xpath= "//input[@name='password']")
	 * 
	 * @CacheLookup WebElement txtpassword;
	 * 
	 * @FindBy(xpath="//button[text()='Log In']")
	 * 
	 * @CacheLookup WebElement btnlogin;
	 * 
	 * @FindBy(xpath="//span[text()='Logout']")
	 * 
	 * @CacheLookup WebElement btnLogout;
	 * 
	 * public void setUserName (String uname) { txtusername.clear();
	 * txtusername.sendKeys(uname); } public void setPassword(String pwd) {
	 * txtpassword.clear(); txtpassword.sendKeys(pwd); } public void clickLogin() {
	 * btnlogin.click(); } public void clickLogout() { btnLogout.click();
	 * 
	 * }
	 */