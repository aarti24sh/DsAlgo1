package pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ArrayPage {
	public WebDriver driver;
	WebDriverWait wait;

	public ArrayPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
		wait=new WebDriverWait(this.driver,Duration.ofSeconds(1));
	}
	@FindBy(xpath="//a[@href='array']")
	WebElement GetStartedarray;
	
	@FindBy(xpath="//div[2]/h4")
	WebElement arrayTitle;
	
	@FindBy(xpath="//a[@href='arrays-in-python']")
	WebElement aphython;
	
	@FindBy(xpath="//a[@href='arrays-using-list']")
	WebElement arr_list;
	
	@FindBy(xpath="//a[@href='basic-operations-in-lists']")
	WebElement arr_operation;
	
	@FindBy(xpath="//a[@href='applications-of-array']")
	WebElement arr_application;
	
	@FindBy(xpath="//a[@href='/tryEditor]")
	WebElement array_try;
	
	@FindBy(xpath="//*[@id='answer_form']/div/div/div[6]/div[1]/div/div/div/div[5]/div/pre")
	WebElement try_code;
	
	@FindBy(xpath="//*[@id='answer_form']/button")
	WebElement run_button1;
	
	public void getStartedArray() {
		GetStartedarray.click();
	}
	
	public void arrayTitleDisplay() {
		arrayTitle.isDisplayed();
	}
	
	public void arr_phython() {
		aphython.click();
	}
	
	public void array_tryfunc() {
		array_try.click();
	}
	
	public void arr_trycode() {
		try_code.click();
		
	}
	
	public void array_run() {
		run_button1.click();
	}
	
	public void arr_listfun() {
		arr_list.click();
	}

	public void arr_basic_operations() {
		arr_operation.click();
	}
	public void arr_applications() {
		arr_application.click();
	}
}
