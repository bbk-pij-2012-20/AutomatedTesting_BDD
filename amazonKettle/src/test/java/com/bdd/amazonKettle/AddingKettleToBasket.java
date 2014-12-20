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

public class AddingKettleToBasket {
	
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
	
	@Given("^the page is open at Amazon UK’s 6th kettle$")
	public void the_page_is_open_at_Amazon_UK_s_6th_kettle() throws Throwable {
	
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
		
	}

	@When("^I click on the  button “Add to Basket”$")
	public void I_click_on_the_button_Add_to_Basket() throws Throwable {
	
		driver.findElement(By.id("add-to-cart-button")).click();

	}

	@Then("^page for purchasing this kettle opens with “(\\d+) item was added to your basket”$")
	public void page_for_purchasing_this_kettle_opens_with_item_was_added_to_your_basket(int arg1) throws Throwable {
		
		assertEquals("1 item was added to your basket", driver.findElement(By.id("confirm-text")).getText());
	
	}

	@Then("^includes buttons “Edit your Basket” and “Proceed to checkout”$")
	public void includes_buttons_Edit_your_Basket_and_Proceed_to_checkout() throws Throwable {
	
		assertEquals("Edit your Basket", driver.findElement(By.id("a-autoid-0-announce")).getText());
		assertEquals("Proceed to checkout", driver.findElement(By.id("hlb-ptc-btn-native")).getText());

	}
	
}
