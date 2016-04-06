package selenium.naukri;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


public class NaukriLogin {

	WebDriver driver;
	ExtentTest test;
	ExtentReports reports;
	@BeforeTest
	public void setUp(){
		reports=new ExtentReports("G:\\practise\\Selenium\\Browser\\src\\com\\browse\\reports\\re.html", true);
		test=reports.startTest("Naukri test");
		driver=new FirefoxDriver();
		driver.get("https://login.naukri.com/nLogin/Login.php?msg=0&URL=http%3A%2F%2Fmy.naukri.com");
		test.log(LogStatus.INFO, "launched naukri");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	@Test(priority=0)
	public void login(){
		
		driver.findElement(By.id("emailTxt")).sendKeys("kaniyampatikc@gmail.com");
		test.log(LogStatus.INFO, "enter mail id");
		driver.findElement(By.id("pwd1")).sendKeys("9494144382");
		test.log(LogStatus.INFO, "enter pwd");
		driver.findElement(By.name("Login")).click();
		test.log(LogStatus.INFO, "click on login");
		/*WebElement log=driver.findElement(By.xpath("//*[@id='mainHeader']/div/div/ul[2]/li[2]/a"));
		Actions act=new Actions(driver);
		act.moveToElement(log).build().perform();
		driver.findElement(By.linkText("Edit Profile")).click();
		String tit1=driver.getTitle();
		Set<String> han=driver.getWindowHandles();
		Iterator<String> it=han.iterator();
		while(it.hasNext()){
			driver.switchTo().window(it.next());
			String tit2=driver.getTitle();
			if(!tit1.equals(tit2)){
				System.out.println("This is window 2");
				driver.findElement(By.id("name")).clear();
				driver.findElement(By.id("name")).sendKeys("chakravarthi");
			}
			
		}*/
		
		driver.findElement(By.xpath("//a[@href='http://my.naukri.com/Profile/edit?id=&altresid=']")).click();
		test.log(LogStatus.INFO, "click on snapshot");
		driver.findElement(By.id("name")).clear();
		driver.findElement(By.id("name")).sendKeys("chakravarthi");
		test.log(LogStatus.INFO, "enter text");
		driver.findElement(By.xpath("//*[@id='rPanel']/div/div/form/div[5]/div/button")).click();
		test.log(LogStatus.INFO, "enter save button");
	}
	@Test(priority=1)
	public void summary(){
		driver.findElement(By.xpath("//a[@href='http://my.naukri.com/Profile/editSummary?id=&altresid=']")).click();
		driver.findElement(By.id("summary")).clear();
		driver.findElement(By.id("summary")).sendKeys("TO DEVELOP MY CAREER AS A SOFTWARE ENGINEER WHERE I WILL BE AN APPRECIATED TEAM  MEMBER CONTRIBUTING QUALITY IDEAS AND WORK FOR MY ORGANIZATION WHERE THERE IS AN AMPLE SCOPE FOR BOTH THE INDIVIDUALS AS WELL AS ORGANIZATIONAL GROWTH");
		driver.findElement(By.xpath("//*[@id='editForm']/div[2]/div/button")).click();
	}
	@Test(priority=2)
	public void employer(){
		driver.findElement(By.xpath("//a[@href='http://my.naukri.com/EmploymentDetails/add?id=&altresid=']")).click();
		driver.findElement(By.id("Sug_companyName")).sendKeys("chakravarthi");
		driver.findElement(By.xpath("//*[@id='empType_C']")).click();
		driver.findElement(By.id("startMonth")).sendKeys("Apr");
		driver.findElement(By.id("startYear")).sendKeys("2014");
		driver.findElement(By.id("Sug_designation")).sendKeys("QA Enginner");
		driver.findElement(By.id("profile")).sendKeys("Software enginnering for qa process");
		driver.findElement(By.id("noticePeriod")).sendKeys("1 Months");
		driver.findElement(By.xpath("//*[@id='SaveEmp']")).click();
	}
	
	@AfterTest
	public void close(){
		reports.endTest(test);
		reports.flush();
	}
}
