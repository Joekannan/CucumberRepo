package runner;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import utility.BaseTest;


@CucumberOptions(
        features = "src/test/resources/features",
        glue="stepDefinition",
        plugin = { "json:target/cucumber-reports/cucumber.json",
                "pretty", "html:target/html-report/cucumber-html-reports.html",
                "junit:target/cucumber-reports/cucumber.xml" }
        )

public class TestRunner extends AbstractTestNGCucumberTests {
	
	@BeforeMethod
	public void setUp() {
		BaseTest.initialisationDriver();
	}
	
	@AfterMethod
	public void tearDown() {
		BaseTest.closeDriver();
	}
	

}
