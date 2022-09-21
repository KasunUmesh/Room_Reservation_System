package controller;

import com.jfoenix.controls.JFXComboBox;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginFormController {
    public TextField txtUserName;
    public PasswordField txtPassword;
    public JFXComboBox<String> cmbPosition;
    public AnchorPane root;

    public void initialize(){

        ObservableList<String> list = FXCollections.observableArrayList("Admin", "Receptionist");
        cmbPosition.setItems(list);

    }

    public void btnSignInOnAction() throws IOException {

        if (cmbPosition.getValue() == "Admin"){

            Parent parent = FXMLLoader.load(getClass().getResource("../view/AdminDashBoardForm.fxml"));
            Scene scene = new Scene(parent);

            Stage primaryStage = (Stage) this.root.getScene().getWindow();

            primaryStage.setScene(scene);
            primaryStage.centerOnScreen();
            primaryStage.setResizable(false);

        } else if (cmbPosition.getValue() == "Receptionist") {

            Parent parent = FXMLLoader.load(getClass().getResource("../view/ReceptionDashBoardForm.fxml"));
            Scene scene = new Scene(parent);

            Stage primaryStage = (Stage) this.root.getScene().getWindow();

            primaryStage.setScene(scene);
            primaryStage.centerOnScreen();
            primaryStage.setResizable(false);

        }else {
            new Alert(Alert.AlertType.WARNING,"Try agian", ButtonType.OK).show();
        }



    }
}
