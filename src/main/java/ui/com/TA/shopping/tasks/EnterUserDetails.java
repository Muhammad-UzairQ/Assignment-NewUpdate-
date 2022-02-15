package ui.com.TA.shopping.tasks;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Switch;
import ui.com.TA.shopping.models.UserCardParameters;
import ui.com.TA.shopping.user_interfaces.iFrame;

public class EnterUserDetails {

    public static Task using(UserCardParameters userParameters) {

        String CARD_NUMBER = userParameters.cardNumber;
        String[] DIGITS_CARD = CARD_NUMBER.split("[ ]");
        System.out.println("Substrings length:" + DIGITS_CARD.length);
        for (int i = 0; i < DIGITS_CARD.length; i++) {
            System.out.println("Str[" + i + "]:" + DIGITS_CARD[i]);
        }

        return Task.where("{0} Enters details of User",
                Switch.toFrame("stripe_checkout_app"),
                Enter.keyValues(userParameters.emailAddress).into(iFrame.EMAIL),
                Enter.keyValues(DIGITS_CARD[0]).into(iFrame.CARD_NUMBER),
                Enter.keyValues(DIGITS_CARD[1]).into(iFrame.CARD_NUMBER),
                Enter.keyValues(DIGITS_CARD[2]).into(iFrame.CARD_NUMBER),
                Enter.keyValues(DIGITS_CARD[3]).into(iFrame.CARD_NUMBER),
                Enter.keyValues(userParameters.dateMonth).into(iFrame.DATE),
                Enter.keyValues(userParameters.dateYear).into(iFrame.DATE),
                Enter.keyValues(userParameters.cvc).into(iFrame.CVC),
                Enter.keyValues(userParameters.postalCode).into(iFrame.POSTAL_CODE),
                Click.on(iFrame.PAY_BUTTON),
               Switch.toDefaultContext()
        );
    }
}
