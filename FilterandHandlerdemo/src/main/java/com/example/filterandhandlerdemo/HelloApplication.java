package com.example.filterandhandlerdemo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

    private Stage primaryStage;
    @Override
    public void start(Stage stage) throws IOException {
        this.primaryStage = stage;
        showMainWindow();

    }

    private void showMainWindow()
    {
        try {
            FXMLLoader loader=new FXMLLoader(getClass().getResource("hello-view.fxml"));
            BorderPane root = (BorderPane)loader.load();

            HelloController controller=loader.getController();
            controller.initListener();

            Scene scene = new Scene(root,400,400);

            primaryStage.setScene(scene);
            primaryStage.setTitle("EventHandler和EventFilter示例");
            primaryStage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch();
    }
}