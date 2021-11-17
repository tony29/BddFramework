package Runner;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;
//import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
(features= {"D:\\Java-MX\\BDDFramework\\src\\test\\java\\FeatureFiles\\Login.feature"},
glue= {"StepDefinitions"},
dryRun=false
//monochrome=true
//plugin= {"pretty","json:Report/Cucumber.json",
//		"junit:Report/XMLCucucumber.xml",
//		"html:Report/cucumber-html-reports"
//		}
//strict=true
)
public class TestRunner {

}
