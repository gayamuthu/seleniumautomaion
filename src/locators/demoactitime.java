package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoactitime {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./browserexe/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.actitime.com/demo-request");
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Gayathri");
		
	}

}
