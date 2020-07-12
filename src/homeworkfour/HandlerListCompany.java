package homeworkfour;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.lang.reflect.Type;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public interface HandlerListCompany {
    static ArrayList<Company> jsonToListCompany(String fileName){
        try {
            Reader json1 = new FileReader(fileName);
            Type typeListCompany = new TypeToken<List<Company>>() {}.getType();
            ArrayList<Company> listCompany = new Gson().fromJson(json1, typeListCompany);
            System.out.println(listCompany);
            System.out.println(listCompany.get(0).listSecurities.get(0).codeSecurities);
            return listCompany;
        } catch (
                FileNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    static void infoAllCompany(ArrayList<Company> listCompany){
        SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yy");
        for (Company company : listCompany) {
            System.out.println("Название компании: " + company.nameCompany + " - " + "Дата основания: " + format1.format(company.dateFoundationCompany.getTime()) );

        }
    }

    static void allExpiredSecurities(ArrayList<Company> listCompany){
        int countExpiredSecurities = 0;
        Calendar currentDate = Calendar.getInstance();
        SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yy");
        for (Company company : listCompany) {
            for(Securities securities : company.listSecurities){
                if(securities.dateExpiration.before(currentDate)) {

                    System.out.println("Полное название компании: " + company.fullNameCompany + " - " + "Дата истечения ценной бумаги: " + format1.format(securities.dateExpiration.getTime()) + " - " + "код ценной бумаги: " + securities.codeSecurities);
                    countExpiredSecurities = countExpiredSecurities + 1;
                }
            }
        }
        System.out.println("Количество ценных бумаг с истёкшей датой: " + countExpiredSecurities);
    }

    static void allOlderCompany(ArrayList<Company> listCompany, String s){
        s = s.replaceAll("/", ".");
        String delimeter = "\\.";
        String[] subStr;
        subStr = s.split(delimeter);
        int dd = Integer.parseInt(subStr[0]);
        int mm = Integer.parseInt(subStr[1]) - 1;
        int yy = Integer.parseInt(subStr[2]);
        if (yy < 100 && yy <= 20) {
            yy = yy + 2000;
        } else if (yy < 100 && yy > 20) {
            yy = yy + 1900;
        }
        SimpleDateFormat format1 = new SimpleDateFormat("dd/MM/yyyy");
        Calendar date = new GregorianCalendar(yy, mm, dd);
        for (Company company : listCompany) {

            if(date.before(company.dateFoundationCompany)) {

                System.out.println("Полное название компании: " + company.fullNameCompany + " - " + "Дата основания компании: " + format1.format(company.dateFoundationCompany.getTime()));

            }

        }
    }

    static void allCurrencyCode(ArrayList<Company> listCompany, String enteredUser2){
        for (Company company : listCompany) {
            for(Securities securities : company.listSecurities){
                if(securities.currencyCode.equals(enteredUser2)) {

                    System.out.println("id ценной бумаги: " + securities.id +  " - " + "код ценной бумаги: " + securities.codeSecurities);

                }
            }
        }
    }
}
