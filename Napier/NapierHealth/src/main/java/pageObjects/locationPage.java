package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class locationPage {
	
	public WebDriver driver;
	public  locationPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By username=By.xpath("//input[@name='username']");
	By password=By.xpath("//input[@name='password']");
			
	By signIn=By.xpath("//button[@class='btn w-100']");
	By master=By.xpath("//a[@href='/masters/location']");
	By locationName=By.xpath("//input[@name='name']");
	By locationType=By.xpath("//td[@class='masters_inlineForm__3Lgb_']/form/section[2]/div//input");
	By toggleLocation=By.xpath("//section[@data-testid='toggleInput']");
	By addLocation=By.xpath("//button[@class='btn secondary']");
	By editLocation=By.xpath("//td[text()='AOP']/following::td[contains(@class,'Actions')]/button[@title='Edit']");
	By deleteLocation=By.xpath("//td[text()='AOPnew']/following::td[contains(@class,'Actions')]/button[@title='Delete']");
	By noLocationDeleteConfirmation=By.xpath("//button[@class='no btn secondary w-100']");
	By yesLocationDeleteConfirmation=By.xpath("//button[@class='yes btn secondary w-100']");
	
	public WebElement getUsername()
	{
		return driver.findElement(username);
	}
	
	public WebElement getPassword()
	{
		return driver.findElement(password);
	}
	
	public WebElement getSignIn()
	{
		return driver.findElement(signIn);
	}
	public WebElement getMaster()
	{
		return driver.findElement(master);
	}
	public WebElement getLocationName()
	{
		return driver.findElement(locationName);
	}
	public WebElement getLocationType()
	{
		return driver.findElement(locationType);
	}
	public WebElement getToggleLocation()
	{
		return driver.findElement(toggleLocation);
	}
	public WebElement getAddLocation()
	{
		return driver.findElement(addLocation);
	}
	public WebElement getEditLocation()
	{
		return driver.findElement(editLocation);
	}
	public WebElement getDeleteLocation()
	{
		return driver.findElement(deleteLocation);
	}
	public WebElement getNoLocationDeleteConfirmation()
	{
		return driver.findElement(noLocationDeleteConfirmation);
	}
	public WebElement getYesLocationDeleteConfirmation()
	{
		return driver.findElement(yesLocationDeleteConfirmation);
	}

}
