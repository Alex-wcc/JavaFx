package com.example.mvcdemo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private Label label1;

    @FXML
    private MenuItem menuItemSet;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    @FXML
    protected void onSetClicked(){label1.setText("Set label1 text!");}
}