package com.bdd.amazonKettle;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;


public class ProceedingToCheckOut {

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
	
	@Given("^“Shopping Basket” page is open$")
	public void _Shopping_Basket_page_is_open() throws Throwable {

		driver.get(baseUrl + "/");
	    driver.findElement(By.id("nav-signin-text")).click();
	    driver.findElement(By.id("ap_email")).clear();
	    driver.findElement(By.name("email")).sendKeys("shahinzibaee@mail.com");
		driver.findElement(By.id("ap_password")).clear();
	    driver.findElement(By.id("ap_password")).sendKeys("PASSWORD");
		driver.findElement(By.id("signInSubmit-input")).click();
		driver.findElement(By.id("twotabsearchtextbox")).clear();
	    driver.findElement(By.id("twotabsearchtextbox")).sendKeys("kettle");
	    driver.findElement(By.xpath("//li[@id='result_5']/div/div/div/div[2]/div/a/h2")).click();
		driver.findElement(By.id("add-to-cart-button")).click();
	    driver.findElement(By.id("a-autoid-0-announce")).click();

	}

	@When("^I click on the button “Proceed to Checkout”$")
	public void I_click_on_the_button_Proceed_to_Checkout() throws Throwable {
	
		driver.findElement(By.name("proceedToCheckout")).click();
	    
	}

	@Then("^“Review your order” page opens$")
	public void _Review_your_order_page_opens() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

}