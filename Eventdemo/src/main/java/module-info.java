module com.example.eventdemo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.eventdemo to javafx.fxml;
    exports com.example.eventdemo;
}