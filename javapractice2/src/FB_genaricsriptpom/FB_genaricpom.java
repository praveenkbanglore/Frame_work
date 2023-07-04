package FB_genaricsriptpom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class FB_genaricpom {
	WebDriver driver;
	@BeforeTest
	public void openfb()
	{
		System.setProperty("webdriver.chrome.driver",
				"./software22/chromedriver.exe");

		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	}
	@AfterTest
	public void closefb()
	{
		driver.close();
	}

}
