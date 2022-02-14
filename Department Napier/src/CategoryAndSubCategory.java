import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CategoryAndSubCategory {

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
		//CREATION OF A NEW CATEGORY
		driver.findElement(By.xpath("//a[@href='/masters/location']")).click();
		driver.findElement(By.xpath("//a[@href='/masters/categoryAndSubCategory']")).click();
		driver.findElement(By.xpath("//div[@class='masters_parent__3jYFG']/table[@class='elements_table__2JgxO  ']//td[@class='masters_inlineForm__3Lgb_']//input[@name='name']")).sendKeys("ambulance");
		driver.findElement(By.xpath("//div[@class='masters_parent__3jYFG']/table[@class='elements_table__2JgxO  ']//td[@class='masters_inlineForm__3Lgb_']//div[@class='masters_btns__37j8X']/button[@type='submit']")).click();
		
		Thread.sleep(3000);
		//EDITION OF A CATEGORY
		driver.findElement(By.xpath("//div[@class='masters_parent__3jYFG']/table/tbody/tr[3]/td[@class]/button[1]")).click();
		driver.findElement(By.xpath("//div[@class='masters_parent__3jYFG']/table[@class='elements_table__2JgxO  ']//td[@class='masters_inlineForm__3Lgb_']//input[@name='name']")).sendKeys("AMBULANCE");
		driver.findElement(By.xpath("//div[@class='masters_parent__3jYFG']/table/tbody/tr[1]//form/div/button[1]")).click();
		
		//DELETION OF A CATEGORY
				Thread.sleep(3000);
				driver.findElement(By.xpath("//tr[@class][2]/td[@class='elements_tableActions__1f4W0']/button[2]")).click();
				driver.findElement(By.xpath("//button[@class='yes btn secondary w-100']\r\n")).click();
		
		
	}

}

