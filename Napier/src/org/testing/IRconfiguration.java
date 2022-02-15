package org.testing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IRconfiguration {

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
		//CREATION OF A IR CONFIGURATION
		driver.findElement(By.xpath("//a[@href='/masters/location']")).click();
		driver.findElement(By.cssSelector("a[href='/masters/irCodeConfig']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//table[@class='elements_table__2JgxO  ']/tbody/tr[@style]//section")).click();
		driver.findElement(By.xpath("//li[contains(text(),'April')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//table[@class='elements_table__2JgxO  ']/tbody/tr[2]//section//input")).sendKeys("8");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//table[@class='elements_table__2JgxO  ']/tbody/tr[3]//section//input")).sendKeys("8");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//table[@class='elements_table__2JgxO  ']/tbody/tr[4]//section//input")).sendKeys("SER");
		
		driver.findElement(By.xpath("//table[@class='elements_table__2JgxO  ']/tbody/tr[5]//section")).click();
		driver.findElement(By.xpath("//li[contains(text(),'YYYY')]")).click();
		driver.findElement(By.xpath("//button[@class='btn primary w-100']")).click();
		driver.findElement(By.xpath("//button[@class='yes btn secondary w-100']")).click();
	}

}
