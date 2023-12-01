package tasks;


import interactions.SelectList;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import static userinterfaces.FillForm.*;
import static userinterfaces.LoginPage.LBL_VALIDATION;

public class FillForm implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                //WaitUntil.the(LBL_VALIDATION, isVisible()).forNoMoreThan(10).seconds(),
                SelectList.on(BTN_FACILITY),
                JavaScriptClick.on(CHK_APPLY),
                JavaScriptClick.on(CHK_PROGRAM),
                JavaScriptClick.on(BTN_CALENDAR)

        );

    }

    public static FillForm socialMedia() {
        return Instrumented.instanceOf(FillForm.class).withProperties();
    }
}