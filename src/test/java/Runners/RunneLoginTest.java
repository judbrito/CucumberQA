package Runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features/logarSimples.feature",
glue = "Steps.logoff",
plugin = {"pretty", "html:target/reporthtml","json:target/report.json" },
snippets = SnippetType.CAMELCASE, 
monochrome = false,
dryRun = false,
strict = false)
public class RunneLoginTest {}
