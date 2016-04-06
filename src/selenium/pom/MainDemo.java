package selenium.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainDemo {

	@FindBy(name="userName")
	WebElement user;
	@FindBy(name="password")
	WebElement pass;
	@FindBy(name="login")
	WebElement log;
	public void findAFlight(String userName,String passWord){
		user.sendKeys(userName);
		pass.sendKeys(passWord);
		log.click();
	}
	
	@FindBy(linkText="your destination")
	WebElement destination;
	public void destinationLink(){
		destination.click();
	}
	
	@FindBy(linkText="featured vacation destinations")
	WebElement vacation;
	public void vacation(){
		vacation.click();
	}
	
	@FindBy(linkText="Register")
	WebElement register;
	public void register(){
		register.click();
	}
	
	@FindBy(linkText="Business Travel @ About.com")
	WebElement travel;
	@FindBy(linkText="Salon Travel")
	WebElement salon;
	public void links(){
		travel.click();
		salon.click();
	}
}

