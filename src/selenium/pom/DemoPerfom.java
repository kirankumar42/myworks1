package selenium.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class DemoPerfom {

	WebDriver driver;
	ExtentTest test;
	ExtentReports report;
	@BeforeTest
	public void setUp(){
		report=new ExtentReports("G:\\practise\\Selenium\\Browser\\src\\com\\browse\\reports\\tu.html", true);
		test=report.startTest("My sample test");
		
		driver=new FirefoxDriver();
		test.log(LogStatus.INFO, "browser launch");
		driver.get("http://newtours.demoaut.com/");
		test.log(LogStatus.INFO, "go to newtours site");
	}
	@Test
	public void TestCase1(){
		MainDemo mai=PageFactory.initElements(driver, MainDemo.class);
		test.log(LogStatus.INFO, "creat object of maindemo class");
		//TopDemo top=PageFactory.initElements(driver, TopDemo.class);
		LeftSideDemo lft=PageFactory.initElements(driver, LeftSideDemo.class);
		test.log(LogStatus.INFO, "create object of leftsidedemo class");
		mai.findAFlight("tutorial", "tutorial");
		test.log(LogStatus.INFO, "we cal call findaflight method");
		lft.destinationslink();
		test.log(LogStatus.INFO, "we can click on destionation link");
	}
	@AfterTest
	public void cloase(){
		report.endTest(test);
		report.flush();
	}
}
