package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase
{
	
	public  WebDriver driver;
	
	public WebDriver init_driver() throws IOException 
	{


		
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"//src//main//resources//global.properties");
				Properties prop = new Properties();
				prop.load(fis);
				String url=prop.getProperty("Url");
				
				if(driver==null)
				{
				if(prop.getProperty("browser").equalsIgnoreCase("chrome")) 
					{
			//	String path=System.getProperty("user.dir");
			//	System.setProperty("webdriver.chrome.driver","C:\\Users\\ravis\\Downloads\\chromedriver_win32\\chromedriver.exe");
				WebDriverManager.chromedriver().setup();
				//tlDriver.set(new ChromeDriver());
				driver=new ChromeDriver();
				
					}
				else if(prop.getProperty("browser").equalsIgnoreCase("msedge")) 
					{
						//String path=System.getProperty("user.dir");
						//System.setProperty("webdriver.chrome.driver","C:\\Users\\ravis\\Downloads\\edgedriver_win64\\edgedriver.exe");
						//driver=new EdgeDriver();
					WebDriverManager.edgedriver().setup();
					driver=new EdgeDriver();
					
					}
				driver.get(url);
				}
			
				driver.manage().deleteAllCookies();
				driver.manage().window().maximize();
				return driver;
							
	}		
		
}			
				
				
				


