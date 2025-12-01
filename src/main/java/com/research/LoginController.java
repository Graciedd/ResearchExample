package com.research;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class LoginController {

    @FXML
    private Button createAccountButton;

    @FXML
    private Button loginButton;

    @FXML
    private Text noAccountTXT;

    @FXML
    private TextField passwordField;

    @FXML
    private Text passwordTXT;

    @FXML
    private Text titleCritic;

    @FXML
    private Text titleTheater;

    @FXML
    private TextField usernameField;

    @FXML
    private Text usernameTXT;

    @FXML
    private Text welcomeTo;

    @FXML
    void goToHome(ActionEvent event) throws IOException {
        String username = usernameField.getText();
        String password = passwordField.getText();

        // For demo purposes, just accept any login
        if(username.isEmpty() || password.isEmpty()) {
            System.out.println("Invalid username or password");
            return;
        }

        System.out.println("Valid username and password");
        App.setRoot("Home");
    }

    @FXML
    void goToCreateAccount(ActionEvent event) throws IOException {
        System.out.println("Going to Create Account screen");
        App.setRoot("createAccount");
        // App.setRoot("CreateAccount"); // Uncomment when you have CreateAccount.fxml
    }
}


