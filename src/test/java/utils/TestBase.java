package utils;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TestBase {
	
	public  WebDriver driver;
	public WebDriver WebDriverManager() throws IOException{


		
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"//src//main//resources//global.properties");
				Properties prop = new Properties();
				prop.load(fis);
				String url=prop.getProperty("Url");
				
				if(driver==null) {
					if(prop.getProperty("browser").equalsIgnoreCase("chrome")) {
				String path=System.getProperty("user.dir");
				System.setProperty("webdriver.chrome.driver","C:\\Users\\ravis\\Downloads\\chromedriver_win32\\chromedriver.exe");
				
				driver=new ChromeDriver();
					}
					if(prop.getProperty("browser").equalsIgnoreCase("msedge")) {
						String path=System.getProperty("user.dir");
						System.setProperty("webdriver.chrome.driver","C:\\Users\\ravis\\Downloads\\edgedriver_win64\\edgedriver.exe");
						driver=new EdgeDriver();
							}
					
				driver.get(url);
				}
				return driver;
							
	}		
							
}			
					//System.setProperty("webdriver.chromr.driver","C:\\Users\\ravis\\Downloads\\chromedriver_win32\\chromedriver.exe");
				  // driver = new ChromeDriver();//driver gets the life
				  // if(prop.getProperty("browser")=="edge")
				  // driver.get(url);
				
					
				
				


