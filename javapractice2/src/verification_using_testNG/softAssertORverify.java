package verification_using_testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softAssertORverify {
	@Test
	public void runsript() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver",
				"./software22/chromedriver.exe");//
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://localhost/login.do");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("dinesh12");
		driver.findElement(By.xpath("//a[text()='Login ']")).click();	
		
		Thread.sleep(4000);
		
		String title = driver.getTitle();		
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(title,"hello ");//
	
		System.out.println("1");	
}	
}
