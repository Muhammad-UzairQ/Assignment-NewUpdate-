package ui.com.TA.shopping.user_interfaces;

import net.serenitybdd.screenplay.targets.Target;

public class Sunscreens {


    public static final Target SUNSCREENS = Target.the("h2")
            .locatedBy("//h2[text()='Sunscreens']");

    public static final Target PRICE = Target.the("p")
            .locatedBy("//*[contains(text(),'Price')]");

    public static final Target SPF50 = Target.the("p")
            .locatedBy("//*[contains(text(),'SPF-50')]/following-sibling::p");

    public static final Target SPF50_LEAST_PRICE = Target.the("p")
            .locatedBy("//*[contains(text(),'SPF-50')]/following-sibling::*[contains(text(),'{0}')]/following-sibling::button");

    public static final Target SPF30_LEAST_PRICE = Target.the("p")
            .locatedBy("//*[contains(text(),'SPF-30')]/following-sibling::*[contains(text(),'{0}}')]/following-sibling::button");



    public static final Target SPF30 = Target.the("p")
            .locatedBy("//*[contains(text(),'SPF-30')]/following-sibling::p");


    public static final Target TOTAL_PRICE = Target.the("total")
            .locatedBy("//p[@id='total']");

    public static final Target CART = Target.the("button")
            .locatedBy("//button[@onClick='goToCart()']");

}
