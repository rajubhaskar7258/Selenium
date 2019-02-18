package tests;

import java.io.FileNotFoundException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import testbase.TestBase;

public class LoginPageTest  extends TestBase{
	LoginPage loginpage ;
	HomePage homepage;
	public LoginPageTest() throws FileNotFoundException {
		super();
	
		
	}
	
	
	@BeforeMethod
	public void setUp() throws Exception{
		loginpage=new LoginPage();
		launchBrowser();
	}
	
	@Test
	public void login() throws Exception{
	
		driver.get(prop.getProperty("url"));
		
		
		homepage=loginpage.login(prop.getProperty("userid"), prop.getProperty("password"));
		
	}
	
	@AfterMethod
	public void tearDown(){
		//driver.quit();
		
	}
	
	

}
