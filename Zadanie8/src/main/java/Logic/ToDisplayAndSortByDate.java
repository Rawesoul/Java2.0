package Logic;

import com.google.gson.GsonBuilder;
import jsonClasses.Data;
import jsonClasses.Organization;
import jsonClasses.Security;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ToDisplayAndSortByDate {
    private Data data;

    // Считываем из файла
    public ToDisplayAndSortByDate(String path) throws IOException {
        try(BufferedReader reader = new BufferedReader(new FileReader(path))){
            this.data = new GsonBuilder().setDateFormat("yyyy-MM-dd").create().fromJson(reader, Data.class);
        }
    }
    // Отображение всех имеющихся компаний из файла json
    public String getView(){
        String str = "";
        int j = 0;
        List<Organization> orgs = this.data.getOrganizations();
        for(Organization i : orgs){
            SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
            j++;
            str+= j + ". Компания: " + i.getShortName() + ". Дата основания: " +
                    format.format(i.getFoundationDate()) + "\n";
        }
        return str;
    }
    //Отображение всех акции, просроченных на текущий момент
    public List<String> getLastSecurities(){
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        List<String> res = new ArrayList<>();
        Date date = new Date();
        List<Organization> orgs = this.data.getOrganizations();
        for(Organization i : orgs){
            List<Security> securities = i.getSecurities();
            for(Security j : securities){
                if (j.getExpirationDate().before(date)) {
                    res.add("\nID акций:"+j.getId() + " Актуальны до: " + format.format(j.getExpirationDate())
                            +" Компания: "+i.getName());
                }
            }
        }
        return res;
    }
    //Просмотр компаний, основанных после даты
    public List<Organization> getOrgsByFoundationDate(Date date){
        List<Organization> res = new ArrayList<>();
        for(Organization i : this.data.getOrganizations()){
            if(i.getFoundationDate().after(date)){
                res.add(i);
            }
        }
        return res;
    }

    //Отображение всех акций по коду валюты
   public List<String> getSecuritiesByCurrencyCode(String str){
       List<String> res = new ArrayList<>();
       List<Organization> orgs = this.data.getOrganizations();
       for(Organization i : orgs){
            List<Security> securities = i.getSecurities();
            for(Security j : securities){
                if (str.equals(j.getCurrency())) {
                    res.add("\nid= " + j.getId() +" code= "+ j.getCode());
                }
            }
        }
        return res;
    };

    @Override
    public String toString() {
        return "OrganizationRepository{" +
                "data=" + data +
                '}';
    }
}
