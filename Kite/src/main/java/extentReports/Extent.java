package extentReports;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Extent {
 static	ExtentReports extent;
	@BeforeTest
	public  static ExtentReports generateReports() {
		System.out.println("report generation executed");
		String path = System.getProperty("user.dir")+"//reports/result.html";
		ExtentSparkReporter  repo = new ExtentSparkReporter(path);
		
		
		extent = new ExtentReports();
		extent.attachReporter(repo);
		return extent;
		
	}
	

}
