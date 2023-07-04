package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FB_pomsript {
	@FindBy(id="email")
	private WebElement unField;
		@FindBy(id="pass")
		private WebElement pwdfield;
		@FindBy(name="login")
		private WebElement loginBtn;
		public FB_pomsript(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		public void passUN(String un)
		{
			unField.sendKeys(un);
		}
		
		public void passPWD(String pwd)
		{
			pwdfield.sendKeys(pwd);
		}
		
		
			public void btn()
		{
			loginBtn.click();
		}
	
	
}
