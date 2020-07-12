package homeworkfour;



import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Company> listCompany = HandlerListCompany.jsonToListCompany("files/example.json");

        HandlerListCompany.infoAllCompany(listCompany);

        HandlerListCompany.allExpiredSecurities(listCompany);

        String enteredUser1 = "20.12.16";
        HandlerListCompany.allOlderCompany(listCompany, enteredUser1);

        String enteredUser2 = "RUB";
        HandlerListCompany.allCurrencyCode(listCompany, enteredUser2);

    }
}