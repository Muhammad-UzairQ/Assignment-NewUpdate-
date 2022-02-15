package ui.com.TA.shopping.user_interfaces;

import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class Sunscreens {


    public static final Target SUNSCREENS = Target.the("h2")
            .locatedBy("//h2[text()='Sunscreens']");

    public static final Target PRICE = Target.the("p")
            .locatedBy("//*[contains(text(),'Price')]");

    public static final Target SPF50 = Target.the("p")
            .locatedBy("//*[contains(text(),'SPF-50')]/following-sibling::p");


    public static final Target SPF30 = Target.the("p")
            .locatedBy("//*[contains(text(),'SPF-30')]/following-sibling::p");


    public static final Target TOTAL_PRICE = Target.the("total")
            .locatedBy("//p[@id='total']");

    public static final Target CART = Target.the("button")
            .locatedBy("//button[@onClick='goToCart()']");


    public static void selectItem(int Pr,int flag) {

        if (flag==1){
            Target SPF50_LEAST_PRICE = Target.the("p")
                    .locatedBy("//*[contains(text(),'SPF-50')]/following-sibling::*[contains(text(),'" + Pr + "')]/following-sibling::button");

            theActorInTheSpotlight().attemptsTo(
                    Click.on(SPF50_LEAST_PRICE)
            );
        }else{
            Target SPF30_LEAST_PRICE = Target.the("p")
                    .locatedBy("//*[contains(text(),'SPF-30')]/following-sibling::*[contains(text(),'" + Pr + "')]/following-sibling::button");

            theActorInTheSpotlight().attemptsTo(
                    Click.on(SPF30_LEAST_PRICE)
            );
        }

    }



}
