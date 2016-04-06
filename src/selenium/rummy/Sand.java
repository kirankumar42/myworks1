package selenium.rummy;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.support.ui.Select;

public class Sand {

	
	public static void main(String[] args) throws InterruptedException {
		 
		WebDriver driver=new FirefoxDriver(); 
		System.out.println("Firefox browser is opened");
		
		driver.get("https://www.rummycircle.com/");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		
		
		if(driver.getTitle().contains("Rummy Online | Play Free Indian Rummy, 13 Card Games @ RummyCircle")) {
			System.out.println("Title as matched");
		} else{ 
			System.out.println("Title as not matched");
			//driver.close();
		}
		driver.manage().window().maximize();

		//Inseting data
		
		driver.findElement(By.cssSelector("#reg_username")).sendKeys("reddy");
		driver.findElement(By.cssSelector("#reg_password")).sendKeys("password");
		driver.findElement(By.cssSelector("#reg_email")).sendKeys("jkdsff@mail.com");
		new Select(driver.findElement(By.cssSelector("#reg_year"))).selectByVisibleText("1991");
		new Select(driver.findElement(By.cssSelector("#reg_gender"))).selectByVisibleText("Male");
		new Select(driver.findElement(By.cssSelector("#reg_state"))).selectByVisibleText("Telangana");
		driver.findElement(By.cssSelector("#btn_register_desktop")).click();

	}

}
