package com.View;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import java.awt.Dimension;
// Import the components to be used in the window
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JSpinner;

import java.awt.Font;
import javax.swing.SpinnerNumberModel;

public class Win_Principal extends JFrame{
    //Layout of Frame
    private GroupLayout layout;
    //Denition of Labels
    private JLabel lblTitleWindow;
    private JLabel lblNumBooks;
    // Labels for information of book
    private JLabel lblTitleBook;
    private JLabel lblAuthor;
    private JLabel lblDescription;
    private JLabel lblIsbn;
    private JLabel lblPublished;
    private JLabel lblPublisher;
    private JLabel lblGenre;
    // Text Fields for information of book
    private JTextField txtTitleBook;
    private JTextField txtAuthor;
    private JTextArea txtDescription;
    private JScrollPane scpnDescription;
    private JTextField txtIsbn;
    private JTextField txtPublished;
    private JTextField txtPublisher;
    private JTextField txtGenre;
    // Spinner for obtain number of books to display
    private JSpinner spnNumBooks;
    // Buttons for control of window
    private JButton btnObtain;
    private JButton btnAddress;
    private JButton btnComments;
    private JButton btnNext;
    private JButton btnPrevious;

    public Win_Principal(){
        super("Principal");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(new Dimension(800,500));
        setMinimumSize(new Dimension(800,500));
        setMaximumSize(new Dimension(800,500));

        initComponents();
    }

    private void initComponents(){
        lblTitleWindow = new JLabel();
        lblTitleWindow.setFont(new Font("Century Gothic", 1, 36));
        lblTitleWindow.setText("Library FAKER API");

        lblTitleBook = new JLabel();
        lblTitleBook.setFont(new Font("Century Gothic", 1, 12));
        lblTitleBook.setText("Title of Book:");

        txtTitleBook = new JTextField();
        txtTitleBook.setFont(new Font("Century Gothic", 1, 12));

        lblAuthor = new JLabel();
        lblAuthor.setFont(new Font("Century Gothic", 1, 12));
        lblAuthor.setText("Title of Book:");

        txtAuthor = new JTextField();
        txtAuthor.setFont(new Font("Century Gothic", 1, 12));

        lblDescription = new JLabel();
        lblDescription.setFont(new Font("Century Gothic", 1, 12));
        lblDescription.setText("Description of Book:");

        txtDescription = new JTextArea(5,20);
        txtDescription.setFont(new Font("Century Gothic", 1, 12));
        txtDescription.setLineWrap(true);
        scpnDescription = new JScrollPane();
        scpnDescription.setViewportView(txtDescription);

        lblIsbn = new JLabel();
        lblIsbn.setFont(new Font("Century Gothic", 1, 12));
        lblIsbn.setText("Genre of Book:");

        txtIsbn = new JTextField();
        txtIsbn.setFont(new Font("Century Gothic", 1, 12));

        lblGenre = new JLabel();
        lblGenre.setFont(new Font("Century Gothic", 1, 12));
        lblGenre.setText("Genre of Book:");

        txtGenre = new JTextField();
        txtGenre.setFont(new Font("Century Gothic", 1, 12));

        lblPublished = new JLabel();
        lblPublished.setFont(new Font("Century Gothic", 1, 12));
        lblPublished.setText("Genre of Book:");

        txtPublished = new JTextField();
        txtPublished.setFont(new Font("Century Gothic", 1, 12));

        lblPublisher = new JLabel();
        lblPublisher.setFont(new Font("Century Gothic", 1, 12));
        lblPublisher.setText("Genre of Book:");

        txtPublisher = new JTextField();
        txtPublisher.setFont(new Font("Century Gothic", 1, 12));

        lblNumBooks = new JLabel();
        lblNumBooks.setFont(new Font("Century Gothic", 1, 12));
        lblNumBooks.setText("Displayed Books:");

        // from 0 to 1,000, in 1 steps start value 10  
        spnNumBooks = new JSpinner(new SpinnerNumberModel(10, 0, 1000, 1));
        spnNumBooks.setFont(new Font("Century Gothic", 1, 12));

        // Initializing buttons for control
        btnObtain = new JButton();
        btnObtain.setFont(new Font("Century Gothic", 1, 12));
        btnObtain.setText("Obtain Books");

        btnAddress = new JButton();
        btnAddress.setFont(new Font("Century Gothic", 1, 12));
        btnAddress.setText("Obtain Adress");

        btnComments = new JButton();
        btnComments.setFont(new Font("Century Gothic", 1, 12));
        btnComments.setText("Comments");

        btnNext = new JButton();
        btnNext.setFont(new Font("Century Gothic", 1, 12));
        btnNext.setText("Next");

        btnPrevious = new JButton();
        btnPrevious.setFont(new Font("Century Gothic", 1, 12));
        btnPrevious.setText("Previous");

        // Initializing Layout of JFrame
        layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);

        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lblTitleBook, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblTitleWindow, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTitleBook, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtAuthor, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAuthor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                    .addComponent(lblDescription, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                    .addComponent(scpnDescription, javax.swing.GroupLayout.Alignment.LEADING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblNumBooks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(spnNumBooks, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnObtain, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtGenre, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtPublisher)
                                .addComponent(lblPublisher, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                .addComponent(txtPublished)
                                .addComponent(lblPublished, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                .addComponent(txtIsbn)
                                .addComponent(lblIsbn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblGenre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                                .addComponent(btnPrevious, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnAddress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnComments, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTitleWindow, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblNumBooks, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(spnNumBooks, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnObtain, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTitleBook, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblIsbn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTitleBook, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIsbn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(lblAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblPublished, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPublished, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(scpnDescription))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPublisher, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnComments, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPublisher, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(lblGenre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 12, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnPrevious, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtGenre, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
    }

    // Getters of Components
    public JLabel getLblTitleWindow(){
        return lblTitleWindow;
    }

    public JLabel getLblTitleBook(){
        return lblAuthor;
    }

    public JLabel getLblDescription(){
        return lblDescription;
    }

    public JLabel getLblIsbn(){
        return lblIsbn;
    }

    public JLabel getLblGenre(){
        return lblGenre;
    }

    public JLabel getLblPublished(){
        return lblPublished;
    }

    public JLabel getLblPublisher(){
        return lblPublisher;
    }

    public JLabel getLblNumBooks(){
        return lblNumBooks;
    }

    public JTextField getTxtTitleBook(){
        return txtTitleBook;
    }

    public JTextField getTxtAuthor(){
        return txtAuthor;
    }

    public JTextArea getTxtDescription(){
        return txtDescription;
    }

    public JTextField getTxtIsbn(){
        return txtIsbn;
    }

    public JTextField getTxtGenre(){
        return txtGenre;
    }

    public JTextField getTxtPublished(){
        return txtPublished;
    }

    public JTextField getTxtPublisher(){
        return txtPublisher;
    }

    public JSpinner getSpnNumBooks(){
        return spnNumBooks;
    }

    public JButton getBtnObtain(){
        return btnObtain;
    }

    public JButton getBtnAddress(){
        return btnAddress;
    }

    public JButton getBtnNext(){
        return btnNext;
    }

    public JButton getBtnPrevious(){
        return btnPrevious;
    }


    public static void main(String[] args) {
        Win_Principal win = new Win_Principal();
        win.setVisible(true);
    }
}