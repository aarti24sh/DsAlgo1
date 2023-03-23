package stepDefinitions;

<<<<<<< HEAD
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import utils.TestContextSetup;

public class Hooks {
	TestContextSetup context;
	public Hooks(TestContextSetup context) {
		this.context=context;
	}
	@After
	public void AfterScenario() throws IOException {
		context.testBase.WebDriverManager().quit();
		
	}
	@AfterStep
	public void AddScreenshot(Scenario scenario) throws IOException {
		WebDriver driver=context.testBase.WebDriverManager();
		if(scenario.isFailed()) {
			//screenshot
		File sourcePath=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		byte[] fileContent=FileUtils.readFileToByteArray(sourcePath);
			scenario.attach(fileContent,"image/png","image");
		}
=======
import java.io.IOException;
import java.sql.Driver;

import io.cucumber.java.After;
import utils.TestContextSetup;

public class Hooks {
	TestContextSetup testContextSetup;
	
public Hooks(TestContextSetup testContextSetup) {
	
	this.testContextSetup = testContextSetup;
}
	
	@After
	public void AfterScenario () throws IOException {
		
		testContextSetup.testBase.WebDriverManager().quit();
>>>>>>> f927ef609366a20a3e1e2913a37b685795d4a9bb
	}

}
