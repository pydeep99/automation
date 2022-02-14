import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Risk_Assessment {

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
		//CREATION OF A NEW RISK ASSESSMENT 
		driver.findElement(By.xpath("//a[@href='/masters/location']")).click();
		driver.findElement(By.cssSelector("a[href='/masters/riskAssessment']")).click();
		
			Thread.sleep(2000);
		
		driver.findElement(By.xpath("//td[@class='masters_inlineForm__3Lgb_']//section[1]")).click();
		driver.findElement(By.xpath("//li[contains(text(),'Medium')]")).click();
		
	
			Thread.sleep(2000);
	
		driver.findElement(By.xpath("//td[@class='masters_inlineForm__3Lgb_']//section[3]")).click();
		driver.findElement(By.xpath("//li[contains(text(),'1')]")).click();
		
			Thread.sleep(2000);
		
		driver.findElement(By.xpath("//td[@class='masters_inlineForm__3Lgb_']//section[4]")).click();
		driver.findElement(By.xpath("//li[contains(text(),'High')]")).click();
	
			Thread.sleep(10000);
		
		driver.findElement(By.xpath("//td[@class='masters_inlineForm__3Lgb_']//section[5]/div")).click();
		driver.findElement(By.xpath("//li[contains(text(),'Red')]")).click();
	
			Thread.sleep(2000);
	
		driver.findElement(By.xpath("//td[@class='masters_inlineForm__3Lgb_']//section[6]")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		//EDITING A RISK ASSESMENT
				driver.findElement(By.xpath("//table//tr[3]/td/button[1]")).click();
				driver.findElement(By.xpath("//td[@class='masters_inlineForm__3Lgb_']//section[1]")).click();
				driver.findElement(By.xpath("//li[contains(text(),'Low')]")).click();
				
				
					Thread.sleep(2000);
			
				driver.findElement(By.xpath("//td[@class='masters_inlineForm__3Lgb_']//section[3]")).click();
				driver.findElement(By.xpath("//li[contains(text(),'2')]")).click();
				
					Thread.sleep(2000);
				
				driver.findElement(By.xpath("//td[@class='masters_inlineForm__3Lgb_']//section[4]")).click();
				driver.findElement(By.xpath("//li[contains(text(),'High')]")).click();
				
					Thread.sleep(5000);
				
				driver.findElement(By.xpath("//td[@class='masters_inlineForm__3Lgb_']//section[5]")).click();
				driver.findElement(By.xpath("//li[contains(text(),'Green')]")).click();
			
					Thread.sleep(2000);
			
				driver.findElement(By.xpath("//td[@class='masters_inlineForm__3Lgb_']//section[6]")).click();
				driver.findElement(By.xpath("//div[@class='masters_btns__37j8X']/button[1]")).click();
		
				//DELETING A RISK ASSESSMENT
				
				Thread.sleep(3000);
			
			driver.findElement(By.xpath("//table//tr[3]/td/button[2]")).click();
			driver.findElement(By.xpath("//button[@class='yes btn secondary w-100']")).click();
	}

}
