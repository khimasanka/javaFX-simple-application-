package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Optional;

public class ReceptionistDashBoardFormController {

    public AnchorPane repDashBoardContext;

    public void availableRoomsWindowOnAction(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) repDashBoardContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/AvailableRoomsForm.fxml"))));
    }


    public void repLogOutOnAction(ActionEvent actionEvent) throws IOException {
        ButtonType yes = new ButtonType("Yes",ButtonBar.ButtonData.OK_DONE);
        ButtonType no = new ButtonType("No",ButtonBar.ButtonData.CANCEL_CLOSE);

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION,
                "Are you sure you want to log out?",yes,no);
        alert.setTitle("Confirmation Alert");
        Optional<ButtonType>result = alert.showAndWait();

        if(result.orElse(no)==yes){
            Stage window = (Stage) repDashBoardContext.getScene().getWindow();
            window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/LoginForm.fxml"))));

        }else {

        }

    }

    public void reservedRoomsWindowOnAction(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) repDashBoardContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/ReservedRoomsForm.fxml"))));
    }

    public void checkInOnAction(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) repDashBoardContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/CheckInWindowForm.fxml"))));
    }

    public void checkOutOnAction(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) repDashBoardContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/CheckOutWindowForm.fxml"))));
    }

    public void mealPlansOnAction(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) repDashBoardContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/MealPlansForm.fxml"))));
    }



    public void bookingCancelOnAction(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) repDashBoardContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/BookingCancelForm.fxml"))));
    }

    public void guestOnAction(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) repDashBoardContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/GuestDetailsForm.fxml"))));
    }

    public void DiscountOnAction(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) repDashBoardContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/DiscountsForm.fxml"))));
    }
}
