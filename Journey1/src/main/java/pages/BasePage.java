package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import helper.ElementActions;

public class BasePage extends ElementActions{
	public BasePage(WebDriver driver){
	super(driver);	
	}
private String flightButton_xpath = "//ul[@class='be-tabs-snipe clearfix']//li//a[@id='booking_engine_flights']";

public void openFlightButton(){
	
	//mouseHover(By.xpath("flightButton_xpath"));
	
 clickOn(By.xpath(flightButton_xpath));
}


}
