package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import POM.Pomsript1;

public class Test_Script {
	@Test
	public void test()throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",
				"./software22/chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost/login.do");
		Pomsript1 p=new Pomsript1(driver);
		p.clickLogin();
		Thread.sleep(2500);
		driver.navigate().refresh();
		Thread.sleep(2500);
		p.clickLogin();
	}
	}



