package Testngsript_pakage;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class runnerscript extends generic_sript {
	@Test
	public void validLogin() throws InterruptedException
	{
		driver.findElement(By.id("email")).sendKeys("hello");
		driver.findElement(By.id("pass")).sendKeys("dinesh22");
		driver.findElement(By.name("login")).click();
		Thread.sleep(4000);
		String tittle = driver.getTitle();
		System.out.println(tittle);
		
	}
	

}
