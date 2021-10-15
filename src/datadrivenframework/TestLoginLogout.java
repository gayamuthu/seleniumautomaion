package datadrivenframework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestLoginLogout {
	WebDriver driver;

	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "./browserexe/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
	}

	@AfterMethod
	public void tearDown() {
		driver.close();
	}

	@Test(dataProvider="actidata")
	public void testlogin(String username, String password ) {

		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.id("loginButton")).click();

	}

	@DataProvider(name="actidata")
	public Object[][] testData() {

		Object[][] data = new Object[2][2];
		data[0][0] = "admin";
		data[0][1] = "manager";

		data[1][0] = "admin";
		data[1][1] = "manager";
		return data;
	}
}
