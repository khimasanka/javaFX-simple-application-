package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class CheckOutWindowFormController {
    public AnchorPane checkOutContext;

    public void backToDashBoardOnAction(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) checkOutContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/ReceptionistDashBoardForm.fxml"))));
    }

    public void checkInWindowOnAction(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) checkOutContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/CheckInWindowForm.fxml"))));
    }

    public void guestWindowOnAction(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) checkOutContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/GuestDetailsForm.fxml"))));
    }

    public void mealsDetailOnAction(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) checkOutContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/MealPlansForm.fxml"))));
    }


    public void cancelBookingWindowOnAction(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) checkOutContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/BookingCancelForm.fxml"))));
    }

    public void checkOutOkOnAction(ActionEvent actionEvent) throws IOException {
        new Alert(Alert.AlertType.WARNING,"Check Out Is Successful", ButtonType.FINISH).show();


    }

    public void checkOutCancelOnAction(ActionEvent actionEvent) throws IOException {
        new Alert(Alert.AlertType.INFORMATION,"Check Out Canceled....", ButtonType.OK).show();

    }

    public void discountsWindowOnAction(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) checkOutContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/DiscountsForm.fxml"))));
    }
}
