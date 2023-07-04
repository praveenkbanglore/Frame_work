package assignment_runpakeges;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DFemoqa {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./software22/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://demoqa.com/automation-practice-form");
}
}
