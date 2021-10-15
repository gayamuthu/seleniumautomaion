package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./browserexe/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("gddharshini@gmail.com");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("gayamuthu@7");
		driver.findElement(By.xpath("//button[text()='Log In']")).click();
		Thread.sleep(2000);
        driver.close();    
	}

}
