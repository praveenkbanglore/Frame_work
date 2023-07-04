package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pomsript1 {
	
			@FindBy(xpath="//a[text()='Login']")
		private WebElement LoginBtn;
			public  Pomsript1(WebDriver driver)
			{
				PageFactory.initElements(driver, this);
			}
			public void clickLogin()
			{
				LoginBtn.click();
			}

}

