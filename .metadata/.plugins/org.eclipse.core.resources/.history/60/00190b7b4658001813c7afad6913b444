package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class BuulbReadingPage extends BasePage{

	
		
		
	private By box1 = By.id("box1");	
	private By box2 = By.id("box2b");	
	private By box3 = By.id("box3");	
	private By box4 = By.id("box4");	
	private By box5 = By.id("box5");	
	private By box6 = By.id("box6");	
	private By date = By.id("date");
	private By submit = By.id("submit");

	
	
	public void meterReading(String val1,String val2 , String val3 ,String val4) {
		
		for(int i=0; i<5; i++) {
			
			enterTextTo(box1, val1);
			enterTextTo(box2, val1);
			enterTextTo(box3, val1);
			
			enterTextTo(box4, String.valueOf(val2));
			enterTextTo(box5, String.valueOf(val3));
			enterTextTo(box6, String.valueOf(val4));
		}
		public String generateMonthDateXpath_Datemeter(String month , String date){
			String genericXpath= "//div[@id='someid']//div[@class='month-box'][.//div[contains(@class,'month-title') and contains(text(),'"+"<MONTH>"+"')]]//span[text()='"+"<DATE>"+"']";
			String monthDateXpath= genericXpath.replace("<MONTH>", month).replace ("<DATE>", date);
			return monthDateXpath;
		}
		public void selectDateDropDown(String month,String date ){
			String genericSourceXpath= generateMonthDateXpath_Datemeter( month,date);
			clickOn(date);
		    clickOn(By.xpath(String.format(genericSourceXpath,month)));
		}
		
		
			
		public void submitClick()
		clickOn(submit);
			
		}
	}
		
		


}