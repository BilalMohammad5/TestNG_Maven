package Zerodha.Kite;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageObject extends BaseClass {
	
	By search = By.id("txtSearchCompa");

	
	
	public PageObject(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
	}



	public WebElement search() {
		
		return  driver.findElement(search);
		
	}

}
