package com.Model;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class ObtainInformation {
    static private URL url;
    static private String linkApi;
    static private HttpURLConnection conn;
    static private int responseCode;
    static String api;
    static String seed;
    static String quantity;
    static String locale;


    public static void main(String[] args) {
        api = "books";
        seed="123";
        quantity = "10";
        locale = "es_ES";
        conection();
    }

    public static void conection(){
        
        switch (api) {
            case "books":
                linkApi = "https://fakerapi.it/api/v1/"+api+"?_seed="+seed+"&_locale="+locale+"&_quantity="+quantity;
                break;
            case "addresses":
                linkApi = "https://fakerapi.it/api/v1/"+api+"?_seed="+seed+"&_locale="+locale+"&_quantity="+quantity;
                break;
            case "texts":
                linkApi = "https://fakerapi.it/api/v1/"+api+"?_characters=500&_seed="+seed+"&_locale="+locale+"&_quantity="+quantity;
                break;
            default:
                break;
        }

        
        
        try {
            url = new URL(linkApi);
            conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();

            responseCode = conn.getResponseCode();

            if(responseCode != 200){
                throw new RuntimeException("Ocurrio un Error" + responseCode);
            } else{
                StringBuilder informationString = new StringBuilder();
                Scanner scanner = new Scanner(url.openStream());

                while (scanner.hasNext()) {
                    informationString.append(scanner.nextLine());
                }

                scanner.close();

                System.out.println(informationString);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
