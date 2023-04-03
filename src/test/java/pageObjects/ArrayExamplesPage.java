package pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ArrayExamplesPage {
	public WebDriver driver;
	WebDriverWait wait;

	public ArrayExamplesPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
		wait=new WebDriverWait(this.driver,Duration.ofSeconds(1));
	}
	
	@FindBy(xpath="//a[@href='array/practice']")
	WebElement prac_qns;
	
	@FindBy(xpath="//a[@href='/question/1']")
	WebElement search_arr;
	
	@FindBy(css="pre[class=' CodeMirror-line ']")
	WebElement qnstry_code;
	
	@FindBy(xpath="//*[@id='answer_form']/button")
	WebElement run_qns;
	
	@FindBy(xpath="//a[@href='/question/2']")
	WebElement max_cons;
	
	@FindBy(xpath="//a[@href='/question/3']")
	WebElement even_numb;
	
	@FindBy(xpath="//a[@href=\"/question/4\"]")
	WebElement sort_arr;
	
	public void practise_qns() {
		prac_qns.click();
	}
	
	public void search_array() {
		search_arr.click();
	}
	
	public void qns_try() {
		qnstry_code.clear();
		qnstry_code.click();
	}
	
	public void run_code() {
		run_qns.click();
	}
	public void max_consecutive() {
		max_cons.click();
	}
	
	public void find_even() {
		even_numb.click();
	}
	
	public void sort_array() {
		sort_arr.click();
	}
}
