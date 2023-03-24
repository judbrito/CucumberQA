package Runners;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features/SenhorBarriga.feature.feature", glue = "steps", plugin = { "pretty",
		"html:target/reporthtml",
		"json:target/report.json" }, snippets = SnippetType.CAMELCASE, monochrome = false, dryRun = false, strict = false)
public class RunnerSrBarrigaTest {
	public static WebDriver driver = new ChromeDriver();


	@AfterClass
	public static void resetAndScreen() throws IOException {
		
		System.out.println("Afterclass esta aqui");
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String timestamp = new SimpleDateFormat("yyyyMMdd-HHmmss").format(new Date());
		FileUtils.copyFile(screenshot, new File("imagens/" + screenshot.getName() + "_" + timestamp + ".png"));
	
	}
}