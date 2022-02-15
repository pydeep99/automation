package org.testing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Location {

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
		//CREATION OF LOCATION
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Operation theatre");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//td[@class='masters_inlineForm__3Lgb_']/form/section[2]/div")).click();
		driver.findElement(By.xpath("//li[contains(text(),'ICU')]")).click();
		driver.findElement(By.xpath("//section[@data-testid='toggleInput']")).click();
		driver.findElement(By.xpath("//button[@class='btn secondary']")).click();
		Thread.sleep(3000);
		//EDITION OF LOCATION 
		driver.findElement(By.xpath("//div[@class='masters_locations__3RJRj']//tbody/tr[5]/td[@class]/button[1]")).click();
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("2");
		driver.findElement(By.xpath("//td[@class='masters_inlineForm__3Lgb_']/form/section[2]/div")).click();
		driver.findElement(By.xpath("//li[contains(text(),'General')]")).click();
		driver.findElement(By.xpath("//section[@data-testid='toggleInput']")).click();
		driver.findElement(By.xpath("//td[@class='masters_inlineForm__3Lgb_']/form/div/button")).click();
		//DELETION OF LOCATION
				Thread.sleep(3000);
				driver.findElement(By.xpath("//div[@class='masters_locations__3RJRj']//tbody/tr[5]/td[@class]/button[2]")).click();
				driver.findElement(By.xpath("//button[@class='yes btn secondary w-100']")).click();
		
		
		
		
		
	}

}
