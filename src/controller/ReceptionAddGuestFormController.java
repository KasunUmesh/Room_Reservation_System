package controller;

import animatefx.animation.FadeIn;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class ReceptionAddGuestFormController {
    public AnchorPane rootAddGuest;

    public void btnViewDetailsOnAction(ActionEvent actionEvent) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("../view/ReceptionGuestDetailForm.fxml"));
        rootAddGuest.getChildren().setAll(pane);

        new FadeIn(rootAddGuest).play();
    }
}
