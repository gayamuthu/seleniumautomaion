package testngconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class GoogleSearch extends BaseTest {
	@Test
	public void test1()
	{
		driver.findElement(By.name("q")).sendKeys("selenium",Keys.ENTER);
	}

}
