package com.google;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin={"html:target/cucumber","json:target/cucumber.json"},
					tags={"@Test"}, dryRun=false)

public class Runner {

}