package com.bdd.amazonKettle;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;


// GIVEN puts system in a known state
// WHEN describes key action that user performs
// THEN is to observe outcomes. only verify output that's observable by the user


public class Login {
	
	private WebDriver driver;
	private String baseUrl;
	private StringBuffer verificationErrors = new StringBuffer();

	@Before
	public void setUp() throws Exception {
		
		driver = new FirefoxDriver();
		baseUrl = "https://www.amazon.co.uk/";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	}

	@After
	public void tearDown() throws Exception {
		
		driver.quit();
		String verificationErrorString = verificationErrors.toString();
	    
		if (!"".equals(verificationErrorString)) {
	    
			fail(verificationErrorString);
	    
		}
	}
	
	@Given("^the page is open at Amazon UK’s home page$")
	public void the_page_is_open_at_Amazon_UK_s_home_page() throws Throwable {
	  
		driver.get(baseUrl);
	    
	}
	
	@When("^I click button “Hello. Sign in Your Account”$")
	public void I_click_button_Hello_Sign_in_Your_Account() throws Throwable {

		driver.findElement(By.linkText("Sign in")).click();
	
	}

	@When("^I fill “My e-mail address is:” with “shahinzibaee@mail.com”$")
	public void I_fill_My_e_mail_address_is_with_shahinzibaee_gmail_com() throws Throwable {
	
	    driver.findElement(By.id("ap_email")).clear();
	    driver.findElement(By.name("email")).sendKeys("shahinzibaee@mail.com");
		
	}

	@When("^I fill \"([^\"]*)\" with “magicword”$")
	public void I_fill_with_magicword(String arg1) throws Throwable {
	
		driver.findElement(By.id("ap_password")).clear();
	    driver.findElement(By.id("ap_password")).sendKeys("PASSWORD");

	}

	@When("^I click button labelled “Sign in using our secure server”$")
	public void I_click_button_labelled_Sign_in_using_our_secure_server() throws Throwable {
	
		driver.findElement(By.id("signInSubmit-input")).click();

	}

	@Then("^“Your Account” page opens$")
	public void _Your_Account_page_opens() throws Throwable {
	
		Assert.assertEquals("Amazon.co.uk: Recommended For You",driver.getTitle());

	}

	@Then("^I am logged in$")
	public void I_am_logged_in() throws Throwable {

		assertEquals("shahin", driver.findElement(By.id("nav-signin-text")).getText());
	    
	}

}