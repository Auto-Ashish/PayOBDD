package StepDef;

import io.cucumber.java.en.Given;

public class StepDefinitions1 {
    @Given("I have step definition from feature1")
    public void stepDefinitionFromFeature1() {
        System.out.println("Step definition from feature1 executed");
    }
}
