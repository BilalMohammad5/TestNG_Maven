package Zerodha.Kite;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

public class Launch extends BaseClass {
	
	// 4 helper attributes
	//group by tag
	//group by method name
	
	//depends on method
	
	//disabled enabled--
	
	//time out

	@Test(groups= {"smoke"})   //helper attribute
  public void   launchKite() throws IOException {
	  driver = initDriver();   //Initiate the driver
	  PageObject obj = new PageObject(driver);    //Create Page Object reference 
	  obj.search().sendKeys("ITC");
	 obj.search().click();
  }
  
  
	
	
}
