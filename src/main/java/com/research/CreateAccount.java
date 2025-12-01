package com.research;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;

public class CreateAccount{

    @FXML
    private Pane createAccount;

    @FXML
    private TextField dobField;

    @FXML
    private Text dobTXT;

    @FXML
    private TextField emailField;

    @FXML
    private Text emailTXT;

    @FXML
    private TextField firstNameField;

    @FXML
    private Text firstNameTXT;

    @FXML
    private TextField lastNameField;

    @FXML
    private Text lastNameTXT;

    @FXML
    private Button nextPass;

    @FXML
    private Text titleCreateAccount;

    @FXML
    private TextField usernameCAField;

    @FXML
    private Text usernameTXT;

    @FXML
    void toPassword(ActionEvent event) throws IOException{
        String username = usernameCAField.getText();
        String firstName = firstNameField.getText();
        String lastName = lastNameField.getText();
        String email = emailField.getText();
        String dob = dobField.getText();


        // For demo purposes, just accept any login
        if(username.isEmpty() || firstName.isEmpty() || lastName.isEmpty() || email.isEmpty() || dob.isEmpty() ) {
            System.out.println("Invalid username or password");
            return;
        }

        System.out.println("Valid username and password");
        App.setRoot("passwordCheck");
    }
}


