package stepDefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.PageObjectManager;
import utils.TestContextSetup;

public class ArrayExampleSteps {
	
	TestContextSetup context1;
	PageObjectManager pageObjectManager;
	 public WebDriver driver;
	
	public ArrayExampleSteps(TestContextSetup context1) {
		this.context1=context1;
		
	}
	
	@Given("User is logged in and registered user")
	public void user_is_logged_in_and_registered_user() {
		context1.pageObjectManager.getSignInPage().clicksgetStartedBtn();
		context1.pageObjectManager.getSignInPage().loginBtnFunction();
	}

	@When("User selects Array and navigates to array home page")
	public void user_selects_array_and_navigates_to_array_home_page() {
		context1.pageObjectManager.getArrayPage().getStartedArray();
	}

	@Then("User clicks Array in python link")
	public void user_clicks_array_in_python_link() {
		context1.pageObjectManager.getArrayPage().arr_phython();
		}

	@Then("user clicks Practice Questions")
	public void user_clicks_practice_questions() {
		context1.pageObjectManager.getArrayexamplePage().practise_qns();
	}

	@Then("User navigates to Practice questions Page")
	public void user_navigates_to_practice_questions_page() {
		System.out.println("i am in practise questions page");
	}

	@When("User clicks on the Search the array and redirected to the Search the array page")
	public void user_clicks_on_the_search_the_array_and_redirected_to_the_search_the_array_page() {
		context1.pageObjectManager.getArrayexamplePage().search_array();
	}

	@Then("User clicks on the Try Here box in Search the array and redirected")
	public void user_clicks_on_the_try_here_box_in_search_the_array_and_redirected() {
		context1.pageObjectManager.getArrayexamplePage().qns_try();
	}

	@When("User enters following code in  array examples editor")
	public void user_enters_following_code_in_array_examples_editor(io.cucumber.datatable.DataTable dataTable) {
		 List<String> value=dataTable.asList();
		    String input=value.get(0);
		    context1.pageObjectManager.getArrayexamplePage().qns_try();
		 driver.findElement(By.cssSelector("pre[class=' CodeMirror-line ']")).sendKeys(input);
	}

	@When("User clicks on Run in array examples")
	public void user_clicks_on_run_in_array_examples() {
		context1.pageObjectManager.getArrayexamplePage().run_code();
	}

	@Then("User is able to see output {string}")
	public void user_is_able_to_see_output(String string) {
		 if(string.equalsIgnoreCase("true"))
		    {
		    	System.out.println("success");
		    }
		    else if(string.equalsIgnoreCase("false"))
		    {
		   
		    }
	}

	@When("User clicks on the Max Consecutive ones and redirected")
	public void user_clicks_on_the_max_consecutive_ones_and_redirected() {
		context1.pageObjectManager.getArrayexamplePage().max_consecutive();
	}

	@Then("User clicks on the Try Here box in Max Consecutive ones and redirected")
	public void user_clicks_on_the_try_here_box_in_max_consecutive_ones_and_redirected() {
		context1.pageObjectManager.getArrayexamplePage().qns_try();
	}

	@When("User clicks on the Find numbers with even number of digits ones and redirected")
	public void user_clicks_on_the_find_numbers_with_even_number_of_digits_ones_and_redirected() {
		context1.pageObjectManager.getArrayexamplePage().find_even();
	}

	@Then("User clicks on the Try Here box in Find numbers with even number of digits ones and redirected")
	public void user_clicks_on_the_try_here_box_in_find_numbers_with_even_number_of_digits_ones_and_redirected() {
		context1.pageObjectManager.getArrayexamplePage().qns_try();
	}

	@When("User clicks on the Squares of Sorted Array and redirected")
	public void user_clicks_on_the_squares_of_sorted_array_and_redirected() {
		context1.pageObjectManager.getArrayexamplePage().sort_array();
	}

	@Then("User clicks on the Try Here box in Squares of Sorted Array and redirected")
	public void user_clicks_on_the_try_here_box_in_squares_of_sorted_array_and_redirected() {
		context1.pageObjectManager.getArrayexamplePage().qns_try();
	}

	@When("User enters {string}")
	public void user_enters(String string) {
		context1.pageObjectManager.getArrayexamplePage().qns_try();
		driver.findElement(By.cssSelector("pre[class=' CodeMirror-line ']")).sendKeys(string);
	}
}
