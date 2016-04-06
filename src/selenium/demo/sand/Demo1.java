package selenium.demo.sand;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Demo1 {

	public static void main(String[] args) {
		/*ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("kalyan");*/
		System.setProperty("webdriver.chrome.driver", "G:\\seleniumsw\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://google.com");
		driver.findElement(By.linkText("Gmail")).click();
		List<WebElement> list=driver.findElements(By.tagName("a"));
		System.out.println(list.size());
	}

}
