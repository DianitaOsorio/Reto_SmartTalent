package interactions;

import lombok.Data;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

@Data
public class SelectList implements Interaction {

    Target element;

    @Override
    public <T extends Actor> void performAs(T actor) {
        WebElement listLocation = element.resolveFor(actor);
        listLocation.click();
        Select list = new Select(listLocation);
        list.selectByIndex(3);

    }

    public static SelectList on(Target btnFacility) {
        return Instrumented.instanceOf(SelectList.class).withProperties(btnFacility);
    }
}
