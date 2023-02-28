package Runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
features = "src/test/resources/Features/AprenderCucumber.feature",
glue = "Steps",
plugin = "pretty", 
snippets = SnippetType.CAMELCASE,
monochrome = true,
dryRun = false,
strict = false)
public class Runner {

}
