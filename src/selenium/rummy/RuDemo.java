package selenium.rummy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RuDemo {

	WebDriver driver;
	@BeforeTest
	public void setUp(){
		driver=new FirefoxDriver();
		driver.get("https://www.rummycircle.com/");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}
	
	@Test
	public void registerForm(){
		driver.findElement(By.xpath("//input[ends-with[@id,'username']")).sendKeys("dummaydemo");
		driver.findElement(By.xpath("//input[ends-with[@id,'password']")).sendKeys("dummay123");
		driver.findElement(By.xpath("//input[ends-with[@id,'email']")).sendKeys("chakravarthi@gmail.com");
		new Select(driver.findElement(By.xpath("//select[ends-with[@id,'year']"))).selectByVisibleText("1990");
		new Select(driver.findElement(By.xpath(" //select[ends-with[@id,'gender']"))).selectByVisibleText("Male");
		new Select(driver.findElement(By.xpath("//select[ends-with[@id,'state']"))).selectByVisibleText("Telangana");
		//driver.findElement(By.xpath("//input[ends-with[@id,'mobile']")).sendKeys("");
		//this is check box for special offer
		WebElement check=driver.findElement(By.xpath("//input[ends-with[@id,'splOffe']"));
		if(check.isSelected()){
			System.out.println("this is check box selected");
		}else{
			check.click();
		}
		
		driver.findElement(By.xpath("//*[@id='btn_register_desktop']")).click();
	}
	
	@AfterTest
	public void close(){
		
	}
}
