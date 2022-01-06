package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class BookedRoomsForAdminFormController {
    public AnchorPane bookedRoomsForAdmContext;

    public void backToRoomDetailsWindowOnAction(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) bookedRoomsForAdmContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/RoomsForAdminForm.fxml"))));
    }
}
