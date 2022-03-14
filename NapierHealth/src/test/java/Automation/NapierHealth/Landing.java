package Automation.NapierHealth;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import resources.base;
public class Landing extends base {
	
	LandingPage lp=new LandingPage(driver);
	WebElement Element=lp.getPassword();
	

	@Test(dataProvider="getData")
	
	public void credentialPage(String Username,String Password) throws IOException
	{
	
		
		
		lp.getUsername().sendKeys(Username);
		lp.getPassword().sendKeys(Password);
		lp.getSignIn().click();	
	
	}
	
	@DataProvider
	public Object[][] getData()
	{
		// Row stands for how many different data type should run
		// Column stands for how many values per each test
		Object[][] data=new Object[1][2];
		data[0][0]="Ganesh";
		data[0][1]="User@1";
		
		return data;
	}

	@AfterTest
	public void teardown() {
		driver.close();
	}
}
