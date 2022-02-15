package ui.com.TA.shopping.tasks;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.questions.Text;
import ui.com.TA.shopping.Methods.Moisturizers_Selection;
import ui.com.TA.shopping.Methods.Sunscreens_Selection;
import ui.com.TA.shopping.user_interfaces.Sunscreens;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class ItemsSelection {
    static int PRICE_ITEM1;
    static int PRICE_ITEM2;
    static String TITLE;
    static Moisturizers_Selection obj=new Moisturizers_Selection();
    public static Task using() {

        TITLE= Text.of(Sunscreens.SUNSCREENS).asString().answeredBy(theActorInTheSpotlight());
        if(TITLE.equals("Sunscreens")){
            Sunscreens_Selection obj=new Sunscreens_Selection();
            PRICE_ITEM1=obj.Sunscreen_Select(1);
            PRICE_ITEM2=obj.Sunscreen_Select(2);
        }else{
            PRICE_ITEM1=obj.Moisturizer_select(1);
            PRICE_ITEM2=obj.Moisturizer_select(2);
        }
        return Task.where("{0} User Selects Items"
        );
    }


}
