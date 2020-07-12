package homeworkfour;

import java.util.ArrayList;
import java.util.Calendar;


public class Company {
    String nameCompany;
    String fullNameCompany;
    String addressCompany;
    String numberTelephoneCompany;
    String innCompany;
    String ogrnCompany;
    Calendar dateFoundationCompany;
    ArrayList<Securities> listSecurities;

    public Company(String nameCompany, String fullNameCompany, String addressCompany, String numberTelephoneCompany, String innCompany, String ogrnCompany, Calendar dateFoundationCompany, ArrayList<Securities> listSecurities){
        this.nameCompany = nameCompany;
        this.fullNameCompany = fullNameCompany;
        this.addressCompany = addressCompany;
        this.numberTelephoneCompany = numberTelephoneCompany;
        this.innCompany = innCompany;
        this.ogrnCompany = ogrnCompany;
        this.dateFoundationCompany  = dateFoundationCompany;
        this.listSecurities = listSecurities;
    }



}
