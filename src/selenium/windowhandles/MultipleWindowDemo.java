package selenium.windowhandles;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MultipleWindowDemo {

	WebDriver driver;
	@BeforeTest
	public void setUp(){
		/*ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("kalyan");*/
		System.setProperty("webdriver.chrome.driver", "G:\\seleniumsw\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.bing.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	@Test
	public void windowDemo(){
		String onewi=driver.getTitle();
		driver.findElement(By.linkText("Help")).click();
		Set<String> win=driver.getWindowHandles();
		for(String mulwin : win){
			driver.switchTo().window(mulwin);
			System.out.println("this is ");
			driver.findElement(By.linkText("Privacy & Cookies")).click();
		}
		
		/*for(String an: win){
			driver.switchTo().window(an);
			driver.findElement(By.linkText("http://www.microsoft.com/privacy")).click();
		}*/
	}
	@AfterTest
	public void close(){
		
	}
}
