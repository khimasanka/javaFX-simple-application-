package controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;

public class LocalMealsForAdminFormController {
    public void saveLocalMealsOnAction(ActionEvent actionEvent) {
        new Alert(Alert.AlertType.CONFIRMATION,"Saved..", ButtonType.CLOSE).show();
    }
}
