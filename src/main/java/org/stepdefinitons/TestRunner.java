package org.stepdefinitons;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "featureFiles", glue = "steps", monochrome = true)

public class TestRunner {

}
