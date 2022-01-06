package controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class ReceptionistLoginFormController {
    public AnchorPane receptionistLoginContext;
    public JFXPasswordField admPassword;
    public JFXButton rcptLogin;
    public JFXTextField repUserName;
    public Label errorMsgIndex;

    public void backToFirstWindow(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) receptionistLoginContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/LoginForm.fxml"))));

    }

    public void moveToPassword(ActionEvent actionEvent) {
        admPassword.requestFocus();
    }

    public void moveToLogin(ActionEvent actionEvent) {
        rcptLogin.requestFocus();
    }

    public void receptionistLoginOnAction(ActionEvent actionEvent) throws IOException {
        if (actionEvent.getSource()==rcptLogin){
            String username = repUserName.getText();
            String password = admPassword.getText();
            if(username.equalsIgnoreCase("Admin")&& password.equalsIgnoreCase("admin")) {
                System.out.println("login success");
                Stage window = (Stage) receptionistLoginContext.getScene().getWindow();
                window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/ReceptionistDashBoardForm.fxml"))));

            }else if
            (repUserName.getText().isEmpty()&& admPassword.getText().isEmpty()){
                errorMsgIndex.setText("Please enter your data.");



            }else {
                errorMsgIndex.setText("Wrong username or password!");
            }

        }

    }
}
