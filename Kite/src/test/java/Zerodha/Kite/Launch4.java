package Zerodha.Kite;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

public class Launch4 extends BaseClass {
	
	

	@Test
  public void   launchKite() throws IOException {
	  driver = initDriver();   //Initiate the driver
	  PageObject obj = new PageObject(driver);    //Create Page Object reference 
	  obj.search().sendKeys("ITC");
  }
  
  
	
	
}
