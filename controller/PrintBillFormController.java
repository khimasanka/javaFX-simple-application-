package controller;

import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;

public class PrintBillFormController {


    public Label dateLabel;

    public void sendEmailOnAction(ActionEvent actionEvent) {
        new Alert(Alert.AlertType.INFORMATION,"Email sending is successful", ButtonType.CLOSE).show();
    }

    public void printReceiptOnAction(ActionEvent actionEvent) {
        new Alert(Alert.AlertType.INFORMATION,"Receipt printing is successful", ButtonType.CLOSE).show();

    }
}
