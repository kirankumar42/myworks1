package browse.selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo {
	FirefoxDriver driver=null;
	@BeforeTest
	public void setUp(){
		driver=new FirefoxDriver();
		driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
	}
	@Test
	public void demo(){
		driver.findElement(By.name("txtUserName")).clear();
		driver.findElement(By.name("txtUserName")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).clear();
		driver.findElement(By.name("txtPassword")).sendKeys("admin");
		driver.findElement(By.name("Submit")).click();
		
		driver.findElement(By.xpath("//*[@id='option-menu']/li[3]/a")).click();
		Sleeper.sleepTightInSeconds(6);
	}
	@AfterTest
	public void close(){
		driver.close();
	}
}
