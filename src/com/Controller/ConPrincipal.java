package com.Controller;

import com.View.Win_Principal;
import com.Model.ObtainInformation;
import com.Model.Languages;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;


// IMPORT JAVA LIBRARIES
import org.json.JSONArray;
import org.json.JSONObject;


public class ConPrincipal{
    private Win_Principal window;
    private Languages language;
    private StringBuilder jsonObtBook;
    private StringBuilder jsonObtAddress;
    private StringBuilder jsonObtComment;
    private JSONArray jsonArrBook;
    private JSONObject jsonObjBook;
    private JSONArray jsonArrAddress;
    private JSONObject jsonObjAddress;
    private JSONArray jsonArrComment;
    private JSONObject jsonObjComment;
    private int nBook;
    private int nMaxBook;

    private ObtainInformation connBook;
    private ObtainInformation connAddress;
    private ObtainInformation connComment;

    public ConPrincipal(Languages language){
        this.language = language;
        nBook=0;
        nMaxBook = 0;
        window = new Win_Principal();
        window.getBtnObtain().addActionListener(new actionBtnObtainBooks());
        window.getBtnAddress().addActionListener(new actionBtnObtainAddress());
        window.getBtnComments().addActionListener(new actionBtnObtainComments());
        window.getBtnNext().addActionListener(new actionBtnNext());
        window.getBtnPrevious().addActionListener(new actionBtnPrevious());

        window.getBtnAddress().setEnabled(false);
        window.getBtnComments().setEnabled(false);
        window.getBtnNext().setEnabled(false);
        window.getBtnPrevious().setEnabled(false);

        window.setVisible(true);
    }

    private class actionBtnObtainBooks implements ActionListener {
        @SuppressWarnings("static-access")
        @Override
            public void actionPerformed(ActionEvent eventStart) {
                // Actions for Button
                nMaxBook = ((Number) window.getSpnNumBooks().getValue() ).intValue() -1;
                connBook = new ObtainInformation();
                connBook.setApi("books");
                connBook.setLocale(language.getSelectLanguage());
                connBook.setSeed("1052");
                connBook.setQuantity(String.valueOf(window.getSpnNumBooks().getValue()));
                connBook.conection();
                jsonObtBook = connBook.getJsonObtained();

                jsonArrBook = new JSONArray(transformArray(jsonObtBook.toString()));
                jsonObjBook = jsonArrBook.getJSONObject(nBook);

                window.getTxtTitleBook().setText(jsonObjBook.getString("title"));
                window.getTxtAuthor().setText(jsonObjBook.getString("author"));
                window.getTxtDescription().setText(jsonObjBook.getString("description"));
                window.getTxtIsbn().setText(jsonObjBook.getString("isbn"));
                window.getTxtPublished().setText(jsonObjBook.getString("published"));
                window.getTxtPublisher().setText(jsonObjBook.getString("publisher"));
                window.getTxtGenre().setText(jsonObjBook.getString("genre"));

                window.getBtnAddress().setEnabled(true);
                window.getBtnComments().setEnabled(true);
                window.getBtnNext().setEnabled(true);

            }
    }

    private class actionBtnObtainAddress implements ActionListener {
        @SuppressWarnings("static-access")
        @Override
            public void actionPerformed(ActionEvent eventStart) {
                // Actions for Button
                connAddress = new ObtainInformation();
                connAddress.setApi("addresses");
                connAddress.setLocale(language.getSelectLanguage());
                connAddress.setSeed("1052");
                connAddress.setQuantity(String.valueOf(window.getSpnNumBooks().getValue()));
                connAddress.conection();
                jsonObtAddress = connAddress.getJsonObtained();

                jsonArrAddress = new JSONArray(transformArray(jsonObtAddress.toString()));
                jsonObjAddress = jsonArrAddress.getJSONObject(nBook);

                String address = jsonObjAddress.getString("street").toString() + " " 
                +"No. "+ jsonObjAddress.getString("buildingNumber").toString() + ", \n "
                +"Colony "+  jsonObjAddress.getString("streetName").toString() + " " 
                +"ZP " + jsonObjAddress.getString("zipcode").toString() + ", \n" 
                +"City " + jsonObjAddress.getString("city").toString() + " " 
                + "Country " + jsonObjAddress.getString("country").toString();

                JOptionPane.showMessageDialog( window, address.toString(),"Address Obtained", JOptionPane.INFORMATION_MESSAGE);
            }
    }

    private class actionBtnObtainComments implements ActionListener {
        @SuppressWarnings("static-access")
        @Override
            public void actionPerformed(ActionEvent eventStart) {
                // Actions for Button
                connComment = new ObtainInformation();
                connComment.setApi("custom");
                connComment.setLocale(language.getSelectLanguage());
                connComment.setSeed(String.valueOf(1052+nBook));
                connComment.setQuantity("10");
                connComment.conection();
                jsonObtComment = connComment.getJsonObtained();

                jsonArrComment = new JSONArray(transformArray(jsonObtComment.toString()));

                for (int i =0 ; i< jsonArrComment.length() ; i++){
                    jsonObjComment = jsonArrComment.getJSONObject(i);
                    System.out.println(jsonObjComment + " Paso " + i);
                }
            }
    }

    private class actionBtnNext implements ActionListener {
        @Override
            public void actionPerformed(ActionEvent eventStart) {
                nBook = nBook +1;
                jsonObjBook = jsonArrBook.getJSONObject(nBook);

                window.getTxtTitleBook().setText(jsonObjBook.getString("title"));
                window.getTxtAuthor().setText(jsonObjBook.getString("author"));
                window.getTxtDescription().setText(jsonObjBook.getString("description"));
                window.getTxtIsbn().setText(jsonObjBook.getString("isbn"));
                window.getTxtPublished().setText(jsonObjBook.getString("published"));
                window.getTxtPublisher().setText(jsonObjBook.getString("publisher"));
                window.getTxtGenre().setText(jsonObjBook.getString("genre"));

                window.getBtnAddress().setEnabled(true);
                window.getBtnComments().setEnabled(true);
                window.getBtnNext().setEnabled(true);

                if(nBook > 0){
                    window.getBtnPrevious().setEnabled(true);
                }
                if(nBook == nMaxBook){
                    window.getBtnNext().setEnabled(false);
                }
            }
    }

    private class actionBtnPrevious implements ActionListener {
        @Override
            public void actionPerformed(ActionEvent eventStart) {
                // Actions for Button
                nBook = nBook -1;
                jsonObjBook = jsonArrBook.getJSONObject(nBook);

                window.getTxtTitleBook().setText(jsonObjBook.getString("title"));
                window.getTxtAuthor().setText(jsonObjBook.getString("author"));
                window.getTxtDescription().setText(jsonObjBook.getString("description"));
                window.getTxtIsbn().setText(jsonObjBook.getString("isbn"));
                window.getTxtPublished().setText(jsonObjBook.getString("published"));
                window.getTxtPublisher().setText(jsonObjBook.getString("publisher"));
                window.getTxtGenre().setText(jsonObjBook.getString("genre"));

                window.getBtnAddress().setEnabled(true);
                window.getBtnComments().setEnabled(true);
                window.getBtnNext().setEnabled(true);

                if(nBook == 0){
                    window.getBtnPrevious().setEnabled(false);
                }
                if(nBook < nMaxBook){
                    window.getBtnNext().setEnabled(true);
                }
            }
    }

    private String transformArray(String arrayString){
        
        String[] arrayAux1 = arrayString.split("\\[");   
        String[] arrayAux2 = arrayAux1[1].split("\\]");
        return "["+arrayAux2[0]+"]";
        
    }
}