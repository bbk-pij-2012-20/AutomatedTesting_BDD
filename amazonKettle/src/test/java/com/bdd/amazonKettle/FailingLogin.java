package com.bdd.amazonKettle;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FailingLogin {

	private WebDriver driver;
	private String baseUrl;
	private boolean acceptNextAlert = true;
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
	
	@When("^I fill “My e-mail address is:” with “wrongAddress”$")
	public void I_fill_My_e_mail_address_is_with_wrong_Address() throws Throwable {
	
		driver.findElement(By.id("ap_email")).clear();
	    driver.findElement(By.name("email")).sendKeys("wrongAddress");

	}
	
	// not sure if it's possible to include an 'OR' when
	@When("^I fill \"([^\"]*)\" with “wrongPassword”$")
	public void I_fill_with_wrongword() throws Throwable {
	
		driver.findElement(By.id("ap_password")).clear();
	    driver.findElement(By.id("ap_password")).sendKeys("wrongPasword");

	}
	
	@When("^I click button labelled “Sign in using our secure server”$")
	public void I_click_button_labelled_Sign_in_using_our_secure_server_wrongWord() throws Throwable {
	
		driver.findElement(By.id("signInSubmit-input")).click();

	}

	@Then("^login fails$")
	public void login_fails() throws Throwable {
		
		assertEquals("There was a problem with your request", driver.findElement(By.cssSelector("h6")).getText());
	
	}


	
}
