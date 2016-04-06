package selenium.reports;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ReportDemo {
	
	WebDriver driver;
	ExtentReports report;
	ExtentTest test;
	
	@BeforeTest
	public void setUp(){
		//System.setProperty("webdriver.chrome.driver", "G:\\seleniumsw\\chromedriver.exe");
		driver=new FirefoxDriver();
		driver.get("http://google.com");
		
		report=new ExtentReports("G:\\practise\\Selenium\\Browser\\src\\com\\browse\\reports\\demo1.html", true);
		test=report.startTest("test1","This is selenium");
		test.log(LogStatus.INFO, "browser lanuch");
		report.endTest(test);
	}
	@Test(priority=0)
	public void launch(){
		driver.findElement(By.linkText("Gmail")).click();
		test.log(LogStatus.INFO, "click on gmail link");
		report.endTest(test);
	}
	@Test(priority=1)
	public void userName(){
		driver.findElement(By.id("Email")).sendKeys("chakravarthi");
		test.log(LogStatus.INFO, "enter user name");
		driver.findElement(By.linkText("gh")).click();
		test.log(LogStatus.INFO, "click on next link");
		report.endTest(test);
	}
	@AfterTest
	public void close(){
		
		report.flush();
	}
}
