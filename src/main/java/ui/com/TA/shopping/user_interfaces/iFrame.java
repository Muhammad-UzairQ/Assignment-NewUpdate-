package ui.com.TA.shopping.user_interfaces;

import net.serenitybdd.screenplay.targets.Target;

public class iFrame {

    public static final Target EMAIL = Target.the("email")
            .locatedBy("//form//input[@id='email']");

    public static final Target CARD_NUMBER = Target.the("card_number")
            .locatedBy("//form//input[contains(@id,'card_number')]");

    public static final Target DATE = Target.the("cc-exp")
            .locatedBy("//form//input[contains(@id,'cc-exp')]");

    public static final Target CVC = Target.the("cc-csc")
            .locatedBy("//form//input[contains(@id,'cc-csc')]");

    public static final Target POSTAL_CODE = Target.the("postal-code")
            .locatedBy("//input[@autocompletetype='postal-code']");

    public static final Target PAY_BUTTON = Target.the("button")
            .locatedBy("//form//button[@id='submitButton']");


}

