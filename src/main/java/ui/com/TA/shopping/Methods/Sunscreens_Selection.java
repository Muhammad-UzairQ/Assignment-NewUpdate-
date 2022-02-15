package ui.com.TA.shopping.Methods;

import ui.com.TA.shopping.user_interfaces.Sunscreens;

import java.util.ArrayList;
import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class Sunscreens_Selection {

    public int Sunscreen_Select(int v){
        String2Int Convert=new String2Int();
        Find_Min_Value obj=new Find_Min_Value();
        int val, val1, Ret;
        List<String> Price_SPF50 = new ArrayList<String>();
        List<Integer> price_spf50 = new ArrayList<Integer>();
        List<String> Price_SPF30 = new ArrayList<String>();
        List<Integer> price_spf30 = new ArrayList<Integer>();


        if(v==1) {
            Sunscreens.SPF50.resolveAllFor(theActorInTheSpotlight()).forEach(element -> {
                Price_SPF50.add(element.getTextValue());
            });

            for (String li : Price_SPF50){
                price_spf50.add(Convert.convertStringToInt(li));}

            val=obj.min((ArrayList<Integer>) price_spf50);
            Ret=val;
            Sunscreens.selectItem(val,1);

        }else{
            Sunscreens.SPF30.resolveAllFor(theActorInTheSpotlight()).forEach(element1 -> {
                Price_SPF30.add(element1.getTextValue());
            });

            for (String li1 : Price_SPF30) {
                price_spf30.add(Convert.convertStringToInt(li1));}

            val1=obj.min((ArrayList<Integer>) price_spf30);
            Sunscreens.selectItem(val1,2);
            Ret=val1;
        }

        return Ret;
    }
}
