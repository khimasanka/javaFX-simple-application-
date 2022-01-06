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

public class AdminDashBoardFormController {
    public AnchorPane adminDashBoardContext;

    public void adminLogOutOnAction(ActionEvent actionEvent) throws IOException {
        ButtonType yes = new ButtonType("Yes", ButtonBar.ButtonData.OK_DONE);
        ButtonType no = new ButtonType("No",ButtonBar.ButtonData.CANCEL_CLOSE);

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION,
                "Are you sure you want to log out?",yes,no);
        alert.setTitle("Log Out Confirmation");
        Optional<ButtonType> result = alert.showAndWait();
        if(result.orElse(no)==yes){
            Stage window = (Stage) adminDashBoardContext.getScene().getWindow();
            window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/LoginForm.fxml"))));
        }else {

        }
    }

    public void roomsDetailsOnAction(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) adminDashBoardContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/RoomsForAdminForm.fxml"))));
    }

    public void mealsDetailsOnAction(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) adminDashBoardContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/MealsForAdminForm.fxml"))));

    }

    public void incomeDetailsOnAction(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) adminDashBoardContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/IncomesForm.fxml"))));
    }
}
