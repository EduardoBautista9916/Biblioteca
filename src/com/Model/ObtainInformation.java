package com.Model;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class ObtainInformation {
    static private URL url;
    static private String linkApi;
    static private HttpURLConnection conn;
    static private int responseCode;
    static private StringBuilder jsonObtained;
    static private String api;
    static private String seed;
    static private String quantity;
    static private String locale;

    public static void conection(){
        
        switch (api) {
            case "books":
                linkApi = "https://fakerapi.it/api/v1/"+api+"?_seed="+seed+"&_locale="+locale+"&_quantity="+quantity;
                break;
            case "addresses":
                linkApi = "https://fakerapi.it/api/v1/"+api+"?_seed="+seed+"&_locale="+locale+"&_quantity="+quantity;
                break;
            case "custom":
                linkApi = "https://fakerapi.it/api/v1/"+api+"?author=name&email=email&comment=longText&_locale="+locale+"&_quantity="+quantity;
                break;
            default:
                linkApi = "https://fakerapi.it/api/v1/";
                break;
        }

        System.out.println(linkApi);
        
        try {
            url = new URL(linkApi);
            conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();

            responseCode = conn.getResponseCode();

            if(responseCode != 200){
                throw new RuntimeException("Ocurrio un Error " + responseCode);
            } else{
                jsonObtained = new StringBuilder();
                Scanner scanner = new Scanner(url.openStream());

                while (scanner.hasNext()) {
                    jsonObtained.append(scanner.nextLine());
                }

                scanner.close();

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void connection(String apiN, String seedN, String quantityN, String localeN){
        switch (apiN) {
            case "books":
                linkApi = "https://fakerapi.it/api/v1/"+apiN+"?_seed="+seedN+"&_locale="+localeN+"&_quantity="+quantityN;
                break;
            case "addresses":
                linkApi = "https://fakerapi.it/api/v1/"+apiN+"?_seed="+seedN+"&_locale="+localeN+"&_quantity="+quantityN;
                break;
            case "custom":
                linkApi = "https://fakerapi.it/api/v1/"+api+"?author=name&email=email&comment=longText&_locale="+locale+"&_quantity="+quantity;
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
                throw new RuntimeException("Ocurrio un Error " + responseCode);
            } else{
                jsonObtained = new StringBuilder();
                Scanner scanner = new Scanner(url.openStream());

                while (scanner.hasNext()) {
                    jsonObtained.append(scanner.nextLine());
                }

                scanner.close();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setApi(String api){
        this.api = api;
    }

    public String getApi(){
        return api;
    }

    public void setSeed(String seed){
        this.seed = seed;
    }

    public String getSeed(){
        return seed;
    }

    public void setQuantity(String quantity){
        this.quantity = quantity;
    }

    public String getQuantity(){
        return quantity;
    }

    public void setLocale(String locale){
        this.locale = locale;
    }

    public String getLocale(){
        return locale;
    }

    public void setJsonObtained(StringBuilder jsonObtained){
        this.jsonObtained = jsonObtained;
    }

    public StringBuilder getJsonObtained(){
        return jsonObtained;
    }
}
