package pageObjects;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import testData.Customer;
import utils.TestContextSetup;

public class LoginPage {
	
	  public WebDriver driver;
	  public List<Customer> customerList;
	  
	  public LoginPage(WebDriver driver) {
		  this.driver = driver;
	  	  }
	
	
	
	public void seturl(Customer customer)
	{
		//Assert.assertEquals(true, false);
		
		System.out.println(customer.firstName);
		System.out.println(customer.lastName);
		
		//CUSTOM MSG
		/*
		 * enter_Phone(customer.phoneNumber.mob); enter_Email(customer.emailAddress);
		 * enter_City(customer.address.city);
		 * enter_Address(customer.address.streetAddress);
		 * enter_PostCode(customer.address.postCode);
		 * select_Country(customer.address.country);
		 * select_County(customer.address.county);
		 */
	}
	
		
}
