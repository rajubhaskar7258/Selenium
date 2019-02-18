package testbase;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	
public static	WebDriver driver;

public static Properties prop;

	public TestBase() {
		try{
		prop =new Properties();
		FileInputStream fis= new FileInputStream("A:\\MavenWithJenkins\\HybridFrameWork\\src\\main\\java"
				+ "\\config\\Config.properties");
		
		prop.load(fis);


	}catch (Exception e) {
		// TODO: handle exception
	}
}


	public static void launchBrowser() {
		String browserName=	prop.getProperty("browser");
		if (browserName.equals("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "A:\\Automation\\FrameWork\\Drivers\\chromedriver.exe");
			
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);}
		
	}
	
	
	}







