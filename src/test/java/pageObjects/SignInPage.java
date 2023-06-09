package pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignInPage {

	public WebDriver driver;
	WebDriverWait wait;
	public SignInPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
		wait=new WebDriverWait(this.driver,Duration.ofSeconds(1));
	}
	@FindBy(xpath="//input[@type='text']")
	WebElement usernamefield;
	@FindBy(xpath="//input[@type='password']")
	WebElement pwdfield;
	@FindBy(xpath="//input[@type='submit']")
	WebElement loginBtn;
	@FindBy(xpath="//div[@class='alert alert-primary']")
	WebElement LoginFailAert;
	
	public void loginBtnFunction() {
		loginBtn.click();
	}
	public void textFieldVisibility() {
		usernamefield.isDisplayed();
		pwdfield.isDisplayed();
	}
	public void login(String un,String pd) {
		usernamefield.sendKeys(un);
		pwdfield.sendKeys(pd);
	}
	public void loginFailAlert() {
		LoginFailAert.isDisplayed();
		System.out.println(LoginFailAert);
	}
	

	
	

}
