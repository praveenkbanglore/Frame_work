package assignment_runpakeges;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Testngsript_pakage.generic_sript;

	public class runneer_sript1 extends genaric_sript1 {
		@Test
		public void run() throws InterruptedException
		{
			driver.findElement(By.id("email")).sendKeys("qspider");
			driver.findElement(By.id("pass")).sendKeys("dinesh22");
			driver.findElement(By.name("login")).click();
			Thread.sleep(4000);
			
			
		}
		@Test
		public void go() throws InterruptedException
		{
			driver.findElement(By.id("email")).sendKeys("hello world");
			driver.findElement(By.id("pass")).sendKeys("dinesh22dddd");
			driver.findElement(By.name("login")).click();
			Thread.sleep(4000);
			
		}
		

	

}
