package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class credentialPage {
	
	WebDriver driver = null;
	By username_new = By.name("username");
	By password_new = By.name("password");
	
	public credentialPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void setTextInUserName(String textUsername) {
		driver.findElement(username_new).sendKeys(textUsername);
	}
	
	public void setTextInPassword(String textPassword) {
		driver.findElement(password_new).sendKeys(textPassword);;
	}
	
		
	}

/*public WebDriver driver;
	
	By username=By.cssSelector("[name='username']");
	By password=By.cssSelector("[name='password']");
	


	
	public WebElement getLogin()
	{
		return driver.findElement(username);
	}
	
	public WebElement getPassword()
	{
		return driver.findElement(password);
	}
}
*/