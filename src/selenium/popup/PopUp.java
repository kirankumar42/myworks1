package selenium.popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PopUp {

	WebDriver driver;
	@BeforeTest
	public void setUp(){
		driver=new FirefoxDriver();
		driver.get("http://www.bing.com/");
	}
	@Test
	public void eenadu(){
		driver.findElement(By.partialLinkText("Office")).click();
	}
}
