package Zerodha.Kite;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import java.io.File;
import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.apache.logging.log4j.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import Logs.LogFourJ;

public class BaseClass {
	public WebDriver driver;
	public static Logger log = LogManager.getLogger(BaseClass.class.getName());

	
	
	public WebDriver	initDriver() throws IOException,FileNotFoundException{
		
		Properties prop = new Properties();
		
		FileInputStream FIS = new FileInputStream("C:\\Users\\bilal\\eclipse-workspace\\Kite\\src\\main\\java\\properties\\para.properties");
		
		prop.load(FIS);
		
		String browser = prop.getProperty("browser");
		String url = prop.getProperty("url");
		if(browser.equals("chrome"))
		{
			//System.out.println("Test initiated using chrome browser");
			log.info("Test initiated using chrome browser");
			System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
			 driver = new ChromeDriver();
			 //System.out.println(url);
			driver.get(url);
			log.info(driver.getTitle());
			
			
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
	
	public void screenshot(String testCaseName , WebDriver driver) throws IOException {
		
		TakesScreenshot ts = (TakesScreenshot)driver;  //taking screenshot with help of driver
		File source = ts.getScreenshotAs(OutputType.FILE); // saving screenshot to a File
		String destinationFile = System.getProperty("user.dir")+"\\Reports\\"+testCaseName+".png"; //creating a PNG file with dynamic method name and web driver instance
		
		FileUtils.copyFile(source,new File(destinationFile)); //Transferring PNG file from  source to Destination location in project folder
		System.out.println("Ereor screenshot attached with "+testCaseName);
	}
	

	
}