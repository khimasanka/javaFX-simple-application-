package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class ReservedRoomsFormController {
    public AnchorPane reservedRoomsContext;

    public void toDashBoardOnAction(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) reservedRoomsContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/ReceptionistDashBoardForm.fxml"))));
    }

    public void avblWindowOnAction(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) reservedRoomsContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/AvailableRoomsForm.fxml"))));
    }
}
