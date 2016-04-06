package browse.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testng {
	FirefoxDriver driver;
	@BeforeTest
	public void setUp(){
		driver=new FirefoxDriver();
		driver.get("http://google.com");
	}
	@Test
	public void text(){
		WebElement te=driver.findElement(By.linkText("Gmail"));
		System.out.println(te.getText());
	}
}
