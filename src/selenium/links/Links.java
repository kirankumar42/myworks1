package selenium.links;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Links {
	WebDriver driver;
	@BeforeTest
	public void setUp(){
		driver=new FirefoxDriver();
		driver.get("http://google.com");
	}
	@Test
	public void link(){
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("links size:"+links.size());
		for(int i=0;i<links.size();i++)
		{
			if(links.get(i).isDisplayed())
			{
				links.get(i).click();
				driver.navigate().back();
				links=driver.findElements(By.tagName("a"));
			}
		}
	}
}
