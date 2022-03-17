package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IncidentReportingPage {
	
	public WebDriver driver;
	
	public  IncidentReportingPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By incidentDate=By.xpath("//div[@class='incidentReporting_box__3Fr47']/form[@class='incidentReporting_boxContent__9CzgB']/section[1]//input");
	By locationOfIncident=By.xpath("//div[@class='incidentReporting_box__3Fr47']/form[@class='incidentReporting_boxContent__9CzgB']/section[2]/div//input");
	By locationDetails=By.xpath("//div[@class='incidentReporting_box__3Fr47']/form[@class='incidentReporting_boxContent__9CzgB']/section[3]//input");
	By no=By.xpath("//div[@class='incidentReporting_box__3Fr47']/form[@class='incidentReporting_boxContent__9CzgB']/div//span[2]");
	By yes=By.xpath("//div[@class='incidentReporting_box__3Fr47']/form[@class='incidentReporting_boxContent__9CzgB']/div//span[1]");
	By patientName=By.xpath("//div[@class='incidentReporting_box__3Fr47']/form[@class='incidentReporting_boxContent__9CzgB']/section[4]//input");
	By complaintDate=By.xpath("//div[@class='incidentReporting_box__3Fr47']/form[@class='incidentReporting_boxContent__9CzgB']/section[5]//input");
	By complaintId=By.xpath("//div[@class='incidentReporting_box__3Fr47']/form[@class='incidentReporting_boxContent__9CzgB']/section[6]//input");
	By unSafeCondition=By.xpath("//input[@id='typeofInci1']");
	By incidentCategory=By.xpath("//div[@class='incidentReporting_form__plZOw']/section[1]/div//input");
	By incidentSubCategory=By.xpath("//div[@class='incidentReporting_form__plZOw']/section[2]/div//input");
	By addRow=By.xpath("//div[@data-testid='incident-category-form']//button[@class='btn secondary incidentReporting_addRow__D29oD']");
	By save=By.xpath("//*[@data-testid='irFormActions']/button[@class='btn secondary w-100'][2]");
	public WebElement getIncidentDate()
	{
		return driver.findElement(incidentDate);
	}
	
	public WebElement getLocationOfIncident()
	{
		return driver.findElement(locationOfIncident);
	}
	public WebElement getLocationOfdetail()
	{
		return driver.findElement(locationDetails);
	}
	public WebElement getNo()
	{
		return driver.findElement(no);
	}
	public WebElement getYes()
	{
		return driver.findElement(yes);
	}
	public WebElement getPatientName()
	{
		return driver.findElement(patientName);
	}
	public WebElement getComplaintDate()
	{
		return driver.findElement(complaintDate);
	}
	public WebElement getComplaintId()
	{
		return driver.findElement(complaintId);
	}
	public WebElement getUnsafeCondition()
	{
		return driver.findElement(unSafeCondition);
	}
	public WebElement getIncidentCategory()
	{
		return driver.findElement(incidentCategory);
	}
	public WebElement getIncidentSubCategory()
	{
		return driver.findElement(incidentSubCategory);
	}
	public WebElement getAddRow()
	{
		return driver.findElement(addRow);
	}
	public WebElement getSave()
	{
		return driver.findElement(save);
	}

    

}
