package pages;

import java.io.FileNotFoundException;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testbase.TestBase;

public class LoginPage extends TestBase {
	
	
	



	@FindBy(id="email")
	WebElement userName;
	
	@FindBy(name="pass")
	WebElement password;
	
	@FindBy(xpath="//input[@value='Log In']") WebElement loginBtn;
	
	public LoginPage() throws Exception {
	    
		PageFactory.initElements(driver,LoginPage.class );
		
		new LoginPage();

	}
	

	public  HomePage login(String UN, String PW) throws Exception{
		

	 userName.sendKeys(UN);
		
		password.sendKeys(PW);
		loginBtn.click();
	
		return new HomePage();	
		
		
		
	
		
		
	}

}
