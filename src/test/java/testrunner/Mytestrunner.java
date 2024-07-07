package testrunner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

import org.testng.annotations.DataProvider;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/resources/feature_files/Login.feature"},
		glue = {"step_definitions","apphooks"},
		//html report and json report
		plugin = {"pretty","html:target/cucumber-reports","json:target/cucumber.json"},
		monochrome=true, // report display in the nice align format
		publish =true// publish the report on cloud
		
		)



public class Mytestrunner extends AbstractTestNGCucumberTests {
    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    } 
    
    }
