package ui.com.TA.shopping.Methods;

import net.serenitybdd.screenplay.actions.Click;
import ui.com.TA.shopping.user_interfaces.Moisturizers_Interface;

import java.util.ArrayList;
import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class Moisturizers_Selection {
    public   List<Integer> price_aloe = new ArrayList<Integer>();
    public List<String> Price_Aloe = new ArrayList<String>();
    public int Moisturizer_select(int v) {
        String2Int Convert=new String2Int();

       int val, val1, Ret;

        List<String> Price_Almond = new ArrayList<String>();
        List<Integer> price_almond = new ArrayList<Integer>();


        Find_Min_Value obj=new Find_Min_Value();
        if(v==1) {
            Moisturizers_Interface.ALOE_PRICE.resolveAllFor(theActorInTheSpotlight()).forEach(element -> {
                Price_Aloe.add(element.getTextValue());
            });

            for (String li : Price_Aloe) {
                price_aloe.add(Convert.convertStringToInt(li));}

            val=obj.min((ArrayList<Integer>) price_aloe);

            theActorInTheSpotlight().attemptsTo(
                    Click.on(Moisturizers_Interface.ALOE_LEAST_PRICE.of(String.valueOf(val)))
            );
            Ret=val;


        }else{
            Moisturizers_Interface.ALMOND_PRICE.resolveAllFor(theActorInTheSpotlight()).forEach(element1 -> {
                Price_Almond.add(element1.getTextValue());
            });

            for (String li1 : Price_Almond) {
                price_almond.add(Convert.convertStringToInt(li1));
            }

            val1=obj.min((ArrayList<Integer>) price_almond);
            theActorInTheSpotlight().attemptsTo(
                    Click.on(Moisturizers_Interface.ALMOND_LEAST_PRICE.of(String.valueOf(val1)))
            );

            Ret=val1;
        }
        return Ret;
    }
}
