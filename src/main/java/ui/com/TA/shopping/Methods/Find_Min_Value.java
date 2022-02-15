package ui.com.TA.shopping.Methods;

import java.util.ArrayList;

public class Find_Min_Value {
    int MIN;
    public int min(ArrayList<Integer> LIST){
        MIN = LIST.get(0);
        for (int ij = 1; ij < LIST.size(); ij++) {
            if (MIN < LIST.get(ij)) {
            } else {
                MIN = LIST.get(ij);
            }
        }
        return MIN;
    }


}
