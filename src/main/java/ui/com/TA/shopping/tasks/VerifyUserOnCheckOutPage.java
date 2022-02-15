package ui.com.TA.shopping.tasks;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.questions.Text;
import ui.com.TA.shopping.user_interfaces.Checkout_page;
import net.serenitybdd.screenplay.ensure.Ensure;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class VerifyUserOnCheckOutPage {

    public static Task using() {
        String CHECKOUT= Text.of(Checkout_page.CHECKOUT).asString().answeredBy(theActorInTheSpotlight());
        return Task.where("{0} Verify that user is on checkout page",
                Ensure.that(CHECKOUT).isEqualToIgnoringCase("Checkout")
        );
    }


}
