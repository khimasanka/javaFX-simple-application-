package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import model.ChineseMealPacks;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class MealsForAdminFormController implements Initializable {
    public AnchorPane mealPkgForAdmContext;
    public AnchorPane mealsContext;
    public TableView<ChineseMealPacks> tblAdminCMeals;
    public TableColumn<ChineseMealPacks,String> colCMealNo;
    public TableColumn<ChineseMealPacks,String> colCMealName;
    public TableColumn<ChineseMealPacks,String> colCMealPrice;
    public TableColumn<ChineseMealPacks,String> colCMealOrders;
    public TableColumn<ChineseMealPacks,String> colCMealTime;

   /* ArrayList<ChineseMealPacks> chineseMealPacksArrayList = new ArrayList();

    {
        //initialize(chineseMealPacksArrayList,);
        chineseMealPacksArrayList.add(new ChineseMealPacks("c001","Fried Rice","RS.500","11","Dinner/Lunch"));
    }*/

    public void initialize(URL location, ResourceBundle resources){
        colCMealNo.setCellValueFactory(new PropertyValueFactory<ChineseMealPacks,String>("cMealNo"));
        colCMealName.setCellValueFactory(new PropertyValueFactory<ChineseMealPacks,String>("cMealName"));
        colCMealPrice.setCellValueFactory(new PropertyValueFactory<ChineseMealPacks,String>("cMealPrice"));
        colCMealOrders.setCellValueFactory(new PropertyValueFactory<ChineseMealPacks,String>("cMealOrders"));
        colCMealTime.setCellValueFactory(new PropertyValueFactory<ChineseMealPacks,String>("cMealTime"));

        tblAdminCMeals.setItems(observableList);
    }
    ObservableList<ChineseMealPacks>observableList= FXCollections.observableArrayList(
            new ChineseMealPacks("c001","fried rice","500","11","Dinner")
    );

    public void backToAdmDashBoard(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) mealPkgForAdmContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/AdminDashBoardForm.fxml"))));


    }

    public void chineseMealsWindowOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/MealsForAdminForm.fxml");
        Parent load = FXMLLoader.load(resource);
        mealPkgForAdmContext.getChildren().add(load);
    }

    public void localMealsWindowOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/LocalMealsForAdminForm.fxml");
        Parent load = FXMLLoader.load(resource);
        mealsContext.getChildren().add(load);
    }

    public void frenchMealWindowOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/FrenchMealsForAdminForm.fxml");
        Parent load = FXMLLoader.load(resource);
        mealsContext.getChildren().add(load);
    }

    public void saveChineseMeals(ActionEvent actionEvent) {
        new Alert(Alert.AlertType.CONFIRMATION,"Saved..", ButtonType.CLOSE).show();
    }
}
