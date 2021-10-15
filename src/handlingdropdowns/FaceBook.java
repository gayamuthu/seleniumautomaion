package handlingdropdowns;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./browserexe/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@id='u_0_2_6A')]")).click();
		driver.findElement(By.id("u_0_2_6A")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("firstname")).sendKeys("Gayathri");
		driver.findElement(By.name("lastname")).sendKeys("Muthukumar");
		driver.findElement(By.name("reg_email__")).sendKeys("1234567890");
		driver.findElement(By.id("password_step_input")).sendKeys("asdfg");
		WebElement month = driver.findElement(By.id("month"));
		Select sel=new Select(month);
		sel.selectByIndex(6);
		

	}

}
