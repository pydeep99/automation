package Automation.NapierHealth;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.IncidentReportingPage;
import pageObjects.LandingPage;
import pageObjects.locationPage;
import resources.base;

public class location extends base {
	
	LandingPage lp=new LandingPage(driver);
	WebElement Element=lp.getPassword();
	IncidentReportingPage ip=new IncidentReportingPage(driver);
	JavascriptExecutor js = (JavascriptExecutor) driver;
	locationPage lcp=new locationPage(driver);
	
@Test(dataProvider="getData")
	
	public void credentialPage(String Username,String Password,String Operation,String ICU, String Operationnew, String OP) throws IOException
	{
	
		
		
		lp.getUsername().sendKeys(Username);
		lp.getPassword().sendKeys(Password);
		lp.getSignIn().click();	
		lcp.getMaster().click();
		// To add location
		lcp.getLocationName().sendKeys(Operation);
		lcp.getLocationType().sendKeys(ICU);
		lcp.getLocationType().sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
		lcp.getToggleLocation().click();
		lcp.getAddLocation().click();
		// To edit location
		lcp.getEditLocation().click();
		lcp.getLocationName().sendKeys(Operationnew);
		lcp.getLocationType().sendKeys(OP);
		lcp.getLocationType().sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
		lcp.getToggleLocation().click();
		lcp.getAddLocation().click();
		// To delete Location
		lcp.getDeleteLocation().click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		lcp.getNoLocationDeleteConfirmation().click();
		lcp.getDeleteLocation().click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		lcp.getYesLocationDeleteConfirmation().click();
		
	
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
		data[0][3]="ICU";
		data[0][4]="new";
		data[0][5]="OP";
		
		return data;
	}


}
