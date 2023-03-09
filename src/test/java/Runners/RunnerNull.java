package Runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features/Locadora_Null.feature",
glue = "Steps.steps_null",
plugin = { "pretty"},
snippets = SnippetType.CAMELCASE,
monochrome = false,
dryRun = false,
strict = false)
public class RunnerNull {

}
