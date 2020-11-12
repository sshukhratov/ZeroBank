package com.zerobank.step_definitions;

import com.zerobank.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @Before
    public void beforeScenario(Scenario scenario){
        System.out.println("STARING TESTING OF "+scenario.getName());
    }

    @After
    public void afterScenario(Scenario scenario){
        System.out.println("Result of scenario: "+scenario.getStatus());
        System.out.println("FINISHING TESTING OF "+scenario.getName());

        byte[] screenshots = ((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
        scenario.attach(screenshots, "image/png", scenario.getName());
    }
}
