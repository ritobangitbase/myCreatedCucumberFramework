package utils;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebDriver;
import pageObjects.PageObjectManager;
import testData.Customer;
//import testData.JsonDataReader;
import testData.TestDataManager;


public class DataContextSetup {

	public WebDriver driver;
	public PageObjectManager pageObjectManager;
	public TestBase testBase;
	public TestDataManager testdatamanager;
	public JsonDataReader jdata;
	//public GenericUtils genericUtils;

	
	public DataContextSetup() throws IOException
	{
		jdata= new JsonDataReader();
		testdatamanager = new TestDataManager(jdata.getCustomerData());
	}
	
}
