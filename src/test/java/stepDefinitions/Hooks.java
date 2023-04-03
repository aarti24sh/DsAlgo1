package stepDefinitions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utils.TestBase;
import utils.TestContextSetup;

public class Hooks 
{
	private TestBase testbase;
	
	TestContextSetup context;
	public Hooks(TestContextSetup context) {
		this.context=context;
	}
	@Before(order=0)
	public void launchBrowser()
	{
		testbase=new TestBase();
		try {
			testbase.init_driver();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@After
	public void AfterScenario() throws IOException {
		context.testBase.init_driver().quit();
		
	}
	@AfterStep
	public void AddScreenshot(Scenario scenario) throws IOException {
		WebDriver driver=context.testBase.init_driver();
		if(scenario.isFailed()) {
			//screenshot
		File sourcePath=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		byte[] fileContent=FileUtils.readFileToByteArray(sourcePath);
			scenario.attach(fileContent,"image/png","image");
		}
	}

}
