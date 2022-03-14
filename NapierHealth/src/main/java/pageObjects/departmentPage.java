package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class departmentPage {

	public WebDriver driver;
	public  departmentPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By master=By.xpath("//a[@href='/masters/location']");
	By department=By.xpath("//a[@href='/masters/department']");
	By departmentName=By.xpath("//input[@name='name']");
	By add=By.xpath("//button[@class='btn secondary']");
	By delete=By.xpath("//td[text()='ABC']/following::td[contains(@class,'Actions')]/button[@title='Delete']");
	By yes=By.xpath("//button[@class='yes btn secondary w-100']");
	public WebElement getMaster()
	{
		return driver.findElement(master);
	}
	
	public WebElement getDepartment()
	{
		return driver.findElement(department);
	}
	
	public WebElement getDepartmentName()
	{
		return driver.findElement(departmentName);
	}
	
	public WebElement getAdd()
	{
		return driver.findElement(delete);
	}
	
	public WebElement getdelete()
	{
		return driver.findElement(delete);
	}
	
	public WebElement getYes()
	{
		return driver.findElement(yes);
	}
	
	
}
