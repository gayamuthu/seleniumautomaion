package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsNewtours {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./browserexe/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://demo.guru99.com/test/newtours/");
driver.findElement(By.linkText("REGISTER")).click();
driver.findElement(By.name("firstName")).sendKeys("Gayathri");
driver.findElement(By.name("lastName")).sendKeys("Muthukumar");
driver.findElement(By.name("phone" )).sendKeys("5042320769");
driver.findElement(By.id("userName")).sendKeys("gddharshini@gmail.com");
driver.findElement(By.name("address1")).sendKeys("5460 mr lake dr");
driver.findElement(By.name("city")).sendKeys("cumming");
driver.findElement(By.name("state")).sendKeys("GA");
driver.findElement(By.name("postalCode")).sendKeys("30028");
driver.findElement(By.id("email")).sendKeys("gddharshini@gmail.com");
driver.findElement(By.name("password")).sendKeys("12345");
driver.findElement(By.name("confirmPassword")).sendKeys("12345");
driver.findElement(By.name("submit")).click();
	}

}
