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


public class KettleSearch {
	
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
	
	@Given("^the page is open at Amazon UK’s “Your Account”$")
	public void the_page_is_open_at_Amazon_UK_s_Your_Account() throws Throwable {
	
	    driver.get(baseUrl + "/");
	    driver.findElement(By.id("nav-signin-text")).click();
	    driver.findElement(By.id("ap_email")).clear();
	    driver.findElement(By.name("email")).sendKeys("shahinzibaee@mail.com");
		driver.findElement(By.id("ap_password")).clear();
	    driver.findElement(By.id("ap_password")).sendKeys("PASSWORD");
		driver.findElement(By.id("signInSubmit-input")).click();

	}

	@When("^I enter: “kettle” into “Search” bar$")
	public void I_enter_kettle_into_Search_bar() throws Throwable {
	   
		driver.findElement(By.id("twotabsearchtextbox")).clear();
	    driver.findElement(By.id("twotabsearchtextbox")).sendKeys("kettle");

	}

	@When("^I click button labelled “go” or press return$")
	public void I_click_button_labelled_go_or_press_return() throws Throwable {
	
		driver.findElement(By.cssSelector("input.nav-submit-input")).click();

	}

	@Then("^“results for “kettle”” page is open$")
	public void _results_for_kettle_page_is_open() throws Throwable {
		
		try {
			
			assertEquals("Amazon.co.uk: kettle", driver.getTitle());
		
		} catch (Error e) {
			
			verificationErrors.append(e.toString());
		
		}

	}

}
