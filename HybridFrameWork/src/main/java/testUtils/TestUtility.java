package testUtils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pages.HomePage;

public class TestUtility {


@Test
public  void login() throws Exception{
	System.setProperty("webdriver.chrome.driver", "A:\\Automation\\FrameWork\\Drivers\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	driver.get("https://facebook.com");
 HomePage hp=PageFactory.initElements(driver, HomePage.class);
	hp.getusername().sendKeys("8333051083");


}


}
