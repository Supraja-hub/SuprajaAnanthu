package com.cts.testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@CucumberOptions(features = {"src/main/resources/feature/login.feature"}, glue = {"com/cts/stepdefnitions"}, monochrome = true,//dryRun=true,
plugin = {"html:reports/","pretty"})
@RunWith(Cucumber.class)
public class RunnerTest
{

}
