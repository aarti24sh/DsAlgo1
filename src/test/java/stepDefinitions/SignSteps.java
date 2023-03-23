package stepDefinitions;

import io.cucumber.java.en.Given;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.PageObjectManager;
import utils.TestContextSetup;

public class SignSteps {
	TestContextSetup context;
	PageObjectManager pageObjectManager;
	//String Excelpath;
	
	public SignSteps(TestContextSetup context) {
		this.context=context;
	}
	
	
	@Given("User clicks Get Started")
	public void user_clicks_get_started() {
<<<<<<< HEAD
=======
	
>>>>>>> f927ef609366a20a3e1e2913a37b685795d4a9bb
		context.pageObjectManager.getSignInPage().clicksgetStartedBtn();
	    
	}
	@When("User clicks on sign in button")
	public void user_clicks_on_sign_in_button() {
		context.pageObjectManager.getSignInPage().signInBtnFunction();
	    
	}

	@Then("User should see login username and password fields")
	public void user_should_see_login_username_and_password_fields() {
	    context.pageObjectManager.getSignInPage().textFieldVisibility();
	    
	}

	@When("User enters {string} and {string}")
	public void user_enters_and(String string, String string2) {
		 
	    
	    
	}

	@Then("User is logged in")
	public void user_is_logged_in() {
		context.pageObjectManager.getSignInPage().loginBtnFunction();
	   
	}

}
	