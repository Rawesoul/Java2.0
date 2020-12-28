import Logic.ToDisplayAndSortByDate;
import com.google.gson.JsonSyntaxException;
import jsonClasses.Organization;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Georgii Zadvornov 28.12.2020
 * @see ToDisplayAndSortByDate
 * @see Organization
 * @see jsonClasses.Data
 * @see jsonClasses.Security
 */

public class Program {

    public static void main(String[] args) {
        try {
            ToDisplayAndSortByDate json = new ToDisplayAndSortByDate("New document 1.json");
            System.out.println("Все имеющиеся компании из файла json:");
            System.out.println(json.getView());

            System.out.println("Все акции компаний, просроченные на текущий момент:");
            System.out.println(json.getLastSecurities() + "\n");

            System.out.println("Выбор операции:\n1 - Просмотр компаний, основанных после даты,\n2 - Просмотр акций по коду валюты");
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            switch (a) {
                case 1 -> {
                    System.out.println("Введите дату в формате dd.MM.yyyy");
                    Date UserInputDate = (new SimpleDateFormat("dd.MM.yyyy")).parse(sc.next());
                    List<Organization> OrgsByFoundationDate = json.getOrgsByFoundationDate(UserInputDate);
                    System.out.println("Организации, основанные после введенной даты:");
                    System.out.println(OrgsByFoundationDate);
                }
                case 2 -> {
                    System.out.println("Введите код валюты (RUR, USD или EUR)");
                    String CurCode = sc.next();
                    List<String> SecuritiesByCurrencyCode = json.getSecuritiesByCurrencyCode(CurCode);
                    System.out.println("Акции с данной валютой:");
                    System.out.println(SecuritiesByCurrencyCode);
                }
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } catch (JsonSyntaxException ex) {
            System.out.println("Некорректный формат файла JSON");
        } catch (ParseException ex) {
            System.out.println("Некорректный формат даты");
        }
    }
}