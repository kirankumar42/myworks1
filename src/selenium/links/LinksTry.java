package selenium.links;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LinksTry {
	WebDriver driver;
	@BeforeTest
	public void setup(){
		driver=new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/");
	}
	@Test
	public void exce(){
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		try{
			driver.findElement(By.linkText("Pruthvi")).click();
		}catch (Exception e) {
			System.out.println("your link text not present");
		}
		driver.findElement(By.linkText("REGISTER")).click();
		
			
	}
}
