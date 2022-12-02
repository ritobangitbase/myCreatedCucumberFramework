package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;

import testData.Customer;

public class PageObjectManager {
	
	public LoginPage loginPage;
	public WebDriver driver;
	//public List<Customer> customerList;
	
	
	public PageObjectManager(WebDriver driver)
	{
		this.driver = driver;
	}
	
	/*
	 * public PageObjectManager(WebDriver driver, List<Customer> customerList) {
	 * this.driver = driver; this.customerList= customerList; }
	 */

	public LoginPage getLoginPage()
	{
	
		loginPage= new LoginPage(driver);
		return loginPage;
	}
	
	/*
	 * public LoginPage getLoginPage() {
	 * 
	 * loginPage= new LoginPage(driver, customerList); return loginPage; }
	 */
	
	
}
