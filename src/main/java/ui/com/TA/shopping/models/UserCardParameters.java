package ui.com.TA.shopping.models;

import com.google.gson.annotations.SerializedName;
import indexed.pojo.model.IndexedPojo;


public class UserCardParameters extends IndexedPojo {

    public static final String EMAIL_ADDRESS = "Email Address";
    @SerializedName(EMAIL_ADDRESS)
    public String emailAddress = "";

    public static final String CARD_NUMBER_KEY = "Card_number";
    @SerializedName(CARD_NUMBER_KEY)
    public String cardNumber = "";

    public static final String DATE_MONTH_KEY = "Date_month";
    @SerializedName(DATE_MONTH_KEY)
    public String dateMonth = "";

    public static final String DATE_YEAR_KEY = "Date_year";
    @SerializedName(DATE_YEAR_KEY)
    public String dateYear = "";

    public static final String CVC_KEY = "Cvc";
    @SerializedName(CVC_KEY)
    public String cvc = "";

    public static final String POSTAL_CODE_KEY = "Postal_code";
    @SerializedName(POSTAL_CODE_KEY)
    public String postalCode = "";
}
