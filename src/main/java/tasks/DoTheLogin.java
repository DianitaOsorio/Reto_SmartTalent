package tasks;


import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.waits.WaitUntil;


import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static userinterfaces.LoginPage.*;
public class DoTheLogin implements Task {

    String user;
    String password;




    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(BTN_MAKE_APPOINTMENT, isVisible()).forNoMoreThan(30).seconds(),
                JavaScriptClick.on(BTN_MAKE_APPOINTMENT),
                Enter.theValue(user).into(TXT_USERNAME),
                Enter.theValue(password).into(TXT_PASSWORD),
                JavaScriptClick.on(BTN_LOGIN),
                WaitUntil.the(LBL_VALIDATION, isVisible()).forNoMoreThan(15).seconds()


        );
    }
    public static DoTheLogin socialMedia() {
        return Instrumented.instanceOf(DoTheLogin.class).withProperties();
    }

    public DoTheLogin withThisUser(String usuario) {
        this.user = usuario;
        return this;
    }

    public DoTheLogin andThisPassword(String contrasena) {
        this.password = contrasena;
        return this;
    }
}