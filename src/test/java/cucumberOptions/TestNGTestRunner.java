package cucumberOptions;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@io.cucumber.junit.CucumberOptions(features="src/test/java/features",glue="stepDefinitions",

monochrome=true,dryRun=true)


public class TestNGTestRunner extends AbstractTestNGCucumberTests 
{
	@Override
	@DataProvider(parallel=true)
	
public Object[][] scenarios(){
		
		return super.scenarios();
	}

}
