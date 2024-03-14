package com.Controller;

import com.View.Win_Principal;
import com.Model.ObtainInformation;
import com.Model.Languages;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


// IMPORT JAVA LIBRARIES
import org.json.JSONArray;
import org.json.JSONObject;


public class ConPrincipal{
    private Win_Principal window;
    private Languages language;
    private StringBuilder jsonObtained;
    private JSONArray jsonArray;
    private JSONObject jsonObject;

    public ConPrincipal(Languages language){
        this.language = language;
        window = new Win_Principal();
        window.getBtnObtain().addActionListener(new actionBtnObtainBooks());
        window.getBtnAddress().addActionListener(new actionBtnObtainAddress());
        window.getBtnComments().addActionListener(new actionBtnObtainComments());
        window.getBtnNext().addActionListener(new actionBtnNext());
        window.getBtnPrevious().addActionListener(new actionBtnPrevious());

        window.setVisible(true);
    }

    private class actionBtnObtainBooks implements ActionListener {
        @Override
            public void actionPerformed(ActionEvent eventStart) {
                // Actions for Button
                ObtainInformation conn = new ObtainInformation();
                conn.setApi("books");
                conn.setLocale(language.getSelectLanguage());
                conn.setSeed("1052");
                conn.setQuantity(String.valueOf(window.getSpnNumBooks().getValue()));
                conn.conection();
                jsonObtained = conn.getJsonObtained();

                jsonArray = new JSONArray(transformArray(jsonObtained.toString()));
                jsonObject = jsonArray.getJSONObject(0);

                window.getTxtTitleBook().setText(jsonObject.getString("title"));
                window.getTxtAuthor().setText(jsonObject.getString("author"));
                window.getTxtDescription().setText(jsonObject.getString("description"));
                window.getTxtIsbn().setText(jsonObject.getString("isbn"));
                window.getTxtPublished().setText(jsonObject.getString("published"));
                window.getTxtPublisher().setText(jsonObject.getString("publisher"));
                window.getTxtGenre().setText(jsonObject.getString("genre"));
            }
    }

    private class actionBtnObtainAddress implements ActionListener {
        @Override
            public void actionPerformed(ActionEvent eventStart) {
                // Actions for Button
                ObtainInformation conn = new ObtainInformation();
                conn.setApi("address");
                conn.setLocale(language.getSelectLanguage());
                conn.setSeed("1052");
                conn.setQuantity(String.valueOf(window.getSpnNumBooks().getValue()));
                conn.conection();
                jsonObtained = conn.getJsonObtained();
            }
    }

    private class actionBtnObtainComments implements ActionListener {
        @Override
            public void actionPerformed(ActionEvent eventStart) {
                // Actions for Button
                ObtainInformation conn = new ObtainInformation();
                conn.setApi("texts");
                conn.setLocale(language.getSelectLanguage());
                conn.setSeed("1052");
                conn.setQuantity(String.valueOf(window.getSpnNumBooks().getValue()));
                conn.conection();
                jsonObtained = conn.getJsonObtained();
            }
    }

    private class actionBtnNext implements ActionListener {
        @Override
            public void actionPerformed(ActionEvent eventStart) {
                // Actions for Button
            }
    }

    private class actionBtnPrevious implements ActionListener {
        @Override
            public void actionPerformed(ActionEvent eventStart) {
                // Actions for Button
            }
    }

    private String transformArray(String arrayString){
        
        String[] arrayAux1 = arrayString.split("\\[");   
        String[] arrayAux2 = arrayAux1[1].split("\\]");
        return "["+arrayAux2[0]+"]";
        
    }
}