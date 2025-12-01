package com.research;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class PasswordCheck {

    @FXML
    private Button backToCA;

    @FXML
    private Button makeAccount;

    @FXML
    private Text pass;

    @FXML
    private TextField passwordCAField;

    @FXML
    private Text retype;

    @FXML
    private TextField retypeField;

    @FXML
    private Text titleCreateAccount;

    @FXML
    void backCreateAccount(ActionEvent event) throws IOException {
        App.setRoot("createAccount");
    }

    @FXML
    void createMyAccount(ActionEvent event) throws IOException{
        String retypePassword = retypeField.getText();
        String password = passwordCAField.getText();

        // For demo purposes, just accept any login
        if(retypePassword.isEmpty() || password.isEmpty() || !password.equals(retypePassword)) {
            System.out.println("Invalid username or password");
            return;
        }

        System.out.println("Valid username and password");
        App.setRoot("home");
    }

}