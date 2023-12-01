package runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/fillform.feature",
        glue ="stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE)

public class fill_formRunner {
    @BeforeClass
    public static void setup() {
        OnStage.setTheStage(new OnlineCast());
    }
}
