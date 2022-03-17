package Automation.NapierHealth;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.IncidentReportingPage;
import pageObjects.LandingPage;
import pageObjects.contributingFactorPage;
import pageObjects.locationPage;
import resources.base;

public class contributingFactor extends base{
	
	LandingPage lp=new LandingPage(driver);
	WebElement Element=lp.getPassword();
	IncidentReportingPage ip=new IncidentReportingPage(driver);
	JavascriptExecutor js = (JavascriptExecutor) driver;
	locationPage lcp=new locationPage(driver);
	contributingFactorPage cf=new contributingFactorPage(driver);
	
@Test(dataProvider="getData")
	
	public void credentialPage(String Username,String Password,String factor,String ICU, String Operationnew, String OP) throws IOException
	{
	
		
		
		lp.getUsername().sendKeys(Username);
		lp.getPassword().sendKeys(Password);
		lp.getSignIn().click();	
		lcp.getMaster().click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// To add
		cf.getContributingFactor().click();
		cf.getContributingFactorInput().sendKeys(factor);
		cf.getaddContributingFactor().click();
		// To edit
		cf.getEditContributingFactor().click();
		
	}
		
		@DataProvider
		public Object[][] getData()
		{
			// Row stands for how many different data type should run
			// Column stands for how many values per each test
			Object[][] data=new Object[1][6];
			data[0][0]="Ganesh";
			data[0][1]="User@1";
			data[0][2]="AOP";
			
			return data;
	}

}
