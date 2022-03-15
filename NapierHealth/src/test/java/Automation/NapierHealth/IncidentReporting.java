package Automation.NapierHealth;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.IncidentReportingPage;
import pageObjects.LandingPage;
import resources.base;

public class IncidentReporting extends base {
	
	LandingPage lp=new LandingPage(driver);
	WebElement Element=lp.getPassword();
	IncidentReportingPage ip=new IncidentReportingPage(driver);
	
	

	@Test(dataProvider="getData")
	
	public void credentialPage(String Username,String Password, String date) throws IOException
	{
	
		
		
		lp.getUsername().sendKeys(Username);
		lp.getPassword().sendKeys(Password);
		lp.getSignIn().click();	
		ip.getIncidentDate().sendKeys(date);
		//ip.getLocationOfIncident().sendKeys("ICU");
		//ip.getLocationOfIncident().sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
		ip.getLocationOfdetail().sendKeys("nil");
		ip.getNo().click();
		ip.getYes().click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//ip.getPatientName().sendKeys("MAX");
		ip.getComplaintDate().sendKeys("10022022");
		ip.getComplaintDate().sendKeys(Keys.TAB);
		ip.getComplaintDate().sendKeys("0450");
		ip.getComplaintId().sendKeys("1524");
	
	}
	
	@DataProvider
	public Object[][] getData()
	{
		// Row stands for how many different data type should run
		// Column stands for how many values per each test
		Object[][] data=new Object[1][3];
		data[0][0]="Ganesh";
		data[0][1]="User@1";
		data[0][2]="120220221839";
		return data;
	}

	
	

}
