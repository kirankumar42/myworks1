package browse.selenium.Javascript;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class Javascript {
	FirefoxDriver driver;
	@BeforeTest
	public void setUp(){
		driver=new FirefoxDriver();
		driver.get("http://www.amazon.in/");
	}
	@Test
	public void scr(){
		JavascriptExecutor js=(JavascriptExecutor)driver;
		alert();
		driver.findElement(By.xpath(""));
		
	}
	public void alert(){
		try{
			Alert myal=driver.switchTo().alert();
			myal.accept();
		}catch(Exception e){
			
		}
	}
}
