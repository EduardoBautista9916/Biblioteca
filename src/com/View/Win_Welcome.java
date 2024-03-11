package com.View;

import javax.swing.JFrame;

import java.awt.Dimension;

import javax.swing.GroupLayout;

import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;

import javax.swing.SwingConstants;


import com.Controller.Utilities; // Class to store different types of generic formatting functions

public class Win_Welcome extends JFrame{
    
    // Create the variables to use
    private JLabel lblGreeting;
    private JLabel lblDescription;
    @SuppressWarnings("rawtypes")
    private JComboBox cbxLanguages;
    private JButton btnStart;

    private Utilities util; // variable to be able to use different functions
    private GroupLayout layout;
    
    @SuppressWarnings("unchecked")
    public Win_Welcome(String[][] languages){ //Constructor of the Window of Welcome
        super("WELCOME"); //Title of Window
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,230);
        setMaximumSize(new Dimension(500, 230));
        setMinimumSize(new Dimension(500, 230));
        
        util = new Utilities(); //initializing utilities

        lblGreeting = new JLabel();
        lblGreeting.setFont(new java.awt.Font("Century Gothic", 1, 24));
        lblGreeting.setText("Welcome to Library FAKER API");
        lblGreeting.setHorizontalTextPosition(SwingConstants.CENTER);

        lblDescription = new JLabel();
        lblDescription.setFont(new java.awt.Font("Century Gothic", 0, 12));
        lblDescription.setText(util.mlString("This library is designed to display information of the distinct books that contend in the API of Faker, for start, please select language of books to find."));


        cbxLanguages = new JComboBox<>();

        for(int i = 0; i < languages.length ; i++){
            cbxLanguages.addItem(languages[i][0]);
        }
        cbxLanguages.setMaximumRowCount(3);

        btnStart = new JButton();
        btnStart.setText("START");


        layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);

        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(71, Short.MAX_VALUE)
                .addComponent(lblGreeting, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(cbxLanguages, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnStart, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblGreeting, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(lblDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbxLanguages)
                    .addComponent(btnStart, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

    }

    public JButton getBtnStart(){
        return btnStart;
    }

    public JComboBox getCbxLanguages(){
        return cbxLanguages;
    }

}
