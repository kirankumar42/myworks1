package selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OrDemo {

	WebDriver driver;
	@BeforeTest
	public void setUp(){
		driver=new FirefoxDriver();
		driver.get("http://127.0.0.1/orangehrm-2.6/login.php");
	}
	
	@Test
	public void or(){
		driver.findElement(By.name("txtUserName")).sendKeys("user");
		String user=driver.findElement(By.name("txtUserName")).getAttribute("value");
		System.out.println("This is user:"+user);
		driver.findElement(By.name("txtPassword")).sendKeys("jfh");
		String pwd=driver.findElement(By.name("txtPassword")).getAttribute("value");
		System.out.println("This is pwd:"+pwd);
	}
}
