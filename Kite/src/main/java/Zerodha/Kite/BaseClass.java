package Zerodha.Kite;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseClass {
	public WebDriver driver;
	
	
	public WebDriver	initDriver() throws IOException,FileNotFoundException{
		
		Properties prop = new Properties();
		
		FileInputStream FIS = new FileInputStream("C:\\Users\\bilal\\eclipse-workspace\\Kite\\src\\main\\java\\properties\\para.properties");
		
		prop.load(FIS);
		
		String browser = prop.getProperty("browser");
		String url = prop.getProperty("url");
		if(browser.equals("chrome"))
		{
			System.out.println("Test initiated using chrome browser");
			System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
			 driver = new ChromeDriver();
			 System.out.println(url);
			driver.get(url);
			
			
		}
		if(browser.equals("IE"))
		{
			System.out.println("Test initiated using IE  browser");
			System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
			 driver = new EdgeDriver();
			driver.get(url);
		}
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return driver;
}      
          // Default Implicit wait before test initiation 
}