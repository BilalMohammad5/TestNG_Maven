package Zerodha.Kite;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

import org.testng.annotations.Test;

public class Launch2 extends BaseClass {
	
	

	@Test
  public void   launchKite() throws IOException, ClassNotFoundException, SQLException {
	  driver = initDriver();   //Initiate the driver
	  PageObject obj = new PageObject(driver);    //Create Page Object reference 
	  obj.search().sendKeys("ITC");
  }
  
  
	
	
}
