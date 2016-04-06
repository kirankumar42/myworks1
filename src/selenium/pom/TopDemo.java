package selenium.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TopDemo {

	@FindBy(linkText="SIGN-ON")
	WebElement sign;
	public void sign(){
		sign.click();
	}
	
	@FindBy(linkText="REGISTER")
	WebElement register;
	public void registerLink(){
		register.click();
	}
	
	@FindBy(linkText="SUPPORT")
	WebElement suport;
	public void suport(){
		suport.click();
	}
	
	@FindBy(linkText="CONTACT")
	WebElement contact;
	public void contact(){
		contact.click();
	}
}
