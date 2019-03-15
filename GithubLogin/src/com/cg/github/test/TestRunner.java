package com.cg.github.test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"feature"},
		glue= {"com.cg.github.stepdefinations"},
		tags= {"@execute"}
		)
public class TestRunner {

}
