package ui.com.TA.shopping.tasks;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.waits.WaitUntil;
import ui.com.TA.shopping.user_interfaces.Success_page;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class VerifyPaymentSuccessfull {
    public static Task using() {
        return Task.where("{0} Verify that payment is successfull",
                WaitUntil.the(Success_page.SUCCESS,isPresent())
        );
    }
}
