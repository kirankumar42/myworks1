package selenium.java;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGDemo {

	
	@Test(priority=1)
	public void testA(){
		System.out.println("this is test 1");
	}
	@Test(priority=0)
	public void testF(){
		System.out.println("this is test 2");
	}
	@Test(priority=0)
	public void testC(){
		System.out.println("this is test 3");
	}
}
