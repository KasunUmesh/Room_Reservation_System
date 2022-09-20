package controller;

import animatefx.animation.FadeIn;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.IOException;

public class AdminDashBoardFormController {
    public AnchorPane rootFullPage;
    public Pane rootHome;

    public void initialize(){

        try {
            Pane pane = FXMLLoader.load(getClass().getResource("../view/AdminHomeForm.fxml"));
            rootHome.getChildren().setAll(pane);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public void btnHomeOnAction(ActionEvent actionEvent) throws IOException {
        Pane pane = FXMLLoader.load(getClass().getResource("../view/AdminHomeForm.fxml"));
        rootHome.getChildren().setAll(pane);

        new FadeIn(rootHome).play();

    }

    public void btnRoomOnAction(ActionEvent actionEvent) throws IOException {
        Pane pane = FXMLLoader.load(getClass().getResource("../view/AdminRoomDetailsForm.fxml"));
        rootHome.getChildren().setAll(pane);
        new FadeIn(rootHome).play();
    }

    public void btnMealOnAction(ActionEvent actionEvent) throws IOException {
        Pane pane = FXMLLoader.load(getClass().getResource("../view/AdminMealPackageForm.fxml"));
        rootHome.getChildren().setAll(pane);
        new FadeIn(rootHome).play();
    }

    public void btnIncomeOnAction(ActionEvent actionEvent) throws IOException {
        Pane pane = FXMLLoader.load(getClass().getResource("../view/AdminIncomeForm.fxml"));
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
}
