package org.stepdefinations;

import org.applicationhooks.AppHooks;
import org.factory.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.pages.LoginPage;
import org.testng.Assert;
import org.testng.Reporter;
import org.utilities.ConfigReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStefDef {
 

	private  LoginPage lp_obj= new LoginPage(DriverFactory.getDriver());

	@Given("User is on login page") 
	public void user_is_on_login_page() {
		DriverFactory.getDriver().get(AppHooks.prop.getProperty("url")); 
		 //lp_obj=new LoginPage(DriverFactory.getDriver());
	}

	@Then("Username field is displayed")
	public void username_field_is_displayed() {
		Assert.assertTrue(lp_obj.isUseNameFieldDisplayed());
		Reporter.log("username field is displayed"); 
	}

	@Then("Password field is displayed") 
	public void password_field_is_displayed() {
		Assert.assertTrue(lp_obj.isPasswordFieldDisplayed());
		Reporter.log(" password field is displayed"); 
	}

	@Then("Login page is displayed")
	public void login_page_is_displayed() {
		Assert.assertTrue(lp_obj.isLoginFieldDisplayed());
	}

	@When("User enters username")
	public void user_enters_username() {
		lp_obj.enterUserName(AppHooks.prop.getProperty("username"));
	}

	@When("User enters password")
	public void user_enters_password() {
		lp_obj.enterPassword(AppHooks.prop.getProperty("password")); 
	}

	@When("Click on login butten")
	public void click_on_login_butten() {
		lp_obj.clickLoginButton(); 
	}



	@Then("Dashboard URL should be displayed as {string}")
	public void dashboard_url_should_be_displayed_as(String string) {
		Assert.assertTrue(lp_obj.isLoginFieldDisplayed());
	}

}




//#################################################################
//public WebDriver driver;
//public LoginPage lp;
/*
 * @Given("User launch chrome browser") public void user_launch_chrome_browser()
 * { System.setProperty("webdriver.chrome.driver",
 * System.getProperty("user.dir")+"//Drivers/chromedriver.exe"); driver = new
 * ChromeDriver(); lp= new LoginPage(driver); }
 * 
 * @When("User opens Url {string}") public void user_opens_url(String url) {
 * driver.get(url); }
 * 
 * 
 * @When("user enters the User name as {string} and password as {string}")
 * public void user_enters_the_user_name_as_and_password_as(String uname, String
 * pwd) { lp.setUserName(uname); lp.setPassword(pwd); }
 * 
 * @When("click on login") public void click_on_login() throws
 * InterruptedException { lp.clickLogin(); driver.manage().window().maximize();
 * Thread.sleep(3000);
 * 
 * }
 * 
 * @Then("page title should be {string}") public void
 * page_title_should_be(String title) {
 * if(driver.getPageSource().contains("Incorrect Login Details!")) {
 * driver.close(); Assert.assertTrue(false); }else { Assert.assertEquals(title,
 * driver.getTitle()); }
 * 
 * 
 * }
 * 
 * @When("user click on log out link") public void user_click_on_log_out_link()
 * throws InterruptedException {
 * 
 * lp.clickLogout(); Thread.sleep(3000); }
 * 
 * @When("close browser") public void close_browser() throws
 * InterruptedException { driver.close(); Thread.sleep(3000);
 * 
 * }
 */




