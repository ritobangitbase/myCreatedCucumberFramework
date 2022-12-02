package utils;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import pageObjects.PageObjectManager;
import testData.TestDataManager;


public class TestContextSetup {

	public WebDriver driver;
	public PageObjectManager pageObjectManager;
	public TestBase testBase;
	public TestDataManager testdatamanager;
	public JsonDataReader jdata;
	//public GenericUtils genericUtils;

	
	public TestContextSetup() throws IOException
	{
		testBase = new TestBase();
		pageObjectManager = new PageObjectManager(testBase.setDriver());		
		//testdatamanager = new TestDataManager(jdata.getCustomerData());
		//jdata= new JsonDataReader();
		//genericUtils = new GenericUtils(testBase.WebDriverManager());
	}
	
}
