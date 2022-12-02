package utils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import com.google.gson.Gson;
//import testData.Customer;

import testData.Customer;

public class JsonDataReader {
	private final String customerFilePath = "E:\\Workspace1\\Automation2\\src\\main\\java\\testDataResources\\Customer.json";
	private List<Customer> customerList;
	
	private Properties properties;
	private final String propertyFilePath= "E:\\Workspace1\\Automation2\\src\\test\\resources\\global.properties";
	String driverPath, dataPath;
	
	public JsonDataReader(){
		//customerList = getCustomerData();
		
	}
	
	public List<Customer> getCustomerData() {
		Gson gson = new Gson();
		BufferedReader bufferReader = null;
		try {
			bufferReader = new BufferedReader(new FileReader(customerFilePath));
			Customer[] customers = gson.fromJson(bufferReader, Customer[].class);
			return Arrays.asList(customers);
		}catch(FileNotFoundException e) {
			throw new RuntimeException("Json file not found at path : " + customerFilePath);
		}finally {
			try { if(bufferReader != null) bufferReader.close();}
			catch (IOException ignore) {}
		}
	}

}
