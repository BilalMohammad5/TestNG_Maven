package testRunner;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(
		
		features="src\\test\\java\\testRunner\\Runner.java",
		glue="src\\test\\java\\Zerodha\\Kite\\Launch.java"
		)
					
public class Runner extends AbstractTestNGCucumberTests{

	
	//converting junit runner file to test NG using cucumber - test NG plugin	
	
}
