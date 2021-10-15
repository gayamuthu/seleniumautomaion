package browsertests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserNavigation {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./browserexe/chromedriver.exe");
 WebDriver driver=new ChromeDriver();
 driver.navigate().to("https://www.amazon.com/");
 System.out.println(driver.getTitle());
 driver.navigate().back();
 Thread.sleep(2000);
 driver.navigate().forward();
 Thread.sleep(2000);
 driver.navigate().refresh();
 Thread.sleep(2000);
 driver.close();
 
	}

}
