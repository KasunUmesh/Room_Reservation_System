package controller;

import animatefx.animation.FadeIn;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

import java.io.IOException;

public class ReceptionDashBoardFormController {
    public AnchorPane rootFullPage;
    public Pane rootHome;

    public void initialize(){

        try {
            Pane pane = FXMLLoader.load(getClass().getResource("../view/ReceptionHomeForm.fxml"));
            rootHome.getChildren().setAll(pane);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public void btnHomeOnAction(ActionEvent actionEvent) throws IOException {
        Pane pane = FXMLLoader.load(getClass().getResource("../view/ReceptionHomeForm.fxml"));
        rootHome.getChildren().setAll(pane);

        new FadeIn(rootHome).play();
    }

    public void btnAddGuestOnAction(ActionEvent actionEvent) {
    }

    public void btnGuestDetailsOnAction(ActionEvent actionEvent) {
    }

    public void btnAvailableRoomOnAction(ActionEvent actionEvent) {
    }

    public void btnLogOutOnAction(ActionEvent actionEvent) {
    }

    public void btnMaintenanceRoomOnAction(ActionEvent actionEvent) {
    }

    public void btnMealPlansOnAction(ActionEvent actionEvent) {
    }
}
