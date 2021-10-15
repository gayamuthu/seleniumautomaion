package browsertests;

import org.openqa.selenium.edge.EdgeDriver;

public class Testedgebrowser {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\workspace\\seleniumautomaion\\browserexe\\msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
		Thread.sleep(5000);
		driver.close();
	}

}
