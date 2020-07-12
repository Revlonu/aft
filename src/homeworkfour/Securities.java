package homeworkfour;

import java.util.Calendar;


public class Securities {
    int id;
    String currencyCode;
    String codeSecurities;
    Calendar dateExpiration;

    public Securities(int id, String currencyCode, String codeSecurities, Calendar dateExpiration){
        this.id = id;
        this.currencyCode = currencyCode;
        this.codeSecurities = codeSecurities;
        this.dateExpiration = dateExpiration;
    }

}
