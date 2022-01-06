package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginFormController {
    public AnchorPane loginContext;

    public void openReceptionistLoginWindow(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) loginContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/ReceptionistLoginForm.fxml"))));
    }

    public void openAdminLoginWindow(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) loginContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/AdminLoginForm.fxml"))));
    }
}
