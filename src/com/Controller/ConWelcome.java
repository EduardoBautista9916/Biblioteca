package com.Controller;

import com.Model.Languages;
import com.View.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConWelcome {
        private Languages language;
        Win_Welcome window;
        

        public ConWelcome(){
            language = new Languages();
            window = new Win_Welcome(language.getAvaibleLanguages());
            window.getBtnStart().addActionListener(new actionBtnStart());
            window.setVisible(true);
        }

        private class actionBtnStart implements ActionListener {

            @Override
            public void actionPerformed(ActionEvent eventStart) {
                language.setSelectLanguage(language.getAvaibleLanguages()[window.getCbxLanguages().getSelectedIndex()]);
                System.out.println(language.getSelectLanguage()); 
            }
        
            
        }
}
