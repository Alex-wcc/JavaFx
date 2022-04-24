package com.example.controldemo;

import java.util.Optional;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextInputDialog;

public class HelloController {
    @FXML
    public void showAlert1() {
        Alert alert=new Alert(AlertType.INFORMATION);
        alert.setTitle("Information Title");
        alert.setHeaderText("Information HeaderText");
        alert.setContentText("this is information message");
        alert.showAndWait();
    }
    @FXML
    public void showAlert2() {
        Alert alert=new Alert(AlertType.ERROR);

        alert.setTitle("Error Title");
        alert.setHeaderText("Error HeaderText");
        alert.setContentText("this is a serious error message");
        alert.showAndWait();
    }

    @FXML
    public void showAlert3() {
        Alert alert=new Alert(AlertType.CONFIRMATION);

        alert.setTitle("Confirmation Title");
        alert.setHeaderText("Confirmation HeaderText");
        alert.setContentText("this is a Confirmation message");
        Optional<ButtonType> result= alert.showAndWait();
        if(result.get()==ButtonType.OK) {
            System.out.println("Ok clicked");
        }
        else {
            System.out.println("Cancel clicked");
        }
    }

    public void showAlert4() {
        TextInputDialog dialog=new TextInputDialog();
        dialog.setTitle("User Input");
        dialog.setContentText("Please enter your age");
        Optional<String> result=dialog.showAndWait();
        if(result.isPresent()) {
            System.out.println("age:"+result.get());
        }
        else {
            System.out.println("no input");
        }
    }
}
