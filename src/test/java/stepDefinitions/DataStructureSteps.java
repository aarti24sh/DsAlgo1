package stepDefinitions;

import pageObjects.PageObjectManager;
import utils.TestContextSetup;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import io.cucumber.java.en.When;


public class DataStructureSteps 
{
	
	TestContextSetup context1;
	PageObjectManager pageObjectManager;
	 public WebDriver driver;
	
	public DataStructureSteps(TestContextSetup context1) {
		this.context1=context1;
		
	}
	
	
	@Given("User is logged into the DS Algo portal")
	public void user_is_logged_into_the_ds_algo_portal() {
		context1.pageObjectManager.getSignInPage().clicksgetStartedBtn();
	}

	@When("User sign in into DS_Portal")
	public void user_sign_in_into_ds_portal() {
		context1.pageObjectManager.getSignInPage().loginBtnFunction();
	}

	@Then("User selects DataStructure by clicking Get started")
	public void user_selects_data_structure_by_clicking_get_started() {
		context1.pageObjectManager.getDSIntroPage().getStartedDSFunction();
	    
	}

	@Then("User is in DataStructure HomePage")
	public void user_is_in_data_structure_home_page() {
		
		context1.pageObjectManager.getDSIntroPage().DSTitleDisplay();
	}

	@Given("User is in the DataStructure page")
	public void user_is_in_the_data_structure_page() {
		
		context1.pageObjectManager.getDSIntroPage().DSTitleDisplay();
	}

	@When("User clicks on the Time complexity, User is redirected to the Time complexity page")
	public void user_clicks_on_the_time_complexity_user_is_redirected_to_the_time_complexity_page() {
		context1.pageObjectManager.getDSIntroPage().Time_complexity();
	   
	}

	@Then("User clicks on the Try Here box and redirected to the Try editor page")
	public void user_clicks_on_the_try_here_box_and_redirected_to_the_try_editor_page() {
		context1.pageObjectManager.getDSIntroPage().Time_tryfunc();
	}

	@When("User enters following code in ds editor")
	public void user_enters_following_code_in_ds_editor(DataTable dataTable) {
		
	    List<String> value=dataTable.asList();
	    String input=value.get(0);
	    context1.pageObjectManager.getDSIntroPage().try_codefun();
	    driver.findElement(By.xpath("//*[@id='answer_form']/div/div/div[6]/div[1]/div/div/div/div[5]/div/pre")).sendKeys(input);
	    
	     
	}

	@When("User clicks on Run in dspage")
	public void user_clicks_on_run_in_dspage() {
		context1.pageObjectManager.getDSIntroPage().run_code();
	}

	@Then("User is able to see a output {string}")
	public void user_is_able_to_see_a_output(String string) {
	    if(string.equalsIgnoreCase("true"))
	    {
	    	System.out.println("success");
	    }
	    else if(string.equalsIgnoreCase("false"))
	    {
	   
	    }
	}

	@When("User enter {string}")
	public void user_enter(String string) {
		 context1.pageObjectManager.getDSIntroPage().try_codefun();
		 driver.findElement(By.xpath("//*[@id='answer_form']/div/div/div[6]/div[1]/div/div/div/div[5]/div/pre")).sendKeys(string);
	}


}
