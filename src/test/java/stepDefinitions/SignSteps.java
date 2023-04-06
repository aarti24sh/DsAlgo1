package stepDefinitions;

import io.cucumber.java.en.Given;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.PageObjectManager;
import utils.TestContextSetup;

public class SignSteps {
	TestContextSetup context;
	PageObjectManager pageObjectManager;
	//String Excelpath ;
	

	public SignSteps(TestContextSetup context) {
		this.context=context;
		
	}
	
	@Then("User should see login username and password fields")
	public void user_should_see_login_username_and_password_fields() {
		context.pageObjectManager.getSignInPage().textFieldVisibility();
	}

	@When("User enters {string} and {string}")
	public void user_enters_and(String string, String string2) {
	
	
		/*ExcelReader reader = new ExcelReader();
		 ExcelReader.getexcelfilepath();
		List<Map<String, String>> testdata = reader.getData(Excelpath, string);
		String username= testdata.get(rownumber).get("username");
		String password = testdata.get(rownumber).get("password");*/
		
		
		
			context.pageObjectManager.getSignInPage().login(string, string2);
		
	    
	}

	@Then("User clicks on Login")
	public void user_clicks_on_login() {
		context.pageObjectManager.getSignInPage().loginBtnFunction();
	}
	@Then("Login failure message is displayed")
	public void login_failure_message_is_displayed() {
		context.pageObjectManager.getSignInPage().loginFailAlert();


}
	@Given("User clicks Get Started")
	public void user_clicks_get_started() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User clicks on sign in button")
	public void user_clicks_on_sign_in_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
}		