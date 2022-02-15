package ui.com.TA.shopping.tasks;

import ui.com.TA.shopping.Methods.String2Int;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.questions.Text;


import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static ui.com.TA.shopping.user_interfaces.Checkout_page.*;

public class ItemsPickedVerify {
    static String2Int Obj=new String2Int();

    public static Task using() {

        int ITEM1_PRICE,ITEM2_PRICE, TOTAL_PRICE;
        String price_total=Text.of(PRICE_TOTAL).asString().answeredBy(theActorInTheSpotlight());
        if(ItemsSelection.TITLE.equals("Sunscreens")){
            ITEM1_PRICE=Integer.parseInt((Text.of(PRICE_SPF50).asString().answeredBy(theActorInTheSpotlight())));
            ITEM2_PRICE=Integer.parseInt((Text.of(PRICE_SPF30).asString().answeredBy(theActorInTheSpotlight())));
        }else{
            ITEM1_PRICE=Integer.parseInt((Text.of(PRICE_ALOEE).asString().answeredBy(theActorInTheSpotlight())));
            ITEM2_PRICE=Integer.parseInt((Text.of(PRICE_ALMONDD).asString().answeredBy(theActorInTheSpotlight())));
        }

        TOTAL_PRICE=Obj.convertStringToInt(price_total);

        return Task.where("{0} Verify that items picked are shown in checkout page",
                Ensure.that(ITEM1_PRICE).isEqualTo(ItemsSelection.PRICE_ITEM1),
                Ensure.that(ITEM2_PRICE).isEqualTo(ItemsSelection.PRICE_ITEM2),
                Ensure.that(TOTAL_PRICE).isEqualTo((ItemsSelection.PRICE_ITEM1+ ItemsSelection.PRICE_ITEM2))
        );
    }

}