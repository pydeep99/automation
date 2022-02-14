package org.testing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class incedentReporting {


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
		//INCIDENT DETAILS
		driver.findElement(By.xpath("//div[@class='incidentReporting_box__3Fr47']/form[@class='incidentReporting_boxContent__9CzgB']/section[1]//input")).sendKeys("120220221839");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[@class='incidentReporting_box__3Fr47']/form[@class='incidentReporting_boxContent__9CzgB']/section[2]/div")).click();
		driver.findElement(By.xpath("//li[contains(text(),'Ward')]")).click();
		driver.findElement(By.xpath("//div[@class='incidentReporting_box__3Fr47']/form[@class='incidentReporting_boxContent__9CzgB']/section[3]//input")).sendKeys("nil");
		driver.findElement(By.xpath("//div[@class='incidentReporting_box__3Fr47']/form[@class='incidentReporting_boxContent__9CzgB']/div//span[2]")).click();
		driver.findElement(By.xpath("//div[@class='incidentReporting_box__3Fr47']/form[@class='incidentReporting_boxContent__9CzgB']/div//span[1]")).click();
		driver.findElement(By.xpath("//div[@class='incidentReporting_box__3Fr47']/form[@class='incidentReporting_boxContent__9CzgB']/section[4]//input")).sendKeys("Max");
		driver.findElement(By.xpath("//div[@class='incidentReporting_box__3Fr47']/form[@class='incidentReporting_boxContent__9CzgB']/section[5]//input")).sendKeys("10022022");
		driver.findElement(By.xpath("//div[@class='incidentReporting_box__3Fr47']/form[@class='incidentReporting_boxContent__9CzgB']/section[5]//input")).sendKeys(Keys.TAB);
		driver.findElement(By.xpath("//div[@class='incidentReporting_box__3Fr47']/form[@class='incidentReporting_boxContent__9CzgB']/section[5]//input")).sendKeys("0450");
		driver.findElement(By.xpath("//div[@class='incidentReporting_box__3Fr47']/form[@class='incidentReporting_boxContent__9CzgB']/section[6]//input")).sendKeys("1524");
		//TYPE OF INCEDENT
		
		driver.findElement(By.xpath("//div[@class='incidentReporting_typeOfIncident__3WGiq']/section/label[1]/input")).click();
		driver.findElement(By.xpath("//div[@class='incidentReporting_typeOfIncident__3WGiq']/section/label[2]/input")).click();
		driver.findElement(By.xpath("//div[@class='incidentReporting_typeOfIncident__3WGiq']/section/label[3]/input")).click();
		driver.findElement(By.xpath("//div[@class='incidentReporting_typeOfIncident__3WGiq']/section/label[4]/input")).click();
		driver.findElement(By.xpath("//div[@class='incidentReporting_typeOfIncident__3WGiq']/section/label[5]/input")).click();
		//INCIDENT CATEGORY
		driver.findElement(By.xpath("//div[@class='incidentReporting_form__plZOw']/section[1]/div")).click();
		driver.findElement(By.xpath("//li[contains(text(),'Medication')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='incidentReporting_form__plZOw']/section[2]/div")).click();
		driver.findElement(By.xpath("//li[contains(text(),'Sub')]")).click();
		//driver.findElement(By.xpath("//div[@class='incidentReporting_form__plZOw']/button")).click();
		
		
		//INCEDENT DESCRIPTION
		driver.findElement(By.xpath("(//textarea)[1]")).sendKeys(Keys.TAB);
		driver.findElement(By.xpath("(//textarea)[1]")).sendKeys("Immediate death");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@class='incidentReporting_box__3Fr47']//section//div[@class='elements_field__2avXh'])[4]")).click();
		driver.findElement(By.xpath("//li[contains(text(),'Neuro')]")).click();
		
		driver.findElement(By.cssSelector("input[name='headofDepart']")).sendKeys(Keys.TAB);
		Thread.sleep(2000);
		//CONTRIBUTING FACTORS
		driver.findElement(By.cssSelector("input[id='preventability1']")).click();
		driver.findElement(By.cssSelector("input[id='preventability2']")).click();
		driver.findElement(By.cssSelector("input[id='preventability3']")).click();
		driver.findElement(By.xpath("//div[@class='incidentReporting_actionWrapper__2rT1c']/table//tr/td/form/section[1]//textarea")).sendKeys("no action");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='incidentReporting_actionWrapper__2rT1c']/table//tr/td/form/section[2]")).click();
		driver.findElement(By.xpath("//li[contains(text(),'admin')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='incidentReporting_actionWrapper__2rT1c']/table//tr/td/form/section[3]//input")).sendKeys("15032021");
		driver.findElement(By.xpath("//div[@class='incidentReporting_actionWrapper__2rT1c']/table//tr/td/form/section[3]//input")).sendKeys(Keys.TAB);
		driver.findElement(By.xpath("//div[@class='incidentReporting_actionWrapper__2rT1c']/table//tr/td/form/section[3]//input")).sendKeys("0520");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@class='btn secondary'])[2]")).click();
		//EDITION OF IMMEDIATE ACTION
		//driver.findElement(By.xpath("//td[@class='elements_tableActions__1f4W0']/button[1]")).click();
		//driver.findElement(By.xpath("//div[@class='incidentReporting_actionWrapper__2rT1c']/table//tr/td/form/section[1]//textarea")).sendKeys("taken");
		//Thread.sleep(3000);
		//driver.findElement(By.xpath("//div[@class='incidentReporting_actionWrapper__2rT1c']/table//tr/td/form/section[2]")).click();
		//driver.findElement(By.xpath("//li[contains(text(),'ram')]")).click();
		//Thread.sleep(5000);
		//driver.findElement(By.xpath("//div[@class='incidentReporting_actionWrapper__2rT1c']/table//tr/td/form/section[3]//input")).sendKeys("18022021");
		//driver.findElement(By.xpath("//div[@class='incidentReporting_actionWrapper__2rT1c']/table//tr/td/form/section[3]//input")).sendKeys(Keys.TAB);
		//driver.findElement(By.xpath("//div[@class='incidentReporting_actionWrapper__2rT1c']/table//tr/td/form/section[3]//input")).sendKeys("0345");
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("//div[@class='incidentReporting_actionWrapper__2rT1c']/table//tr/td/form/div/button[1]")).click();
		Thread.sleep(2000);
		
		//DELETIONOF IMMEDIATE ACTION
		driver.findElement(By.xpath("//td[@class='elements_tableActions__1f4W0']/button[2]")).click();
		driver.findElement(By.xpath("//button[@class='yes btn secondary w-100']")).click();
		
		
		 //CRETION OF INCIDENT WITNESSED BY
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div/table[@class='elements_table__2JgxO incidentReporting_witnesses__17dic ']/tbody/tr//form/section[1]")).click();
		driver.findElement(By.xpath("//li[contains(text(),'ram')]")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//div/table[@class='elements_table__2JgxO incidentReporting_witnesses__17dic ']/tbody/tr//form/section[2]//input")).sendKeys("Lab");
		driver.findElement(By.xpath("(//button[@class='btn secondary'])[3]")).click();
		//DELETION OF INCIDENT WITNESSED BY
		driver.findElement(By.xpath("//td[@class='elements_tableActions__1f4W0']/button")).click();
		driver.findElement(By.xpath("//button[@class='yes btn secondary w-100']")).click();
		
		//Creation of incident notified by
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div/table[@class='elements_table__2JgxO incidentReporting_notified__m7tnA ']/tbody//td//section[1]")).click();
		driver.findElement(By.xpath("//li[contains(text(),'admin')]")).click();
		driver.findElement(By.xpath("//div/table[@class='elements_table__2JgxO incidentReporting_notified__m7tnA ']/tbody//td//section[3]//input")).sendKeys("14012021");
		driver.findElement(By.xpath("//div/table[@class='elements_table__2JgxO incidentReporting_notified__m7tnA ']/tbody//td//section[3]//input")).sendKeys(Keys.TAB);
		driver.findElement(By.xpath("//div/table[@class='elements_table__2JgxO incidentReporting_notified__m7tnA ']/tbody//td//section[3]//input")).sendKeys("0155");
		driver.findElement(By.xpath("(//button[@class='btn secondary'])[4]")).click();
		
		//Deletion of incident notified by
		driver.findElement(By.xpath("//td[@class='elements_tableActions__1f4W0']/button[2]")).click();
		driver.findElement(By.xpath("//button[@class='yes btn secondary w-100']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='incidentReporting_fieldWrapper__Kq2rJ']/section[4]/div")).click();
		driver.findElement(By.xpath("//li[contains(text(),'admin')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='btn secondary w-100'][2]")).click();
		driver.findElement(By.xpath("//button[@class='btn w-100']")).click();
		driver.findElement(By.xpath("//button[@class='yes btn secondary w-100']")).click();
		
	}
	

}
