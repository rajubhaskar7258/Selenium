package pages;

import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import testbase.TestBase;

public class HomePage extends TestBase{






@FindBy(id="email") public  WebElement userName;

@FindBy(name="pass")
WebElement password;

@FindBy(xpath="//input[@value='Log In']") WebElement loginBtn;


public HomePage() throws Exception{
	PageFactory.initElements(driver, this);
	
}

public WebElement getusername(){
	
	
	return userName;
	
}


}
