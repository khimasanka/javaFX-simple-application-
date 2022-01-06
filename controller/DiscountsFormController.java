package controller;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import model.RoomDiscounts;

import java.io.IOException;
import java.util.ArrayList;

public class DiscountsFormController {
    public AnchorPane discountsContext;
    public TableView<RoomDiscounts> tblRmDiscount;
    public TableColumn colRmType;
    public TableColumn colDRate;
    public TableColumn colWhen;

    static ArrayList<RoomDiscounts> rmDiscountsArrayList = new ArrayList();
    static {
        rmDiscountsArrayList.add(new RoomDiscounts("Double AC Room","15%","2021/10/31"));
    }

    public void initialize(){
        colRmType.setCellValueFactory(new PropertyValueFactory("rmType"));
        colDRate.setCellValueFactory(new PropertyValueFactory("dRate"));
        colWhen.setCellValueFactory(new PropertyValueFactory("uWhen"));

        tblRmDiscount.setItems(FXCollections.observableArrayList(rmDiscountsArrayList));

    }

    public void backToRepDashOnAction(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) discountsContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/ReceptionistDashBoardForm.fxml"))));
    }

    public void cancelBookingOnAction(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) discountsContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/BookingCancelForm.fxml"))));
    }

    public void guestOnAction(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) discountsContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/GuestDetailsForm.fxml"))));

    }

    public void mealsOnAction(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) discountsContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/MealPlansForm.fxml"))));
    }

    public void checkOutOnAction(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) discountsContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/CheckOutWindowForm.fxml"))));
    }

    public void checkInOnAction(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) discountsContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/CheckInWindowForm.fxml"))));
    }
}
