package ui.com.TA.shopping.user_interfaces;

import net.serenitybdd.screenplay.targets.Target;

public class Shopper_Page {

    public static final Target URL = Target.the("weather")
            .locatedBy("https://weathershopper.pythonanywhere.com/");

    public static final Target TEMPERATURE = Target.the("weather")
            .locatedBy("//div[@id='weather']//span");

    public static final Target BUY_MOISTURIZERS = Target.the("button")
            .locatedBy("//a[@href='/moisturizer']//button");

    public static final Target  BUY_SUNSCREENS = Target.the("button")
            .locatedBy("//a[@href='/sunscreen']//button");


}
