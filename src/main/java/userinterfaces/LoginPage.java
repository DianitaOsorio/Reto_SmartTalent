package userinterfaces;
import net.serenitybdd.screenplay.targets.Target;
public class LoginPage {
    public static final Target BTN_MAKE_APPOINTMENT = Target.the("button to log in")
            .locatedBy("//a[@id='btn-make-appointment']");
    public static final Target TXT_USERNAME = Target.the("Text field for username")
            .locatedBy("//input[@name='username']");
    public static final Target TXT_PASSWORD = Target.the("Text field for password")
            .locatedBy("//input[@name='password']");
    public static final Target LBL_VALIDATION = Target.the("validate the text")
            .locatedBy("//h2[text()='Make Appointment']");
    public static final Target BTN_LOGIN = Target.the("button to log in")
            .locatedBy("//button[@id='btn-login']");




}
