package selenium.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LeftSideDemo {

	@FindBy(linkText="Home")
	WebElement home;
	public void homelink(){
		home.click();
	}
	
	@FindBy(linkText="Flights")
	WebElement flights;
	public void flightslink(){
		flights.click();
	}
	
	@FindBy(linkText="Hotels")
	WebElement hotels;
	public void hotelslink(){
		hotels.click();
	}
	
	@FindBy(linkText="Car Rentals")
	WebElement rental;
	public void rentallink(){
		rental.click();
	}
	
	@FindBy(linkText="Cruises")
	WebElement cruises;
	public void cruiseslink(){
		cruises.click();
	}
	
	@FindBy(linkText="Destinations")
	WebElement destinations;
	public void destinationslink(){
		destinations.click();
	}
	
	@FindBy(linkText="Vacations")
	WebElement vacation;
	public void vacationlink(){
		vacation.click();
	}
	
}
