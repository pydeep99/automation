import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Usermaster {

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
		//CREATION OF A NEW USER MASTER
		driver.findElement(By.xpath("//a[@href='/masters/location']")).click();		
		driver.findElement(By.cssSelector("a[href='/masters/userMaster']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("govind");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='masters_users__21AZX']//tbody//td[@class='masters_inlineForm__3Lgb_']//section[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[contains(text(),'Male')]")).click();
		driver.findElement(By.xpath("//input[@name='dob']")).sendKeys("2171999");
		driver.findElement(By.xpath("//input[@name='employeeId']")).sendKeys("57896");
		driver.findElement(By.xpath("//input[@name='contact']")).sendKeys("7012170487");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("gyzx@gamil.com");
		Thread.sleep(2000);
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(false)",driver.findElement(By.xpath("//div[@class='masters_users__21AZX']//tbody//td[@class='masters_inlineForm__3Lgb_']//section[9]")));
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("58693");
		
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='masters_users__21AZX']//tbody//td[@class='masters_inlineForm__3Lgb_']//section[8]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//li[contains(text(),'Gyn')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='btn secondary']")).sendKeys(Keys.TAB);
		driver.findElement(By.xpath("//button[@class='btn secondary']")).click();
		
		
		//EDITION OF USERMASTER
		driver.findElement(By.xpath("//div[@class='masters_users__21AZX']//tbody/tr[7]/td[@class]/button[1]")).click();
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("govind00");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='masters_users__21AZX']//tbody//td[@class='masters_inlineForm__3Lgb_']//section[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[contains(text(),'Female')]")).click();
		driver.findElement(By.xpath("//input[@name='dob']")).sendKeys("217199980");
		driver.findElement(By.xpath("//input[@name='employeeId']")).sendKeys("57896AS");
		driver.findElement(By.xpath("//input[@name='contact']")).clear();
		driver.findElement(By.xpath("//input[@name='contact']")).sendKeys("9074701149");
		driver.findElement(By.xpath("//input[@name='email']")).clear();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abc@gmail.com");
		
		Thread.sleep(2000);
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(false)",driver.findElement(By.xpath("//div[@class='masters_users__21AZX']//tbody//td[@class='masters_inlineForm__3Lgb_']//section[9]")));
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("58693854");
		
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='masters_users__21AZX']//tbody//td[@class='masters_inlineForm__3Lgb_']//section[8]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//li[contains(text(),'Car')]")).click();
		
		driver.findElement(By.xpath("//div[@class='masters_users__21AZX']//tbody//td[@class='masters_inlineForm__3Lgb_']//div[@class='masters_btns__37j8X']/button[1]")).click();
		
		//DELETION OF USERMASTER
				Thread.sleep(5000);
				driver.findElement(By.xpath("//div[@class='masters_users__21AZX']//tbody/tr[7]/td[@class]/button[2]")).click();
				driver.findElement(By.xpath("//button[@class='yes btn secondary w-100']")).click();
				
		
	}

}
