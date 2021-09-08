package co.com.traductor.datadriven.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
@RunWith(CucumberWithSerenity.class)
@CucumberOptions (features = "src/test/resources/feactures/traductorGoogle.feature",
        tags = "@cp",
        glue = "co.com.traductor.datadriven.stepdefinitions",
        snippets = SnippetType.CAMELCASE )
public class RunnerTags {
}