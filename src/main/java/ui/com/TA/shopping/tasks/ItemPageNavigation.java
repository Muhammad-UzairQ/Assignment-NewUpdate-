package ui.com.TA.shopping.tasks;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.conditions.Check;


import ui.com.TA.shopping.user_interfaces.Shopper_Page;


public class ItemPageNavigation {

    public static Performable using(int TEMPERATURE) {
        return Task.where("{0} Navigate to Item page based on temperature",
               Check.whether(TEMPERATURE<19).andIfSo(Click.on(Shopper_Page.BUY_MOISTURIZERS)).otherwise(),
               Check.whether(TEMPERATURE>34).andIfSo(Click.on(Shopper_Page.BUY_SUNSCREENS)).otherwise()
        );
    }


}
