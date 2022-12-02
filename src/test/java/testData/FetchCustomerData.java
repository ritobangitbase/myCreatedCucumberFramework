package testData;

import java.util.List;

import org.openqa.selenium.WebDriver;

public class FetchCustomerData {
	
	 public List<Customer> customerList;
	 
	 public FetchCustomerData(List<Customer> customerList) {
		  this.customerList = customerList;
	  	  }

	 public Customer getCustomerByName(String customerName){
			// return customerList.stream().filter(x -> x.firstName.equalsIgnoreCase(customerName)).findAny().get();
		for(Customer customer : customerList) {
			if(customer.firstName.equalsIgnoreCase(customerName)) return customer;
		}
		return null;
		
	}
}
