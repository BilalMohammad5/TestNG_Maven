package listernerConfig;


import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import Zerodha.Kite.BaseClass;
import extentReports.Extent; 

public class Listeners extends BaseClass implements ITestListener {
	ExtentReports  extObj = Extent.generateReports();
	ExtentTest test;
	WebDriver driver = null;
	
	@Override
	public void onTestStart(ITestResult result) {
		
		String testName = result.getMethod().getMethodName(); // Attaching test method Name Dynamically to report
		 
		 test = extObj.createTest(testName);
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Listener pass");
		test.log(Status.PASS, "Test passed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Attaching fail test log");
		
		//attaching fail test log 
		
		test.fail(result.getThrowable());
		
		// Attaching Screenshot upon failure
		System.out.println("Attaching Screenshot upon failure");
		
		
	String methodName = result.getMethod().getMethodName();
	System.out.println(" reteriving web driver instance");
		
	try {
		driver =(WebDriver)result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());
	
	} catch (Exception e) {
		// TODO Auto-generated catch block
		System.out.println("driver instance retrival failed");
		e.printStackTrace();
	}
	try {
		screenshot(methodName ,driver);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		System.out.println("Failed to take the screenshot");
	}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
	}

	@Override
	public void onStart(ITestContext context) {
	}

	@Override
	public void onFinish(ITestContext context) {
		extObj.flush();
	}



	
}

