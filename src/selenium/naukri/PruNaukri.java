package selenium.naukri;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PruNaukri {

	WebDriver driver;
	@BeforeTest
	public void login()
	{
		  driver =new FirefoxDriver();
		  driver.get("https://login.naukri.com/");
		 // driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
@Test(priority=0)
public void loginnaukri()
     {
		driver.findElement(By.id("emailTxt")).sendKeys("kumarprudhvi.pk@gmail.com");
		driver.findElement(By.id("pwd1")).sendKeys("9177402994");
		driver.findElement(By.name("Login")).click();
}
@Test(priority=1)
public void snapshot()
       {
			driver.findElement(By.xpath("//*[@id='leftNav_updateProfile']/ul/li/a[1]")).click();
			driver.findElement(By.name("name")).clear();
			driver.findElement(By.name("name")).sendKeys("kumar");
			driver.findElement(By.id("title")).clear();
			driver.findElement(By.id("title")).sendKeys("software");
			new Select(driver.findElement(By.id("cityId"))).selectByVisibleText("Bengaluru / Bangalore");
			
			//new Select(driver.findElement(By.id("locationPrefId"))).selectByVisibleText("Ahmedabad");
			//new Select(driver.findElement(By.id("locationPrefId"))).selectByVisibleText("Delhi");
			
			
			new Select(driver.findElement(By.id("experienceYear"))).selectByVisibleText("3");
			new Select(driver.findElement(By.id("ctcLacs"))).selectByVisibleText("3");
			new Select(driver.findElement(By.id("ctcThousands"))).selectByVisibleText("10");
			//driver.findElement(By.id("experienceYear")).clear();			
			//driver.findElement(By.id("industryTypeId")).clear();
			new Select(driver.findElement(By.id("industryTypeId"))).selectByVisibleText("IT-Hardware & Networking");
			driver.findElement(By.id("mobile")).clear();
			driver.findElement(By.id("mobile")).sendKeys("9038564731");
			new Select(driver.findElement(By.id("industryTypeId"))).selectByVisibleText("Medical/Healthcare/Hospital");
			driver.findElement(By.id("contactAddress")).clear();
			driver.findElement(By.id("contactAddress")).sendKeys("bomman");
			new Select(driver.findElement(By.id("dobDay"))).selectByVisibleText("4");
			new Select(driver.findElement(By.id("dobMonth"))).selectByVisibleText("Mar");
			new Select(driver.findElement(By.id("dobYear"))).selectByVisibleText("1996");
			new Select(driver.findElement(By.id("gender"))).selectByVisibleText("Male");
			driver.findElement(By.id("mailCityName")).clear();
			driver.findElement(By.id("mailCityName")).sendKeys("Bangalore");
			driver.findElement(By.id("pincode")).clear();
			driver.findElement(By.id("pincode")).sendKeys("524114");
			new Select(driver.findElement(By.id("msritalStatus"))).selectByVisibleText("Married");
			driver.findElement(By.id("Sug_keywords")).clear();
			driver.findElement(By.id("Sug_keywords")).sendKeys("Automation Testing,Jenkins");
			driver.findElement(By.xpath("//*[@id='rPanel']/div/div/form/div[5]/div/button")).submit();
      }
@Test(enabled=false)
public void  summary()
    {
        	driver.findElement(By.xpath("//*[@id='leftNav_updateProfile']/ul/li/a[3]")).click();// href own way
        	driver.findElement(By.id("summary")).sendKeys("This is my summary");
        	driver.findElement(By.xpath("//*[@id='editForm']/div[2]/div/button")).submit();
    }
@Test(enabled=false)
public void designation()
   {
	        driver.findElement(By.xpath("//a[@href='http://my.naukri.com/EmploymentDetails/add?id=&altresid=']")).click();
	        driver.findElement(By.id("Sug_companyName")).clear();
	        driver.findElement(By.id("Sug_companyName")).sendKeys("prudhvi kumar");
	        driver.findElement(By.id("empType_C")).click();
	        new Select(driver.findElement(By.id("startMonth"))).selectByVisibleText("Mar");
	        new Select(driver.findElement(By.id("startYear"))).selectByVisibleText("2014");
	        new Select(driver.findElement(By.id("endMonth"))).selectByVisibleText("Mar");
	        new Select(driver.findElement(By.id("endYear"))).selectByVisibleText("2016");
	        driver.findElement(By.id("Sug_designation")).sendKeys("software engineer");
	        driver.findElement(By.id("profile")).sendKeys("My profile is clear"); 
	        driver.findElement(By.id("SaveEmp")).submit(); 

    }
@Test(enabled=false)
public void projects()
    {
	    driver.findElement(By.xpath("//a[@href='http://my.naukri.com/ITProjects/add?id=&altresid=']")).click();
	    driver.findElement(By.id("client")).sendKeys("csv");
	    driver.findElement(By.id("project")).sendKeys("ERP");
	    new Select(driver.findElement(By.name("startMonth"))).selectByVisibleText("Apr");
	    new Select(driver.findElement(By.name("startYear"))).selectByVisibleText("2013");
	    new Select(driver.findElement(By.name("endMonth"))).selectByVisibleText("Apr");
	    new Select(driver.findElement(By.name("endYear"))).selectByVisibleText("2016");
	    driver.findElement(By.name("location")).sendKeys("Hyd");
	    driver.findElement(By.id("onsite")).click();
	    driver.findElement(By.id("fTime")).click();
	    driver.findElement(By.id("details")).sendKeys("These are my details");
	    new Select(driver.findElement(By.id("designationId"))).selectByVisibleText("Sr. Project Leader");
	    driver.findElement(By.id("role")).sendKeys("QA engineer");
	    new Select(driver.findElement(By.id("teamSize"))).selectByVisibleText("5");
	    driver.findElement(By.id("Sug_skills")).sendKeys("Automation,jenkins,manual");
	    driver.findElement(By.xpath("//*[@id='editForm']/div[11]/div/button")).submit();
	    
	}
@Test(enabled=false)
public void skills()
   {
	 driver.findElement(By.xpath("//a[@href='http://my.naukri.com/ITSkills/edit?id=&altresid=']")).click();
	 //skill box1
	 driver.findElement(By.id("skillE1")).clear();
	 driver.findElement(By.id("skillE1")).sendKeys("Testing");
	 driver.findElement(By.name("version[]")).clear();
	 driver.findElement(By.name("version[]")).sendKeys("1.0");
	 new Select(driver.findElement(By.name("lastUsed[]"))).selectByVisibleText("2013");
	 new Select(driver.findElement(By.name("expYear[]"))).selectByVisibleText("2");
	 new Select(driver.findElement(By.name("expMonth[]"))).selectByVisibleText("7");
	 //skill box2
	 driver.findElement(By.id("skillE2")).clear();
	 driver.findElement(By.id("skillE2")).sendKeys("automation");
	 driver.findElement(By.xpath("//*[@id='skillTb_id']/tr[3]/td[2]/input")).clear();
	 driver.findElement(By.xpath("//*[@id='skillTb_id']/tr[3]/td[2]/input")).sendKeys("2.0");
	 new Select(driver.findElement(By.xpath("//*[@id='skillTb_id']/tr[3]/td[3]/select"))).selectByVisibleText("2013");
	 new Select(driver.findElement(By.xpath("//*[@id='skillTb_id']/tr[3]/td[4]/select[1]"))).selectByVisibleText("1");
	 new Select(driver.findElement(By.xpath("//*[@id='skillTb_id']/tr[3]/td[4]/select[2]"))).selectByVisibleText("7");
	 //skill box3
	 driver.findElement(By.id("skillE3")).clear();
	 driver.findElement(By.id("skillE3")).sendKeys("java");
	 driver.findElement(By.xpath("//*[@id='skillTb_id']/tr[4]/td[2]/input")).clear();
	 driver.findElement(By.xpath("//*[@id='skillTb_id']/tr[4]/td[2]/input")).sendKeys("1.7");
	 new Select(driver.findElement(By.xpath("//*[@id='skillTb_id']/tr[4]/td[3]/select"))).selectByVisibleText("2015");
	 new Select(driver.findElement(By.xpath("//*[@id='skillTb_id']/tr[4]/td[4]/select[1]"))).selectByVisibleText("3");
	 new Select(driver.findElement(By.xpath("//*[@id='skillTb_id']/tr[4]/td[4]/select[2]"))).selectByVisibleText("2");
	
	 driver.findElement(By.cssSelector(".w150bt.fl")).submit();
   }
@Test(enabled=false)
public void education()
  {
	 new Select(driver.findElement(By.id("ugcourseId"))).selectByVisibleText("B.A");
	 driver.findElement(By.id("fTimeUG")).click();
	 new Select(driver.findElement(By.id("ugspecId"))).selectByVisibleText("Hotel Management");
	 new Select(driver.findElement(By.id("uginstituteId"))).selectByVisibleText("Alagappa University");
	 new Select(driver.findElement(By.id("ugyearOfCompletion"))).selectByVisibleText("2019");
	 driver.findElement(By.id("submitButton")).submit();
  }
}
