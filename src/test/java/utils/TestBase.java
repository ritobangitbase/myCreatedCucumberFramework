package utils;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class TestBase {
	WebDriver driver;
	private Properties properties;
	private final String propertyFilePath= "E:\\Workspace1\\Automation2\\src\\test\\resources\\global.properties";
	String driverPath, dataPath;
	
	public TestBase(){
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(propertyFilePath));
			properties = new Properties();
			try {
				properties.load(reader);
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
		}		
	}
	
	public String getUrl(){
		driverPath = properties.getProperty("QAUrl");
		if(driverPath!= null) return driverPath;
		else throw new RuntimeException("driverPath not specified in the Configuration.properties file.");		
	}
	
	public String getDataPath(){
		dataPath = properties.getProperty("testDataResourcePath");
		if(dataPath!= null) return dataPath;
		else throw new RuntimeException("dataPath not specified in the Configuration.properties file.");		
	}
	
	public WebDriver setDriver() {
		if(driver == null)
		{
			System.setProperty("webdriver.chrome.driver","E:\\Workspace1\\Automation2\\src\\test\\resources\\chromedriver.exe");
		  	 driver = new ChromeDriver();
				  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				  driver.get("http://www.google.com");
		}
		return driver;
	}
}
