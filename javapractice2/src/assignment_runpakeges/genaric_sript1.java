package assignment_runpakeges;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class genaric_sript1 {
	public WebDriver driver;
	@BeforeMethod
	public void openAppln()
	{
		System.setProperty("webdriver.chrome.driver",
				"./software22/chromedriver.exe");
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	
	
	}
	@AfterMethod
	public void closeAppln()
	{
		driver.close();
	}
}
