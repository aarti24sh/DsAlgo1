package pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DataStructuresIntroductionPage {
	
	public WebDriver driver;
	WebDriverWait wait;

	public DataStructuresIntroductionPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
		wait=new WebDriverWait(this.driver,Duration.ofSeconds(1));
	}
	
	@FindBy(xpath="//a[@href='data-structures-introduction']")
	WebElement GetStartedDS;
	
	@FindBy(xpath="//div[2]/h4")
	WebElement DSTitle;
	
	@FindBy(xpath="//a[@href='time-complexity']")
	WebElement timecomplex_DS;
	
	@FindBy(xpath="//a[@href='tryEditor']")
	WebElement timecom_try;
	
	@FindBy(xpath="//*[@id='answer_form']/div/div/div[6]/div[1]/div/div/div/div[5]/div/pre")
	WebElement try_code;
	
	@FindBy(xpath="//*[@id='answer_form']/button")
	WebElement run_button;
	
	public void getStartedDSFunction() {
		GetStartedDS.click();
	}
	
	public void DSTitleDisplay() {
		DSTitle.isDisplayed();
	}
	
	public void Time_complexity() {
		timecomplex_DS.click();
	}
	
	public void Time_tryfunc() {
		timecom_try.click();
	}
	
	public void try_codefun() {
		try_code.click();
		
	}
	
	public void run_code() {
		run_button.click();
	}

}
