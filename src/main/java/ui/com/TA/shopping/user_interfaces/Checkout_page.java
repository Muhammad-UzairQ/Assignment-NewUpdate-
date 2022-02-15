package ui.com.TA.shopping.user_interfaces;

import net.serenitybdd.screenplay.targets.Target;


public class Checkout_page {

    public static final Target CHECKOUT = Target.the("h2")
            .locatedBy("//*[text()='Checkout']");

    public static final Target PRICE_ALOEE = Target.the("td")
            .locatedBy("//tr//*[contains(text(),'Aloe')]/following-sibling::td");

    public static final Target PRICE_ALMONDD = Target.the("td")
            .locatedBy("//tr//*[contains(text(),'Almond')]/following-sibling::td");

    public static final Target PRICE_SPF50 = Target.the("td")
            .locatedBy("//tr//*[contains(text(),'SPF-50')]/following-sibling::td");

    public static final Target PRICE_SPF30 = Target.the("td")
            .locatedBy("//tr//*[contains(text(),'SPF-30')]/following-sibling::td");

    public static final Target PRICE_TOTAL = Target.the("p")
            .locatedBy("//p[@id='total']");

    public static final Target PAY_WITH_CARD = Target.the("button")
            .locatedBy("//button[@type='submit']");

}
