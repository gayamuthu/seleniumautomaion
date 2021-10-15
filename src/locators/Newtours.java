package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Newtours {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./browserexe/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/newtours/register.ph");
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Gayathri");
		driver.findElement(By.xpath("//input[contains(@name,'lastName')]")).sendKeys("Muthukumar");
		driver.findElement(By.xpath("//input[contains(@name,'phone')]")).sendKeys("1234567890");
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("Gayathri@testmail.com");
		driver.findElement(By.xpath("//input[starts-with(@name,'address1')]")).sendKeys("RT Nagar");
		driver.findElement(By.xpath("//input[@name='city']/following::input[6]")).sendKeys("Cumming");
		driver.findElement(By.xpath("//input[contains(@name,'state')]")).sendKeys("GA");
		driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("30028");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Gayathri@testmail.com");
		driver.findElement(By.xpath("//input[contains(@name,'password')]")).sendKeys("2345");
		driver.findElement(By.xpath("//input[contains(@name,'confirmPassword')]")).sendKeys("2345");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		Thread.sleep(2000);
        driver.close();
	}

}
