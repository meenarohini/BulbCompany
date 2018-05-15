package base;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class using {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver = null;
		System.setProperty("webdriver.gecko.driver", "binaries2/geckodriver.exe");
		driver = new FirefoxDriver();
		Actions actions = new Actions(driver);
		
		 //WebDriverWait wait = new WebDriverWait(driver, 10);
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		String s = "Create multi-city route";
		
		driver.get("https://www.yatra.com/");
		 List <WebElement> li= driver.findElements(By.xpath("//div[@class='mor-option']//ul[@class='selc-flight-options prefer']//li"));
	       // System.out.println(li.size());
		   
		 for(int i=0;i<li.size();i++)
	                {
	                	System.out.println(li.get(i).getText());
	                	
	                   if( li.get(i).getText().equals(s)){
	                	   WebElement element = li.get(i);
	                	   actions.moveToElement(element).click().build().perform();
	                }
	                }

	}

}
