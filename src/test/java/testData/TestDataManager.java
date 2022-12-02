package testData;

import java.util.List;

import org.openqa.selenium.WebDriver;

import pageObjects.LoginPage;
import utils.JsonDataReader;

public class TestDataManager {
	
	//public WebDriver driver;
	public List<Customer> customerList;
	FetchCustomerData fetchcustomerData;
	
	
	public TestDataManager(List<Customer> customerList)
	{
		this.customerList = customerList;
	}

	public FetchCustomerData getTestData()
	{
	
		fetchcustomerData= new FetchCustomerData(customerList);
		return fetchcustomerData;
	}
	
}
