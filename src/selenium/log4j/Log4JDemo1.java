package selenium.log4j;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Log4JDemo1 {

	private static Logger log=Logger.getLogger(Log4JDemo1.class);
	public static void main(String[] args) {
		DOMConfigurator.configure("log4j.xml");
		FirefoxDriver driver=new FirefoxDriver();
		log.info("Browser launched");
		driver.get("http://opensource.demo.orangehrm.com/index.php/auth/login");
		log.info("Opened OrangeHRM");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		log.info("entered username");
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
		log.info("enterd password");
		driver.findElement(By.id("btnLogin")).click();
		log.info("clicked on login");
	}
}
