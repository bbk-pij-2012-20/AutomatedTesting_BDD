Feature: open Amazon UK's home page
	As an Amazon customer 
	Sign in with account email and password 
	Search for product and add to shopping basket

	Scenario: I find Amazon UK’s sign in page and sign in correctly
		Given the page is open at Amazon UK’s home page
			And I already have an account with Amazon UK 
		When I click button “Hello, Sign in Your Account” 
			And I fill “My e-mail address is:” with “shahinzibaee@gmail.com”
			And I fill "Yes, I have a password:" with “magicword”
			And I click button labelled “Sign in using our secure server”
		Then “Your Account” page opens
			And I am logged in

	Scenario: I find Amazon UK’s sign in form and sign in incorrectly
		Given the page is open at Amazon UK’s home page
			And I already have an account with Amazon UK 
		When I click button “Hello, Sign in Your Account” 
			And I fill “My e-mail address is:” with “wrongEmail”
			And I fill "Yes, I have a password:" with “wrongPassword”
			And I click button labelled “Sign in using our secure server”
		Then login fails 
			And sign in page includes message “There was a problem with your request.” 

	Scenario: I search for kettles and pick the 6th in the list
		Given the page is open at Amazon UK’s “Your Account”
			And I am logged in to my account
		When I enter: “kettle” into “Search” bar
			And I click button labelled “go” or press return
		Then “results for “kettle”” page is open

	Scenario: I add 6th kettle from search results
		Given the page is open at search results for “kettle”
			And I am logged in to my account		
		When I click on 6th kettle
		Then page for this kettle opens including button “Add to Basket”

	Scenario: I add the selected kettle to my basket
		Given the page is open at Amazon UK’s 6th kettle
			And I am logged in to my account		
		When I click on the  button “Add to Basket”
		Then page for purchasing this kettle opens with “1 item was added to your basket”
			And includes buttons “Edit your Basket” and “Proceed to checkout” 

	Scenario: I verify the kettle is added to my shopping basket
		Given page generated by clicking on “Add to Basket”
			And I am logged in to my account	
		When I click on the button “Edit your Basket”
		Then “Shopping Basket” page opens
		
	Scenario: I proceed to check out
		Given “Shopping Basket” page is open
			And I am logged in to my account
		When I click on the button “Proceed to Checkout”
		Then “Review your order” page opens