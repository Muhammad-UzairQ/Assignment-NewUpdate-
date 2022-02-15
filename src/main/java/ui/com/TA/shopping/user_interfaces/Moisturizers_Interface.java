package ui.com.TA.shopping.user_interfaces;


import net.serenitybdd.screenplay.targets.Target;

public class Moisturizers_Interface {

    public static final Target PRICE = Target.the("p")
            .locatedBy("//*[contains(text(),'Price')]");

    public static final Target ALOE_PRICE = Target.the("p")
            .locatedBy("//*[contains(text(),'Aloe')]/following-sibling::p");

    public static final Target ALOE_LEAST_PRICE = Target.the("p")
            .locatedBy("//*[contains(text(),'Aloe')]/following-sibling::*[contains(text(),'{0}')]/following-sibling::button");

    public static final Target ALMOND_LEAST_PRICE = Target.the("p")
            .locatedBy("//*[contains(text(),'Almond')]/following-sibling::*[contains(text(),'{0}')]/following-sibling::button");

    public static final Target ALMOND_PRICE = Target.the("p")
            .locatedBy("//*[contains(text(),'Almond')]/following-sibling::p");


    public static final Target TOTAL_PRICE = Target.the("total")
            .locatedBy("//p[@id='total']");

    public static final Target CART = Target.the("button")
            .locatedBy("//button[@onClick='goToCart()']");


}
