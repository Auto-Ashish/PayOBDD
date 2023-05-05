package Features;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
                   features ={"src/test/java/Features/"},
                    glue={"StepDef"},
                    monochrome = true,
                    plugin = {"html:target/cucumber.html"}

)
public class TestRunnerClass extends AbstractTestNGCucumberTests {
}
