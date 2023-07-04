package frames;

public class Tohandle_frames {
	///////wht..????

	System.setProperty("webdriver.gecko.driver",
			"./software22/geckodriver.exe");

	 driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/prave/OneDrive/Desktop/page.html");
	Thread.sleep(2000);
	driver.findElement(By.id("un")).sendkeys("ABC");
	//driver.switchTo().frame(0);
	//driver.switchto().frame("f1");
	driver.findElement(By.xpath("//iframe[@id='f1']"));
	driver.switchTo().frame(ele);
	Thread.sleep(2000);
	driver.findElement(By.id("pwd")).sendkeys("xyz");
}


}
