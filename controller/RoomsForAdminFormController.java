package controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import model.Rooms;
import view.tm.RoomsTm;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Optional;

public class RoomsForAdminFormController {
    public AnchorPane roomForAdmContext;
    public JFXTextField txtId;
    public JFXTextField txtType;
    public JFXTextField txtCapacity;
    public JFXTextField txtModStatus;
    public JFXTextField txtPrice;
    public JFXTextField txtBkStatus;
    public TableView<RoomsTm> tblRooms;
    public TableColumn colId;
    public TableColumn colType;
    public TableColumn colCapacity;
    public TableColumn colModStatus;
    public TableColumn colBooking;
    public TableColumn colPrice;
    public TableColumn colDelete;

    static ArrayList<Rooms> roomsDetails = new ArrayList();
    public JFXButton btnSave;

    public void initialize(){
        colId.setCellValueFactory(new PropertyValueFactory<>("id"));
        colType.setCellValueFactory(new PropertyValueFactory<>("type"));
        colCapacity.setCellValueFactory(new PropertyValueFactory<>("capacity"));
        colModStatus.setCellValueFactory(new PropertyValueFactory<>("modStatus"));
        colBooking.setCellValueFactory(new PropertyValueFactory<>("booking"));
        colPrice.setCellValueFactory(new PropertyValueFactory<>("price"));
        colDelete.setCellValueFactory(new PropertyValueFactory<>("btn"));

        tblRooms.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
        loadRoomsData(newValue);
        });
    }

    private void loadRoomsData(RoomsTm tm) {
        txtId.setText(tm.getId());
        txtType.setText(tm.getType());
        txtCapacity.setText(tm.getCapacity());
        txtModStatus.setText(tm.getModStatus());
        txtBkStatus.setText(tm.getBooking());
        txtPrice.setText(tm.getPrice());
    }

    public void backToAdminDashBoardOnAction(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) roomForAdmContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/AdminDashBoardForm.fxml"))));
    }

    public boolean isExists(Rooms rooms){
        for (Rooms r:roomsDetails
        ) {
            if(r.getId().equalsIgnoreCase(rooms.getId())){
                return false;
            }
        }

        return true;

    }

    public void saveUpdateOnAction(ActionEvent actionEvent) {

        Rooms rooms = new Rooms(txtId.getText(),txtType.getText(),txtCapacity.getText(),txtModStatus.getText(),txtBkStatus.getText(),txtPrice.getText());
        txtId.clear();
        txtType.clear();
        txtCapacity.clear();
        txtBkStatus.clear();
        txtModStatus.clear();
        txtPrice.clear();

        if(isExists(rooms)){
            if(roomsDetails.add(rooms)){
                loadRoomDetails();
                new Alert(Alert.AlertType.CONFIRMATION,"Saved..",ButtonType.CLOSE).show();

        }else{
                new Alert(Alert.AlertType.WARNING,"Try Again..",ButtonType.CLOSE).show();
            }
        }else {
            new Alert(Alert.AlertType.WARNING,"Already Exists..",ButtonType.CLOSE).show();

        }
    }

    private void loadRoomDetails(){
        ObservableList<RoomsTm>tmObservableList = FXCollections.observableArrayList();
        for (Rooms temp:roomsDetails
             ) {
            Button btn = new Button("Delete");
            tmObservableList.add(
                    new RoomsTm(temp.getId(),temp.getType(),temp.getCapacity(),temp.getModStatus(),temp.getBooking(),temp.getPrice(),btn)
            );
            btn.setOnAction((e)->{
                ButtonType yes = new ButtonType("Yes",ButtonBar.ButtonData.OK_DONE);
                ButtonType no = new ButtonType("No", ButtonBar.ButtonData.CANCEL_CLOSE);

                Alert alert =new Alert(Alert.AlertType.CONFIRMATION,"Are you sure whether you want to Delete this room details ?",yes,no);
                alert.setTitle("Confirmation Alert");
                Optional<ButtonType> result = alert.showAndWait();

                if(result.orElse(no)==yes){
                    roomsDetails.remove(temp);
                    loadRoomDetails();
                }else{

                }

            });
        }
        tblRooms.setItems(tmObservableList);
    }

    public void moveToType(ActionEvent actionEvent) {
        txtType.requestFocus();
    }

    public void moveToCapacity(ActionEvent actionEvent) {
        txtCapacity.requestFocus();
    }

    public void moveToModStatus(ActionEvent actionEvent) {
        txtModStatus.requestFocus();
    }

    public void moveToBooking(ActionEvent actionEvent) {
        txtBkStatus.requestFocus();
    }

    public void moveToPrice(ActionEvent actionEvent) {
        txtPrice.requestFocus();
    }

    public void moveToSave(ActionEvent actionEvent) {
        btnSave.requestFocus();
    }


    public void bookedRoomsWindowOnAction(ActionEvent actionEvent) throws IOException {
        Stage window = (Stage) roomForAdmContext.getScene().getWindow();
        window.setScene(new Scene(FXMLLoader.load(getClass().getResource("../view/BookedRoomsForAdminForm.fxml"))));
    }
}
