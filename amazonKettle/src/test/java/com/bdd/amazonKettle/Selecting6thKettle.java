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


public class Selecting6thKettle {

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
	

	@Given("^the page is open at search results for “kettle”$")
	public void the_page_is_open_at_search_results_for_kettle() throws Throwable {

	    driver.get(baseUrl + "/");
	    driver.findElement(By.id("nav-signin-text")).click();
	    driver.findElement(By.id("ap_email")).clear();
	    driver.findElement(By.name("email")).sendKeys("shahinzibaee@mail.com");
		driver.findElement(By.id("ap_password")).clear();
	    driver.findElement(By.id("ap_password")).sendKeys("PASSWORD");
		driver.findElement(By.id("signInSubmit-input")).click();
		driver.findElement(By.id("twotabsearchtextbox")).clear();
	    driver.findElement(By.id("twotabsearchtextbox")).sendKeys("kettle");

	}

	@When("^I click on 6th kettle on list$")
	public void I_click_on_6th_kettle_on_list() throws Throwable {
	
		driver.findElement(By.xpath("//li[@id='result_5']/div/div/div/div[2]/div/a/h2")).click();
	
	}

	@Then("^page for this kettle opens including button “Add to Basket”$")
	public void page_for_this_kettle_opens_including_button_Add_to_Basket() throws Throwable {
	
		assertTrue(isElementPresent(By.id("productTitle")));

	}

	private boolean isElementPresent(By by) {
		
		try {
			
			driver.findElement(by);
			return true;
	
		} catch (NoSuchElementException e) {
			
			return false;
		
		}
	
	}

}