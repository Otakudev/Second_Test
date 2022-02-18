
package com.example.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(

        features = "classpath:features",
        plugin = {"pretty",
                "json:target/cucumber/report.json",
                "html:target/cucumber/report.html",
        },

        glue = {"com.example.steps_definitions"}


)
public class TestRunner extends AbstractTestNGCucumberTests {
}


