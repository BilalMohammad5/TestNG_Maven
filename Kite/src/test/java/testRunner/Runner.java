package testRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)

@CucumberOptions(
		
		features="src/test/java/features",
		glue="Zerodha.Kite"
		)
					
public class Runner extends AbstractTestNGCucumberTests{

	
	//converting junit runner file to test NG using cucumber - test NG plugin	
	
}
