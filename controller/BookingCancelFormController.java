package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class BookingCancelFormController {
    public AnchorPane bkCancelContext;

    public void backToRepDashOnAction(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) bkCancelContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/ReceptionistDashBoardForm.fxml"))));
    }

    public void guestOnAction(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) bkCancelContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/GuestDetailsForm.fxml"))));
    }

    public void discountsOnAction(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) bkCancelContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/DiscountsForm.fxml"))));
    }

    public void mealsOnAction(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) bkCancelContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/MealPlansForm.fxml"))));
    }

    public void checkOutOnAction(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) bkCancelContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/CheckOutWindowForm.fxml"))));
    }

    public void checkInOnAction(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) bkCancelContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/CheckInWindowForm.fxml"))));
    }

    public void CancelOkAlertOnAction(ActionEvent actionEvent) {
        new Alert(Alert.AlertType.WARNING,"Check Out Canceled....", ButtonType.OK).show();

    }

    public void bookingCancelAlertOnAction(ActionEvent actionEvent) {
        new Alert(Alert.AlertType.INFORMATION,"Action Canceled..", ButtonType.OK).show();
    }
}
