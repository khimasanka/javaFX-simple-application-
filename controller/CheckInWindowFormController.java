package controller;

import com.jfoenix.controls.JFXDatePicker;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import  java.time.LocalDate;

import java.io.IOException;
import java.net.URL;

public class CheckInWindowFormController {
    public AnchorPane chckInContext;
    public ComboBox cmbRoomType;
    public ComboBox cmbCapacity;
    public Label dateLabel;
    public JFXDatePicker checkInDatePicker;

    public void initialize(){
        cmbRoomType.getItems().addAll(
                "AC",
                "Non AC",
                "VIP"
        );

        cmbCapacity.getItems().addAll(
                "Single",
                "Double",
                "Triple",
                "Quad"
        );
    }

    public void backToRepDashOnAction(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) chckInContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/ReceptionistDashBoardForm.fxml"))));
    }

    public void checkInSubmitOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/PrintBillForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Scene scene =new Scene(load);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();


    }

    public void checkOutWindowOnAction(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) chckInContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/CheckOutWindowForm.fxml"))));
    }

    public void mealsWindowOnAction(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) chckInContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/MealPlansForm.fxml"))));
    }



    public void bookingCancelWindowOnAction(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) chckInContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/BookingCancelForm.fxml"))));
    }

    public void guestWindowOnAction(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) chckInContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/GuestDetailsForm.fxml"))));
    }

    public void DiscountsWindowOnAction(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) chckInContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/DiscountsForm.fxml"))));
    }

    public void checkInToBillOnAction(ActionEvent actionEvent) {

    }
}
