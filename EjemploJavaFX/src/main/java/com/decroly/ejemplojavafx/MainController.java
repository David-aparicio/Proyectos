package com.decroly.ejemplojavafx;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

import javafx.event.ActionEvent;
import model.Persona;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {

    private Persona persona;

    @FXML
    private VBox mainPanel;





    @FXML
    private TextField nameTextField;

    @FXML
    private TextField edadTextField;

    @FXML
    private TextField surNameTextField;

    @FXML
    private TextField emailTextField;

    @FXML
    private TextField TelefonoTextField;









    @FXML
    protected void onCloseButtonAction(ActionEvent event) {
        Platform.exit();
    }
    @FXML
    protected void onSaveButtonAction(ActionEvent event) {
        persona = new Persona();

        try {
            persona.setNombre(nameTextField.getText());
            persona.setApellido(surNameTextField.getText());
            persona.setEdad(Integer.parseInt(edadTextField.getText()));
            persona.setEmail(emailTextField.getText());
            persona.setTelefono(TelefonoTextField.getText());

            mainPanel.setVisible(false);

        } catch (NumberFormatException e) {
            edadTextField.setText("Escriba un número");
            edadTextField.requestFocus();
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}