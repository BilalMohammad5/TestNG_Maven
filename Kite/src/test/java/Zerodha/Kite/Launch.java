package Zerodha.Kite;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

import org.testng.annotations.Test;

import io.cucumber.java.en.Given;

public class Launch extends BaseClass {
	
	// 4 helper attributes
	//group by tag
	//group by method name
	
	//depends on method
	
	//disabled enabled--
	
	//time out
	
	
   @Given("Launch Finology Home Page") //cucumber componey
	
  public void   launchKite() throws IOException, ClassNotFoundException, SQLException {
	  try {
		  
		driver = initDriver(); //Initiate the driver

	}   catch(Exception e)
	  {
		e.printStackTrace();
	  }
	  PageObject obj = new PageObject(driver);    //Create Page Object reference 
	  obj.search().sendKeys("ITC");
	 obj.search().click();
  }
  
  
	
	
}
