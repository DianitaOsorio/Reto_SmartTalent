package userinterfaces;
import net.serenitybdd.screenplay.targets.Target;
import static userinterfaces.FillForm.*;
public class FillForm {

    public static final Target BTN_FACILITY = Target.the("list facility")
            .locatedBy("//select[@id='combo_facility']");
    public static final Target CHK_APPLY = Target.the("chk apply")
            .locatedBy("//input[@name='hospital_readmission']");
    public static final Target CHK_PROGRAM = Target.the("chk program")
            .locatedBy("//input[@type='radio']");

    public static final Target BTN_CALENDAR = Target.the("btn calendar")
            .locatedBy("//input[@placeholder='dd/mm/yyyy']");
}
