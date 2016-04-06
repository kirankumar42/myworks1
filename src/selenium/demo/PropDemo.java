package selenium.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class PropDemo {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fi=new FileInputStream("G:\\practise\\Selenium\\Browser\\src\\selenium\\properties\\demo.properties");
		Properties pr=new Properties();
		pr.load(fi);
		
		FirefoxDriver driver=new FirefoxDriver();
		driver.get(pr.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id(pr.getProperty("one"))).click();
		driver.findElement(By.id(pr.getProperty("from"))).click();
		driver.findElement(By.xpath(pr.getProperty("delhi"))).click();
		driver.findElement(By.xpath(pr.getProperty("tiru"))).click();
		//driver.findElement(By.id(pr.getProperty("to")));
		driver.findElement(By.className(pr.getProperty("calender"))).click();
		
	}
}
