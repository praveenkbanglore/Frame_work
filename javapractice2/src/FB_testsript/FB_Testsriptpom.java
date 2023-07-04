package FB_testsript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import POM.FB_pomsript;
import POM.Pomsript1;

public class FB_Testsriptpom {
		@Test
		public void test()throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver",
					"./softwares/chromedriver.exe");

			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
			FB_pomsript fb=new FB_pomsript(driver);
			fb.passUN("praveen");
			fb.passPWD("rajajinagar");
			Thread.sleep(2500);
			fb.btn();	
			Thread.sleep(2500);
		}
		}
