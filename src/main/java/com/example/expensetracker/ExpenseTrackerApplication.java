package com.example.expensetracker;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

import static javafx.application.Application.launch;

public class ExpenseTrackerApplication extends Application {

    @FXML
    private Button btnNeuEinkommen;

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(ExpenseTrackerApplication.class.getResource("ExpenseTrackerView.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        //stage.setMaximized(true);
        stage.setTitle("ExpenseTracker");

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
