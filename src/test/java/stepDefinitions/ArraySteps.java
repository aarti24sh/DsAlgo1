package stepDefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.PageObjectManager;
import utils.TestContextSetup;

public class ArraySteps {
	
	TestContextSetup context1;
	PageObjectManager pageObjectManager;
	 public WebDriver driver;
	
	public ArraySteps(TestContextSetup context1) {
		this.context1=context1;
		
	}
	@When("user is a registered user")
	public void user_is_a_registered_user() {
		context1.pageObjectManager.getSignInPage().clicksgetStartedBtn();
		context1.pageObjectManager.getSignInPage().loginBtnFunction();
	}

	@Then("User is in homepage")
	public void user_is_in_homepage() {
	    
	}

	@Then("User selects the Array by clicking Get Started")
	public void user_selects_the_array_by_clicking_get_started() {
		context1.pageObjectManager.getArrayPage().getStartedArray();
	}

	@Then("User is in the Array Page")
	public void user_is_in_the_array_page() {
		context1.pageObjectManager.getArrayPage().arrayTitleDisplay();
	}

	@Given("User is in array page")
	public void user_is_in_array_page() {
		context1.pageObjectManager.getArrayPage().arrayTitleDisplay();
	}

	@When("User clicks on the Array in Python and redirected to the Array in Python page")
	public void user_clicks_on_the_array_in_python_and_redirected_to_the_array_in_python_page() {
		context1.pageObjectManager.getArrayPage().arr_phython();
	}

	@Then("User clicks on the Try Here box in Array in Python page and redirected to the Try editor page")
	public void user_clicks_on_the_try_here_box_in_array_in_python_page_and_redirected_to_the_try_editor_page() {
		context1.pageObjectManager.getArrayPage().array_tryfunc();
	}

	@When("User enters following code in python editor")
	public void user_enters_following_code_in_python_editor(io.cucumber.datatable.DataTable dataTable) {
		 List<String> value=dataTable.asList();
		    String input=value.get(0);
		context1.pageObjectManager.getArrayPage().arr_trycode();
		 driver.findElement(By.xpath("//*[@id='answer_form']/div/div/div[6]/div[1]/div/div/div/div[5]/div/pre")).sendKeys(input);
	}

	@When("User clicks on Run in Array in Python page")
	public void user_clicks_on_run_in_array_in_python_page() {
		context1.pageObjectManager.getArrayPage().array_run();
	}

	@Then("User is able to see a valid output {string}")
	public void user_is_able_to_see_a_valid_output(String string) {
		 if(string.equalsIgnoreCase("true"))
		    {
		    	System.out.println("success");
		    }
		    else if(string.equalsIgnoreCase("false"))
		    {
		   
		    }
		
	}

	

	@When("User clicks on the Array Using List and redirected to the Array Using List page")
	public void user_clicks_on_the_array_using_list_and_redirected_to_the_array_using_list_page() {
		context1.pageObjectManager.getArrayPage().arr_listfun();
	}

	@Then("User clicks on the Try Here box in Array Using List page and redirected to the Try editor page")
	public void user_clicks_on_the_try_here_box_in_array_using_list_page_and_redirected_to_the_try_editor_page() {
		context1.pageObjectManager.getArrayPage().array_tryfunc();
	}

	@When("User enters following code  in  List editor")
	public void user_enters_following_code_in_list_editor(io.cucumber.datatable.DataTable dataTable) {
		List<String> value=dataTable.asList();
	    String input=value.get(0);
	context1.pageObjectManager.getArrayPage().arr_trycode();
	 driver.findElement(By.xpath("//*[@id='answer_form']/div/div/div[6]/div[1]/div/div/div/div[5]/div/pre")).sendKeys(input);
	}

	@When("User clicks on Run in Array Using List page")
	public void user_clicks_on_run_in_array_using_list_page() {
		context1.pageObjectManager.getArrayPage().array_run();
	}

	@When("User clicks on the Basic Operations in List and redirected to List page")
	public void user_clicks_on_the_basic_operations_in_list_and_redirected_to_list_page() {
		context1.pageObjectManager.getArrayPage().arr_basic_operations();
	}

	@Then("User clicks on the Try Here box and redirected to the Try editor page Basic Operations in List Page")
	public void user_clicks_on_the_try_here_box_and_redirected_to_the_try_editor_page_basic_operations_in_list_page() {
		context1.pageObjectManager.getArrayPage().array_tryfunc();
	}

	@When("User enters following code in text editor")
	public void user_enters_following_code_in_text_editor(io.cucumber.datatable.DataTable dataTable) {
		List<String> value=dataTable.asList();
	    String input=value.get(0);
	context1.pageObjectManager.getArrayPage().arr_trycode();
	 driver.findElement(By.xpath("//*[@id='answer_form']/div/div/div[6]/div[1]/div/div/div/div[5]/div/pre")).sendKeys(input);
	}

	@When("User clicks on Run in Basic Operations in List Page")
	public void user_clicks_on_run_in_basic_operations_in_list_page() {
		context1.pageObjectManager.getArrayPage().array_run();
	}

	@When("User clicks on the Applications of Array,redirected to the Applications of Array page")
	public void user_clicks_on_the_applications_of_array_redirected_to_the_applications_of_array_page() {
		context1.pageObjectManager.getArrayPage().arr_applications();
	}

	@Then("User clicks on the Try Here box,redirected to Applications of Array Page")
	public void user_clicks_on_the_try_here_box_redirected_to_applications_of_array_page() {
		context1.pageObjectManager.getArrayPage().array_tryfunc();
	}

	@When("User enters following code in applications editor")
	public void user_enters_following_code_in_applications_editor(io.cucumber.datatable.DataTable dataTable) {
		List<String> value=dataTable.asList();
	    String input=value.get(0);
	context1.pageObjectManager.getArrayPage().arr_trycode();
	 driver.findElement(By.xpath("//*[@id='answer_form']/div/div/div[6]/div[1]/div/div/div/div[5]/div/pre")).sendKeys(input);
	}

	@When("User clicks on Run in Applications of Array Page")
	public void user_clicks_on_run_in_applications_of_array_page() {
		context1.pageObjectManager.getArrayPage().array_run();
	}

	@When("User enters in array pge {string}")
	public void user_enters_in_array_pge(String string) {
		context1.pageObjectManager.getArrayPage().arr_trycode();
		 driver.findElement(By.xpath("//*[@id='answer_form']/div/div/div[6]/div[1]/div/div/div/div[5]/div/pre")).sendKeys(string);
	}
	
}
