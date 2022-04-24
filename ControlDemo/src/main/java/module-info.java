module com.example.controldemo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.controldemo to javafx.fxml;
    exports com.example.controldemo;
}