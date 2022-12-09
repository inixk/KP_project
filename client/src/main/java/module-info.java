module com.example.client {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires java.desktop;
    requires java.logging;


    opens main to javafx.fxml;
    exports main;
    opens controllers to javafx.fxml;
    exports controllers;
}