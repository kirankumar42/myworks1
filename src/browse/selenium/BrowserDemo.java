package browse.selenium;


import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class BrowserDemo {
	public static void main(String[] args) {
		ProfilesIni p=new ProfilesIni();
		FirefoxProfile fox=p.getProfile("kalyan");
	FirefoxDriver driver=new FirefoxDriver(fox);
	driver.get("https://gmail.com");
	String acttitle=driver.getTitle();
	System.out.println(acttitle);
	
	}

}
