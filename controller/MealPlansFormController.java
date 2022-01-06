package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import model.LocalMeals;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;

public class MealPlansFormController {
    public AnchorPane mealPlansContext;
    public AnchorPane localMealContext;
    public TableView<LocalMeals> tblLocalMeals;
    public TableColumn colLNumber;
    public TableColumn colLName;
    public TableColumn colLTime;
    public TableColumn colLPrice;

     ArrayList<LocalMeals> localMealsArrayList = new ArrayList();

     {
        localMealsArrayList.add(new LocalMeals("L001","Rice and Curry (vegan)","Breakfast / Lunch /Dinner","RS.300"));
        localMealsArrayList.add(new LocalMeals("L002","Rice and Curry (Chicken)","Breakfast / Lunch /Dinner","RS.400"));
        localMealsArrayList.add(new LocalMeals("L003","Rice and Curry (Fish)","Breakfast / Lunch /Dinner","RS.350"));
        localMealsArrayList.add(new LocalMeals("L004","Rice and Curry (Egg)","Breakfast / Lunch /Dinner","RS.320"));
        localMealsArrayList.add(new LocalMeals("L005","Bread ","Breakfast ","RS.300"));
    }

    public void initialize(){
        ObservableList<LocalMeals> localMealsObservableList = FXCollections.observableArrayList();
        for (LocalMeals temp:localMealsArrayList
             ) {
                localMealsObservableList.add(
                        new LocalMeals(temp.getlMealNo(),temp.getlMealName(),temp.getlMealNo(),temp.getlMealPrice())
                );
        }

        colLNumber.setCellValueFactory(new PropertyValueFactory("lMealNo"));
        colLName.setCellValueFactory(new PropertyValueFactory("lMealName"));
        colLTime.setCellValueFactory(new PropertyValueFactory("lMealTime"));
        colLPrice.setCellValueFactory(new PropertyValueFactory("l MealPrice"));
        tblLocalMeals.setItems(localMealsObservableList);
    }

    public void backToDashBoardOnAction(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) mealPlansContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/ReceptionistDashBoardForm.fxml"))));
         }

    public void localMealsWindowOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/MealPlansForm.fxml");
        Parent load = FXMLLoader.load(resource);
        mealPlansContext.getChildren().add(load);
    }

    public void chineseMealsWindowOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/ChineseMealsPackForm.fxml");
        Parent load = FXMLLoader.load(resource);
        localMealContext.getChildren().add(load);
    }

    public void frenchMealWindowOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/FrenchMealWindowForm.fxml");
        Parent load = FXMLLoader.load(resource);
        localMealContext.getChildren().add(load);
    }



    public void bookingCancelWindowOnAction(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) mealPlansContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/BookingCancelForm.fxml"))));

    }

    public void discountWindowOnAction(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) mealPlansContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/DiscountsForm.fxml"))));
    }

    public void checkOutWindowOnAction(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) mealPlansContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/CheckOutWindowForm.fxml"))));
    }

    public void checkInWindowOnAction(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) mealPlansContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/CheckInWindowForm.fxml"))));
    }

    public void guestWindowOnAction(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) mealPlansContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/GuestDetailsForm.fxml"))));
    }
}
