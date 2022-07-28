package ru.rmpts.acceptancetests;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features",plugin = { "pretty:target/c_log" }, glue="ru.rmpts.steps.cucumber")//, tags = "@use") //"not @ignore")
public class AcceptanceTestSuite {}
