package ui.com.TA.shopping.Methods;

public class String2Int {
    public int convertStringToInt(String STR){
        String CLEAN = STR.replaceAll("\\D+", "");
        int VALUE=Integer.parseInt(CLEAN);
        return VALUE;
    }

}
