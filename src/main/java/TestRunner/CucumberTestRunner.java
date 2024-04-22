package TestRunner;



import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;




@CucumberOptions(tags = "@smoke",
        features={"src/main/resources/Feature/Login.feature"},
        glue={"StepDefinitions"},
        plugin = {"pretty", "html:target/html report.html"}
)

public class CucumberTestRunner extends AbstractTestNGCucumberTests {
}
