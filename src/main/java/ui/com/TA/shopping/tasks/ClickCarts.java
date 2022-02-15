package ui.com.TA.shopping.tasks;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import ui.com.TA.shopping.user_interfaces.Moisturizers_Interface;


public class ClickCarts {

    public static Task using() {
        return Task.where("{0} User Clicks on cart button",
                Click.on(Moisturizers_Interface.CART)
        );
    }
}
