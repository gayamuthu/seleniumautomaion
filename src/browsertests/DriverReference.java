package browsertests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverReference {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "./browserexe/chromedriver.exe");
		driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.close();
		System.setProperty("webdriver.edge.driver", "./browserexe/msedgedriver.exe");
		driver = new EdgeDriver();
		Thread.sleep(2000);
		driver.close();
		System.setProperty("webdriver.gecko.driver", "./browserexe/geckodriver.exe");
		driver = new FirefoxDriver();
		Thread.sleep(2000);
		driver.close();

	}

}
