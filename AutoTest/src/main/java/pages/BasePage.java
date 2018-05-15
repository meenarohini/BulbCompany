
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import helper.ElementActions;

public class BasePage extends ElementActions{
	public BasePage(WebDriver driver){
	super(driver);	
	}
	private By buldTab = By.xpath("//tagname[@name='bulb']"); // roughly written i don't have any url
public void openBulbTab(){
	
	
	
 clickOn(bulbTab);
}


}
