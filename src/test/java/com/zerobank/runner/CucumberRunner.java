package com.zerobank.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "html:target/cucumber-report.html",
        features = "src\\test\\resources\\features", //content root
        glue = "com\\zerobank\\step_definitions", //source root
        dryRun = false,
        tags = "@test1",
        publish = true

)

public class CucumberRunner {
}
