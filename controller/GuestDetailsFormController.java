package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class GuestDetailsFormController {
    public AnchorPane guestWindowContext;

    public void backToDashBoardOnAction(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) guestWindowContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/ReceptionistDashBoardForm.fxml"))));
    }

    public void cancelBookingOnAction(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) guestWindowContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/BookingCancelForm.fxml"))));
    }

    public void discountsOnAction(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) guestWindowContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/DiscountsForm.fxml"))));
    }

    public void mealsOnAction(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) guestWindowContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/MealPlansForm.fxml"))));
    }

    public void checkOutOnAction(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) guestWindowContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/CheckOutWindowForm.fxml"))));
    }

    public void checkInOnAction(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) guestWindowContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/CheckInWindowForm.fxml"))));
    }
}
