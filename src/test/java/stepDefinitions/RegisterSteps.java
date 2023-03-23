package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.PageObjectManager;
import utils.TestContextSetup;

public class RegisterSteps {
	TestContextSetup context;
	PageObjectManager pageObjectManager;
	
	public RegisterSteps(TestContextSetup context) {
		this.context=context;
	}
	
   @Given("User clicks on Get Started")
	public void user_clicks_on_get_started() {
	   //	System.setProperty("webdriver.chrome.driver","C:\\Users\\ravis\\Downloads\\chromedriver_win32\\chromedriver.exe");
	   context.pageObjectManager.getRegisterPage().clicksgetStarted();
	   
	   WebDriver driver;
	   driver = new ChromeDriver();
	   driver .get("https://dsportalapp.herokuapp.com");
	   driver.findElement(By.className("btn")).click();
   }  
	

	@When("User should see Register button in home page and clicks Register")
	public void user_should_see_register_button_in_home_page_and_clicks_register() {
		context.pageObjectManager.getRegisterPage().homeRegisterbtnFunction();
	    

	}

	@Then("User should navigate to Register Page")
	public void user_should_navigate_to_register_page() {
	    // Write code here that turns the phrase above into concrete actions
		context.pageObjectManager.getRegisterPage().registerRegisterbtnFunction();
	    
	}

	@When("User enters {string} {string} {string}")
	public void user_enters(String username, String password, String confirm_password) {
		context.pageObjectManager.getRegisterPage().userCredential(username,password,confirm_password);
		
		
		
	    
	    
	    
	}

	@Then("User clicks on Register button")
	public void user_clicks_on_register_button() {
		context.pageObjectManager.getRegisterPage().clickOnRegister();
		
	    
	    
	}

	@Then("User should see' <status _message>'")
	public void user_should_see_status__message() {
		context.pageObjectManager.getRegisterPage().statusMsgDisplayed();
		
		
	    
	    
	}


	

}
