package testRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "/Users/anshumanyadav/eclipse-workspace/BDD-Cucumber/Feature/Login.feature",
    glue = "StepDefinition",  // Update this to match your package name
    plugin = { "pretty", "html:target/cucumber-reports.html", "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm" },
    monochrome = true
)
public class TestRun {
}