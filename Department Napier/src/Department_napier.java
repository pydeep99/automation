import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Department_napier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "D:\\IDM DOWNLOADS\\WebDrivers\\ChromeDriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://139.59.44.254/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin@mail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("12345678");
		driver.findElement(By.xpath("//button[@class='btn w-100']")).click();
		//CREATION OF A NEW DEPARTMENT
		driver.findElement(By.xpath("//a[@href='/masters/location']")).click();
		driver.findElement(By.xpath("//a[@href='/masters/department']")).click();
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Mortuary");
		driver.findElement(By.xpath("//button[@class='btn secondary']")).click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//EDITION
		driver.findElement(By.xpath("//td[text()='Mortuary']/following::td[contains(@class,'Actions')]/button[@title='Edit']")).click();
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("TODAY");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		//DELETION
		driver.findElement(By.xpath("//td[text()='Mortuary']/following::td[contains(@class,'Actions')]/button[@title='Delete']")).click();
		driver.findElement(By.xpath("//button[@class='yes btn secondary w-100']")).click();
		
	}

}
