package com.example.eventdemo;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.fxml.FXMLLoader;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage primaryStage) {
        try {
            FXMLLoader loader=new FXMLLoader(getClass().getResource("hello-view.fxml"));
            AnchorPane root = (AnchorPane)loader.load();

            HelloController controller=loader.getController();
            controller.initButtonActionListener();

            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.setTitle("为事件编写响应代码");
            primaryStage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch();
    }
}