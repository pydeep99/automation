package org.testing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Person_Affected {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "D:\\IDM DOWNLOADS\\WebDrivers\\ChromeDriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://139.59.44.254/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin@mail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("12345678");
		driver.findElement(By.xpath("//button[@class='btn w-100']")).click();
		driver.findElement(By.xpath("//a[@href='/masters/location']")).click();
		//CREATION OF PERSON AFFECTED
		driver.findElement(By.cssSelector("a[href='/masters/personAffected']")).click();
		driver.findElement(By.xpath("//div[@class='undefined masters_parent__3jYFG']/table/tbody/tr[1]//td//section/div//input")).sendKeys("load");
		driver.findElement(By.xpath("//div[@class='undefined masters_parent__3jYFG']/table/tbody/tr[1]//td/form/div/button")).click();
		Thread.sleep(3000);
		
		//EDITION OF A PERSON AFFECTED
		driver.findElement(By.xpath("//div[@class='undefined masters_parent__3jYFG']/table[@class='elements_table__2JgxO  ']/tbody/tr[10]/td[@class]/button[1]")).click();
		driver.findElement(By.xpath("//div[@class='undefined masters_parent__3jYFG']/table/tbody/tr[1]//td//section/div//input")).sendKeys("load12");
		driver.findElement(By.xpath("//div[@class='undefined masters_parent__3jYFG']/table/tbody/tr[1]//td/form/div/button[1]")).click();
		Thread.sleep(3000);
		//DELETION OF PERSON AFFECTED
				driver.findElement(By.xpath("//div[@class='undefined masters_parent__3jYFG']/table[@class='elements_table__2JgxO  ']/tbody/tr[10]/td[@class]/button[2]")).click();
				driver.findElement(By.xpath("//button[@class='yes btn secondary w-100']")).click();
				
	}

}
