package selenium.excel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GmailDemo {
	
	WebDriver driver;
	@BeforeTest
	public void setUp(){
		ProfilesIni p=new ProfilesIni();
		FirefoxProfile fp=p.getProfile("kalyan");
		driver=new FirefoxDriver(fp);
		driver.get("http://google.com");
	}
	@Test
	public void test(){
		driver.findElement(By.linkText("Gmail")).click();
	}
}
