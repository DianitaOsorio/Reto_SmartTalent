package stepdefinitions;

import drivers.WebDriversSetup;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import models.UsersLoombokData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import questions.ValidateMessage;
import tasks.DoTheLogin;
import tasks.FillForm;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.containsString;
import static utils.GlobalData.URL;


public class fill_formStepDefinition {


    private Actor testActor;

    @Managed
    WebDriver driver;

    @Before
    public void setStage() {
        WebDriverManager.chromedriver().setup();
        testActor = Actor.named("Test").can(BrowseTheWeb.with(driver));
    }
    @Given("the user enters the form")
    public void theUserEntersTheForm() {
        WebDriversSetup.withChromeOptions();
        OnStage.theActorCalled("").can(BrowseTheWeb.with(WebDriversSetup.on(URL)));
    }
    @When("fill out the form fields")
    public void fillOutTheFormFields() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                FillForm.socialMedia()
        );

    }
    @Then("The user views the appointment successfully Notify if you do not attend the appointment")
    public void theUserViewsTheAppointmentSuccessfullyNotifyIfYouDoNotAttendTheAppointment() {

    }
    }











