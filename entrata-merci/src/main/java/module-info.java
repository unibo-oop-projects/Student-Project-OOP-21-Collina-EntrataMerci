module magazzino.entratamerci {
    requires javafx.graphics;
    requires javafx.controls;
    requires javafx.fxml;
    requires com.google.gson;
    requires org.junit.jupiter.api;
    requires org.junit.platform.commons;


    opens magazzino.entratamerci to javafx.fxml;
    opens magazzino.entratamerci.controller to javafx.fxml;
    opens magazzino.entratamerci.models to com.google.gson;
    opens magazzino.entratamerci.dto to javafx.base;
    exports magazzino.entratamerci;
    exports magazzino.entratamerci.controller;
    exports magazzino.entratamerci.models;
    exports magazzino.entratamerci.service;
}