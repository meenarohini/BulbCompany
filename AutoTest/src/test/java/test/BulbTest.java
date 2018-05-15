package test;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LandingPage;
import pages.BuulbReadingPage;
import util.ExcelReadData;
public class BulbTest extends BaseTest{











	@Test(dataProvider="BulbSearch")
	public void FlightButton(String testCaseName, String val1, String val2 ,  String val3, String month,String date){
		//System.out.println(testCaseName+"\t"+fromCity+"\t"+toCity+"\t"+"\t"+fromDate+"\t"+toDate+"\t"+radioOption);
		LandingPage landing = new LandingPage(driver);
		landing.openBulbTab();
		BuulbReadingPage bulb = new BuulbReadingPage(driver);
		
		
		bulb.meterReading(val1,val2,val3,val4);
		bulb.selectDateDropDown(month, date );
		bulb.submitClick();
		
		
		 
		
}
	
	@DataProvider(name="BulbSearch")
	public Object[][] getData(){
		Map<String,Map<String,String>> flightSearchData = ExcelReadData.getExcelData("src/test/resources/TestData1.xls", "FlightDetails");
		Object[][] myObjectArray = new Object[flightSearchData.values().size()][];
		Set<String> testCases = flightSearchData.keySet();
		Iterator<String> testCaseItr = testCases.iterator();
		for(int j=0 ;j < myObjectArray.length ; j++){
			Object[] testCaseData = null;
			String testCaseName = testCaseItr.next();
			Map<String,String> testCaseMap = flightSearchData.get(testCaseName);
			Collection<String> values =testCaseMap.values();
			Iterator<String> valuesItr = values.iterator();
			int testDataLength =values.size()+1;
			testCaseData =new Object[testDataLength];
			testCaseData[0] = testCaseName;
			for(int i=0; i< values.size(); i++){
				testCaseData[i+1] = valuesItr.next();
			}
				myObjectArray[j] = testCaseData;
				
			}
	return myObjectArray;	
	}
	}


