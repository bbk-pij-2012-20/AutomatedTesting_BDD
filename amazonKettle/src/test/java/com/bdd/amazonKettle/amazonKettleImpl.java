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


public class amazonKettleImpl {
	
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

	@Given("^I already have an account with Amazon UK$")
	public void I_already_have_an_account_with_Amazon_UK() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

	@When("^I am on “www.amazon.co.uk”$")
	public void I_am_on_www_amazon_co_uk() throws Throwable {

		driver.get(baseUrl + "/ap/signin?_encoding=UTF8&openid.assoc_handle=gbflex&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.co.uk%2Fgp%2Fyourstore%2Fhome%3Fie%3DUTF8%26action%3Dsign-out%26path%3D%252Fgp%252Fyourstore%252Fhome%26ref_%3Dnav_gno_signout%26signIn%3D1%26useRedirectOnSuccess%3D1");
	
	}

	@When("^I fill “My e-mail address is:” with “shahinzibaee@gmail.com”$")
	public void I_fill_My_e_mail_address_is_with_shahinzibaee_gmail_com() throws Throwable {
	
		driver.findElement(By.name("email")).sendKeys("shahinzibaee@gmail.com");
		
	}

	@When("^I fill \"([^\"]*)\" with “magicword”$")
	public void I_fill_with_magicword(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

	@When("^I click button labelled “Sign in using our secure server”$")
	public void I_click_button_labelled_Sign_in_using_our_secure_server() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

	@Then("^“Your Account” page opens$")
	public void _Your_Account_page_opens() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

	@Then("^I am logged in$")
	public void I_am_logged_in() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

	@When("^I fill “My e-mail address is:” with “szib@gmail.com”$")
	public void I_fill_My_e_mail_address_is_with_szib_gmail_com() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

	@When("^I fill \"([^\"]*)\" with “wrongword”$")
	public void I_fill_with_wrongword(String arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

	@Then("^login fails$")
	public void login_fails() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

	@Then("^sign in page includes message “There was a problem with your request.”$")
	public void sign_in_page_includes_message_There_was_a_problem_with_your_request_() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

	@Given("^the page is open at Amazon UK’s “Your Account”$")
	public void the_page_is_open_at_Amazon_UK_s_Your_Account() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

	@Given("^I am logged in to my account$")
	public void I_am_logged_in_to_my_account() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

	@When("^I am on “www.amazon.co.uk/…”$")
	public void I_am_on_www_amazon_co_uk_() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

	@When("^I enter: “kettle” into “Search” bar$")
	public void I_enter_kettle_into_Search_bar() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

	@When("^I click button labelled “go” or press return$")
	public void I_click_button_labelled_go_or_press_return() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

	@Then("^“results for “kettle”” page is open$")
	public void _results_for_kettle_page_is_open() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

	@Given("^the page is open at search results for “kettle”$")
	public void the_page_is_open_at_search_results_for_kettle() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

	@When("^I click on kettle description “Russell Hobbs (\\d+) Colours Kettle - Cream”$")
	public void I_click_on_kettle_description_Russell_Hobbs_Colours_Kettle_Cream(int arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

	@Then("^page for this kettle opens including button “Add to Basket”$")
	public void page_for_this_kettle_opens_including_button_Add_to_Basket() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

	@Given("^the page is open at Amazon UK’s Russell Hobbs (\\d+) kettle$")
	public void the_page_is_open_at_Amazon_UK_s_Russell_Hobbs_kettle(int arg1) throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

	@When("^I click on the  button “Add to Basket”$")
	public void I_click_on_the_button_Add_to_Basket() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
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
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
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
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}

	@Then("^“Review your order” page opens$")
	public void _Review_your_order_page_opens() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	    throw new PendingException();
	}
	
}
