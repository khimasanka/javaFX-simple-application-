package controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import com.sun.applet2.preloader.event.AppInitEvent;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.applet.Applet;
import java.beans.AppletInitializer;
import java.beans.beancontext.BeanContext;
import java.io.IOException;

public class AdminLoginFormController {
    public AnchorPane adminLoginContext;
    public JFXPasswordField admPassword;
    public JFXButton admLogin;
    public JFXTextField adminUserName;
    public Label wrongDetails;


    public void backToFirstWindow(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) adminLoginContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/LoginForm.fxml"))));
    }

    public void moveToPassword(ActionEvent actionEvent) {
        admPassword.requestFocus();
    }

    public void moveToLogin(ActionEvent actionEvent) {
        admLogin.requestFocus();
    }

    public void adminDashBoardOnAction(ActionEvent actionEvent) throws IOException {
        if (actionEvent.getSource()==admLogin){
            String username = adminUserName.getText();
            String password = admPassword.getText();
            if(username.equalsIgnoreCase("Admin")&& password.equalsIgnoreCase("admin")) {
                System.out.println("login success");
                Stage window = (Stage) adminLoginContext.getScene().getWindow();
                window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/AdminDashBoardForm.fxml"))));

            }else if
                (adminUserName.getText().isEmpty()&& admPassword.getText().isEmpty()){
                    wrongDetails.setText("Please enter your data.");



            }else {
                   wrongDetails.setText("Wrong username or password!");
                }

        }

    }




}
