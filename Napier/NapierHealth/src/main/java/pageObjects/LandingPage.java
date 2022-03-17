package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	public WebDriver driver;
	public  LandingPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	By username=By.xpath("//input[@name='username']");
	By password=By.xpath("//input[@name='password']");
			
	By signIn=By.xpath("//button[@class='btn w-100']");
	
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
	
}
