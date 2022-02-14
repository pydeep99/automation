package org.testing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Subcategory {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "D:\\IDM DOWNLOADS\\WebDrivers\\ChromeDriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://139.59.44.254/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin@mail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("12345678");
		driver.findElement(By.xpath("//button[@class='btn w-100']")).click();
		//CREATION OF A NEW SUBCATEGORY
		driver.findElement(By.xpath("//a[@href='/masters/location']")).click();
		driver.findElement(By.xpath("//a[@href='/masters/categoryAndSubCategory']")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//div[@class='masters_subCategory__3nzTi masters_child__3-O_3']/table/tbody//td[@class='masters_inlineForm__3Lgb_']/form/section[1]//input")).sendKeys("sub 2");
		driver.findElement(By.xpath("//div[@class='masters_subCategory__3nzTi masters_child__3-O_3']/table/tbody//td[@class='masters_inlineForm__3Lgb_']/form/section[2]//input")).sendKeys("2");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='masters_subCategory__3nzTi masters_child__3-O_3']/table/tbody//td[@class='masters_inlineForm__3Lgb_']/form/section[3]/input")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='masters_subCategory__3nzTi masters_child__3-O_3']/table/tbody//td[@class='masters_inlineForm__3Lgb_']/form/section[4]/input")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='masters_subCategory__3nzTi masters_child__3-O_3']/table/tbody//td[@class='masters_inlineForm__3Lgb_']/form/section[5]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='masters_subCategory__3nzTi masters_child__3-O_3']/table/tbody//td[@class='masters_inlineForm__3Lgb_']/form/div/button")).click();
		
		//EDITION OF A SUBCATEGORY 
		driver.findElement(By.xpath("//div[@class='masters_subCategory__3nzTi masters_child__3-O_3']/table/tbody/tr[3]/td[@class]/button[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='masters_subCategory__3nzTi masters_child__3-O_3']/table/tbody//td[@class='masters_inlineForm__3Lgb_']/form/section[1]//input")).sendKeys("0");
		driver.findElement(By.xpath("//div[@class='masters_subCategory__3nzTi masters_child__3-O_3']/table/tbody//td[@class='masters_inlineForm__3Lgb_']/form/section[2]//input")).sendKeys("3");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='masters_subCategory__3nzTi masters_child__3-O_3']/table/tbody//td[@class='masters_inlineForm__3Lgb_']/form/section[3]/input")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='masters_subCategory__3nzTi masters_child__3-O_3']/table/tbody//td[@class='masters_inlineForm__3Lgb_']/form/section[4]/input")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='masters_subCategory__3nzTi masters_child__3-O_3']/table/tbody//td[@class='masters_inlineForm__3Lgb_']/form/section[5]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='masters_subCategory__3nzTi masters_child__3-O_3']/table/tbody//td[@class='masters_inlineForm__3Lgb_']/form/div/button[1]")).click();
		//DELETION OF A SUB CATEGORY
		Thread.sleep(3000);
				driver.findElement(By.xpath("//div[@class='masters_subCategory__3nzTi masters_child__3-O_3']/table/tbody/tr[3]/td[@class]/button[2]")).click();
				driver.findElement(By.xpath("//button[@class='yes btn secondary w-100']")).click();
				
	}

}
