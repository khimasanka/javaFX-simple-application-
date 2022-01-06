package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class IncomesFormController {
    public AnchorPane incomesForAdminContext;
    public AnchorPane incomeContext;

    public void monthlyIncomeOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/incomesForm.fxml");
        Parent load = FXMLLoader.load(resource);
        incomesForAdminContext.getChildren().add(load);
    }

    public void annuallyIncomeOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/AnnuallyIncomesForm.fxml");
        Parent load = FXMLLoader.load(resource);
        incomeContext.getChildren().add(load);
    }

    public void adminDashBoardOnAction(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) incomesForAdminContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/AdminDashBoardForm.fxml"))));
    }
}
