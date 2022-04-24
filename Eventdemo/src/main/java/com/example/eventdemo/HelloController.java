package com.example.eventdemo;

import java.util.Random;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HelloController {
    @FXML Label infoLabel;

    @FXML Button traditionalButton;
    @FXML Button lambdaButton;



    public void initButtonActionListener() {
        traditionalButton.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                GetRandomNumber(event);

            }
        });


        lambdaButton.setOnAction(e->GetRandomNumber(e));
    }

    public void GetRandomNumber(ActionEvent event) {
        Random random=new Random();
        String info="生成的随机数："+random.nextInt(1000);
        System.out.println(info);
        infoLabel.setText(info);
    }
}