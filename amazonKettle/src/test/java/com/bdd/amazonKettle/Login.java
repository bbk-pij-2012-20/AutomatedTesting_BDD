package com.bdd.amazonKettle;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;

import org.junit.*;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

// GIVEN puts system in a known state (avoid indicating user interaction)
// WHEN describes key action that user performs
// THEN is to observe outcomes. only verify output that's observable by the user


public class Login {
	
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
	
	/*not sure how to implement this Given
	@Given("^I already have an account with Amazon UK$")
	public void I_already_have_an_account_with_Amazon_UK() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}*/

	@When("^I click button “Hello. Sign in Your Account”$")
	public void I_click_button_Hello_Sign_in_Your_Account() throws Throwable {

		driver.findElement(By.linkText("Sign in")).click();
	
	}

	@When("^I fill “My e-mail address is:” with “shahinzibaee@hotmail.com”$")
	public void I_fill_My_e_mail_address_is_with_shahinzibaee_gmail_com() throws Throwable {
	
	    driver.findElement(By.id("ap_email")).clear();
	    driver.findElement(By.name("email")).sendKeys("shahinzibaee@hotmail.com");
		
	}

	@When("^I fill \"([^\"]*)\" with “magicword”$")
	public void I_fill_with_magicword(String arg1) throws Throwable {
	
		driver.findElement(By.id("ap_password")).clear();
	    driver.findElement(By.id("ap_password")).sendKeys("3geHHFYH");

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
/*
	// This time testing for outcome of wrong email/password
	@Given("^I click button “Hello. Sign in Your Account”$")
	public void I_am_on_www_amazon_co_uk_Sign_In_page() throws Throwable {

		driver.get(baseUrl + "/ap/signin?_encoding=UTF8&openid.assoc_handle=gbflex&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.co.uk%2Fgp%2Fyourstore%2Fhome%3Fie%3DUTF8%26action%3Dsign-out%26path%3D%252Fgp%252Fyourstore%252Fhome%26ref_%3Dnav_gno_signout%26signIn%3D1%26useRedirectOnSuccess%3D1");
	
	}
*/

	@Given("^the page is open at Amazon UK’s “Your Account”$")
	public void the_page_is_open_at_Amazon_UK_s_Your_Account() throws Throwable {
	
	    driver.findElement(By.id("ap_email")).clear();
	    driver.findElement(By.name("email")).sendKeys("shahinzibaee@gmail.com");
		driver.findElement(By.id("ap_password")).clear();
	    driver.findElement(By.id("ap_password")).sendKeys("PASSWORD");
		driver.findElement(By.id("signInSubmit-input")).click();
		Assert.assertEquals("Amazon.co.uk: Recommended For You",driver.getTitle());
			
	}

	@Given("^I am logged in to my account$")
	public void I_am_logged_in_to_my_account() throws Throwable {

		assertEquals("shahin", driver.findElement(By.id("nav-signin-text")).getText());
	
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

	@Given("^the page is open at search results for “kettle”$")
	public void the_page_is_open_at_search_results_for_kettle() throws Throwable {
	
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

	@Given("^the page is open at Amazon UK’s 6th kettle$")
	public void the_page_is_open_at_Amazon_UK_s_6th_kettle() throws Throwable {
	
		driver.findElement(By.xpath("//li[@id='result_5']/div/div/div/div[2]/div/a/h2")).click();
		assertTrue(isElementPresent(By.id("productTitle")));
		
	}

	@When("^I click on the  button “Add to Basket”$")
	public void I_click_on_the_button_Add_to_Basket() throws Throwable {
	
		driver.findElement(By.id("add-to-cart-button")).click();

	}

	@Then("^page for purchasing this kettle opens with “(\\d+) item was added to your basket”$")
	public void page_for_purchasing_this_kettle_opens_with_item_was_added_to_your_basket(int arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

	@Then("^includes buttons “Edit your Basket” and “Proceed to checkout”$")
	public void includes_buttons_Edit_your_Basket_and_Proceed_to_checkout() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

	@Given("^page generated by clicking on “Add to Basket”$")
	public void page_generated_by_clicking_on_Add_to_Basket() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

	@When("^I click on the button “Edit your Basket”$")
	public void I_click_on_the_button_Edit_your_Basket() throws Throwable {

	    driver.findElement(By.id("a-autoid-0-announce")).click();
	    
	}

	@Then("^“Shopping Basket” page opens$")
	public void _Shopping_Basket_page_opens() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

	@Given("^“Shopping Basket” page is open$")
	public void _Shopping_Basket_page_is_open() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
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
	
	private boolean isElementPresent(By by) {
		
		try {
			
			driver.findElement(by);
			return true;
	
		} catch (NoSuchElementException e) {
			
			return false;
		
		}
	
	}

	private boolean isAlertPresent() {
		
		try {
			
			driver.switchTo().alert();
			return true;
	
		} catch (NoAlertPresentException e) {
			
			return false;
		
		}
	
	}

	private String closeAlertAndGetItsText() {
		
		try {
			
			Alert alert = driver.switchTo().alert();
			String alertText = alert.getText();
			
			if (acceptNextAlert) {
				
				alert.accept();
			
			} else {
				
				alert.dismiss();
			
			}
			
			return alertText;
		
		} finally {
			
			acceptNextAlert = true;
		
		}
	
	}
	
}