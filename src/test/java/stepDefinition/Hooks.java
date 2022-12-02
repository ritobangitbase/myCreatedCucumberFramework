package stepDefinition;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utils.TestBase;
import utils.TestContextSetup;


public class Hooks {
	
TestContextSetup testContextSetup;
	
	public Hooks(TestContextSetup testContextSetup)
	{
		
		this.testContextSetup = testContextSetup;
	}

	@Before("@SmokeTest")
	public void BeforeSanity() {
		System.out.println("Before Sanity");
	}
	
	@After("@SmokeTest")
	public void AfterSanity() {
		System.out.println("After Sanity");
		testContextSetup.pageObjectManager.driver.quit();
		}
	
	@AfterStep
	public void AddScreenshot(Scenario scenario) throws IOException, WebDriverException
	{
		//WebDriver driver =testContextSetup.testBase.setDriver();
		if(scenario.isFailed()) {
			System.out.println("Failed Screenshot");
			/*
			 * TakesScreenshot ts = (TakesScreenshot) driver; byte[] src =
			 * ts.getScreenshotAs(QutputType.BYTES); scenario.attach(src, "image/png",
			 * "screenshot");
			 */
			File screenshot = ((TakesScreenshot) testContextSetup.pageObjectManager.driver).getScreenshotAs(OutputType.FILE);
			  byte[] fileContent = FileUtils.readFileToByteArray(screenshot);
			  scenario.attach(fileContent, "image/png", "screenshot");
		}
	}
}
