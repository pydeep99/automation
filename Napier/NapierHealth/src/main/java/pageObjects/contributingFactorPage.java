package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class contributingFactorPage {

	public WebDriver driver;
	public  contributingFactorPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By contributingFactor=By.xpath("//ul[@class=\"dashboard_submenu__14D_q\"]//li[8]");
	By contributingFactorInput=By.xpath("//div[@class='masters_parent__3jYFG undefined']/table/tbody/tr[1]//td//section/div//input");
	By addContributingFactor=By.xpath("//div[@class='masters_parent__3jYFG undefined']/table/tbody/tr[1]/td//div[@class='masters_btns__37j8X']/button");
    By editContributingFactor=By.xpath("//span[text()='AOP']/following::td[contains(@class,'Actions')]/button[@title='Edit']");
	
	public WebElement getContributingFactor()
	{
		return driver.findElement(contributingFactor);
	}
	
	public WebElement getContributingFactorInput()
	{
		return driver.findElement(contributingFactorInput);
	}
	
	public WebElement getaddContributingFactor()
	{
		return driver.findElement(addContributingFactor);
	}
	
	public WebElement getEditContributingFactor()
	{
		return driver.findElement(editContributingFactor);
	}
}
