package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import userinterfaces.LoginPage;

public class ValidateMessage implements Question <String>{

    @Override
    public String answeredBy(Actor actor) {
        return LoginPage.LBL_VALIDATION.resolveFor(actor).getText();
    }
    public static Question<String> value() {
        return new ValidateMessage();
    }
}
