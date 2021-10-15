package testngconcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BaseTest {
	
	WebDriver driver;
	@Test
	@BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "./browserexe/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
			
	}
	@AfterMethod
	public void teardown()
	{
		driver.close();
	}

}
