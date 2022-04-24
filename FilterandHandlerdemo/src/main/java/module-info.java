module com.example.filterandhandlerdemo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.filterandhandlerdemo to javafx.fxml;
    exports com.example.filterandhandlerdemo;
}