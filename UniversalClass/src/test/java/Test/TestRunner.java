package Test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(
features = "Feature/c.feature"
,glue={"Stepdefination"}
,format = {"pretty","html:Folder_Name","json:Folder_Name/cucumber.json","junit:Folder_Name/cucumber.xml"}


)

public class TestRunner  extends AbstractTestNGCucumberTests{

}
