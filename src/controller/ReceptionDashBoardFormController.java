package controller;

import animatefx.animation.FadeIn;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

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

    public void btnAddGuestOnAction(ActionEvent actionEvent) throws IOException {
        Pane pane = FXMLLoader.load(getClass().getResource("../view/ReceptionAddGuestForm.fxml"));
        rootHome.getChildren().setAll(pane);

        new FadeIn(rootHome).play();
    }

    public void btnGuestDetailsOnAction(ActionEvent actionEvent) throws IOException {
        Pane pane = FXMLLoader.load(getClass().getResource("../view/ReceptionGuestDetailForm.fxml"));
        rootHome.getChildren().setAll(pane);

        new FadeIn(rootHome).play();
    }

    public void btnAvailableRoomOnAction(ActionEvent actionEvent) throws IOException {
        Pane pane = FXMLLoader.load(getClass().getResource("../view/ReceptionAvailableRoomForm.fxml"));
        rootHome.getChildren().setAll(pane);

        new FadeIn(rootHome).play();
    }

    public void btnLogOutOnAction(ActionEvent actionEvent) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("../view/LoginForm.fxml"));
        Scene scene = new Scene(parent);

        Stage primaryStage = (Stage) this.rootFullPage.getScene().getWindow();

        primaryStage.setScene(scene);
        primaryStage.centerOnScreen();
    }

    public void btnMaintenanceRoomOnAction(ActionEvent actionEvent) {
    }

    public void btnMealPlansOnAction(ActionEvent actionEvent) {
    }
}
