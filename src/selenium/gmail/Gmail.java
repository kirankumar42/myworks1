package selenium.gmail;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Gmail {
	WebDriver driver;
	@BeforeTest
	public void setUp(){
		driver=new FirefoxDriver();
		driver.get("http://gmail.com");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	}
	@Test
	public void gmail(){
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElement(By.id("Email")).sendKeys("kirankumarkumark@gmail.com");
		driver.findElement(By.id("next")).click();
		driver.findElement(By.id("Passwd")).sendKeys("9494144382");
		driver.findElement(By.id("PersistentCookie")).click();
		driver.findElement(By.id("signIn")).click();
		driver.findElement(By.xpath("//*[@id=':6k']/div/div")).click();
		//to add box
		driver.findElement(By.xpath("//td/div/div/textarea[@name='to']")).sendKeys("kaniyampatikc@gmail.com");
		driver.findElement(By.xpath("//td/div/div/textarea[@name='to']")).sendKeys(Keys.ENTER);
		//subject box
		driver.findElement(By.xpath("//div/input[@name='subjectbox']")).click();
		driver.findElement(By.xpath("//div/input[@name='subjectbox']")).sendKeys("This is Text mail");
		driver.findElement(By.xpath("//div/input[@name='subjectbox']")).sendKeys(Keys.ENTER);
		//driver.findElement(By.xpath("//*[@id=':cr']")).sendKeys("Hi kalyan this is text message");
		//write a text area
		driver.findElement(By.xpath("//td/div/div[starts-with(@id,':')]")).click();
		WebElement printbody = driver.switchTo().activeElement();
		printbody.sendKeys("Hi how are you");
		driver.switchTo().defaultContent();
		
		//driver.findElement(By.xpath("//td/div/div[starts-with(@id,':')]")).click();
		//driver.findElement(By.xpath("//td/div/div[starts-with(@id,':')]")).sendKeys("Hi");
		
		//submit button click
		driver.findElement(By.xpath("//div[text()='Send']")).click();
		//click on logout button
		driver.findElement(By.xpath("//*[@id='gb']/div[1]/div[1]/div[2]/div[4]/div[1]/a/span")).click();
		//click on sign out button
		driver.findElement(By.xpath("//*[@id='gb_71']")).click();
		
		
	}
}
