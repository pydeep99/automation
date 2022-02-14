package org.testing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RCA_Master {

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
		//CREATION OF A NEW RCA MASTER
		driver.findElement(By.xpath("//a[@href='/masters/location']")).click();
		driver.findElement(By.cssSelector("a[href='/masters/rca']")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("input[name='name']")).sendKeys("newrca");
		driver.findElement(By.cssSelector("section[data-testid='toggleInput']")).click();
		driver.findElement(By.cssSelector("button[class='btn secondary']")).click();
		
		
		
		//EDITION OF RCA MASTER 
		driver.findElement(By.cssSelector("button[title='Edit']")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("input[name='name']")).sendKeys("1");
		driver.findElement(By.cssSelector("section[data-testid='toggleInput']")).click();
		driver.findElement(By.cssSelector("button[class='btn secondary']")).click();
		//DELETION OF RCA MASTER
				Thread.sleep(3000);
				driver.findElement(By.cssSelector("button[title='Delete']")).click();
				driver.findElement(By.cssSelector("button[class='yes btn secondary w-100']")).click();
		
	}

}
