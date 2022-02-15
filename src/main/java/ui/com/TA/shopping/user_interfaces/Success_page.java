package ui.com.TA.shopping.user_interfaces;
import net.serenitybdd.screenplay.targets.Target;

public class Success_page {

    public static final Target SUCCESS = Target.the("h2")
            .locatedBy("//h2[contains(text(),'PAYMENT SUCCESS')]");

}
