package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.core.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class base {

	public WebDriver driver;
	public base()  
	{
		
		Properties prop= new Properties();
		FileInputStream fis;
		try {
			fis = new FileInputStream("C:\\Users\\Mahesh Mohanan\\eclipse-workspace\\NapierHealth\\src\\main\\java\\resources\\data.properties");
			prop.load(fis);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// C:\Users\Mahesh Mohanan\eclipse-workspace\NapierHealth\src\main\java\resources\data.properties
 catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String browserName=prop.getProperty("browser");
		
		
		if (browserName.equals("chrome"))
		{
			// execute in chrome driver
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Mahesh Mohanan\\eclipse-workspace\\NapierHealth\\chromedriver\\chromedriver.exe");
		    driver = new ChromeDriver();
		    driver.get("http://139.59.44.254/login");
		}
		
		
		else if (browserName=="firefox")
		{
			// execute in firefox
			//driver = new Firefox();
			
		}
		
		// Global wait time before failing test cases
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	
	}
	
	public void getScreenshotPath(String testCaseName, WebDriver driver)
	{
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source =ts.getScreenshotAs(OutputType.FILE);
		String destinationFile = System.getProperty("user.dir")+"\\reports\\"+testCaseName+".png";
		//FileUtils.copyFile(source,new File());
		try {
			FileHandler.copy(source, new File("System.getProperty(\"user.dir\")+\"\\\\reports\\\\\"+testCaseName+\".png\""));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}}
