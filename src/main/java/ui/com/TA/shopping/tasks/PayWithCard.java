package ui.com.TA.shopping.tasks;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import ui.com.TA.shopping.user_interfaces.Checkout_page;


public class PayWithCard {

    public static Task using() {
        return Task.where("{0} User clicks pay with card button",
                Click.on(Checkout_page.PAY_WITH_CARD)
        );
    }

}
