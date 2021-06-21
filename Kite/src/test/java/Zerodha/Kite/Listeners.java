package Zerodha.Kite;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult; 

public class Listeners implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Listener pass");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Listener fail");
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
	}



	
}

