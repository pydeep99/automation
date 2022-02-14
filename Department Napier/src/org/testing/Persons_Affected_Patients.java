package org.testing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Persons_Affected_Patients {

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
		driver.findElement(By.xpath("//div[@class='masters_child__3-O_3 masters_personAffectedDetails__2eUON']/table/tbody/tr[1]/td//section//input")).sendKeys("PLAN");
		driver.findElement(By.xpath("//div[@class='masters_child__3-O_3 masters_personAffectedDetails__2eUON']/table/tbody/tr[1]/td//div[@class='masters_btns__37j8X']/button")).click();
		
		//EDITION OF PERSON AFFECTED PATIENTS
		driver.findElement(By.xpath("//div[@class='masters_child__3-O_3 masters_personAffectedDetails__2eUON']/table/tbody/tr[9]/td[@style]/input")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='masters_child__3-O_3 masters_personAffectedDetails__2eUON']/table/tbody/tr[9]/td[@style]/input")).click();
		driver.findElement(By.xpath("//div[@class='masters_child__3-O_3 masters_personAffectedDetails__2eUON']/table/tbody/tr[9]/td[@class]/button[1]")).click();
		driver.findElement(By.xpath("//div[@class='masters_child__3-O_3 masters_personAffectedDetails__2eUON']/table/tbody/tr[1]/td//section//input")).sendKeys("2");
		driver.findElement(By.xpath("//div[@class='masters_child__3-O_3 masters_personAffectedDetails__2eUON']/table/tbody/tr[1]//form/div/button[1]")).click();
		//DELETION OF PERSON AFFECTED PATIENTS
		
				Thread.sleep(3000);
				driver.findElement(By.xpath("//div[@class='masters_child__3-O_3 masters_personAffectedDetails__2eUON']/table/tbody/tr[9]/td[@class]/button[2]")).click();
				driver.findElement(By.xpath("//button[@class='yes btn secondary w-100']")).click();
				
		
	}

}
