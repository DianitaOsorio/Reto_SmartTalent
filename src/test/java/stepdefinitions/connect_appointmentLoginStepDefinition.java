package stepdefinitions;

import drivers.WebDriversSetup;
import io.cucumber.datatable.DataTable;
import models.LoginData;
import models.UsersLoombokData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.Before;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import questions.ValidateMessage;
import tasks.DoTheLogin;


import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.containsString;
import static utils.GlobalData.URL;

import java.util.List;


public class connect_appointmentLoginStepDefinition {


    private Actor testActor;

    @Managed
    WebDriver driver;

    @Before
    public void setStage() {
        WebDriverManager.chromedriver().setup();
        testActor = Actor.named("Test").can(BrowseTheWeb.with(driver));
    }

    @Given("that the user opens the URL to see the login page")
    public void thatTheUserOpensTheURLToSeeTheLoginPage() {
        WebDriversSetup.withChromeOptions();
        OnStage.theActorCalled("").can(BrowseTheWeb.with(WebDriversSetup.on(URL)));
    }

    @When("Click on the connect appointment button")
    public void clickOnTheConnectAppointmentButton() {

    }

    @When("write the following data")
    public void writeTheFollowingData(DataTable dataTable) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                DoTheLogin.socialMedia()
                        .withThisUser(UsersLoombokData.setData(dataTable).get(0).getUser())
                        .andThisPassword(UsersLoombokData.setData(dataTable).get(0).getPassword())
        );

    }

    @Then("^the user can see the text (.*)$")
    public void theUserCanSeeTheTextText(String text) {
        OnStage.theActorInTheSpotlight().should(seeThat(ValidateMessage.value(), containsString(text)));
    }






}




