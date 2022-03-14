package Automation.NapierHealth;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.departmentPage;
import resources.base;

public class Department extends base {

	LandingPage lp=new LandingPage(driver);
	WebElement Element=lp.getPassword();
	departmentPage dp=new departmentPage(driver);
	
	

	@Test(dataProvider="getData")
	
	public void credentialPage(String Username,String Password,String Abc) throws IOException
	{
	
		
		
		lp.getUsername().sendKeys(Username);
		lp.getPassword().sendKeys(Password);
		lp.getSignIn().click();	
		dp.getMaster().click();
		dp.getDepartment().click();
		dp.getDepartmentName().sendKeys(Abc);
		dp.getAdd().click();
		dp.getdelete().click();
		dp.getYes().click();
	
	}
	
	@DataProvider
	public Object[][] getData()
	{
		// Row stands for how many different data type should run
		// Column stands for how many values per each test
		Object[][] data=new Object[1][3];
		data[0][0]="Ganesh";
		data[0][1]="User@1";
		data[0][2]="ABC";
		
		return data;
	}

	@AfterTest
	public void teardown() {
		driver.close();
	}
}
