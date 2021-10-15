package browsertests;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Testfirefoxbrowser {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\workspace\\seleniumautomaion\\browserexe\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		Thread.sleep(2000);
		driver.close();
		
		
	}

}
