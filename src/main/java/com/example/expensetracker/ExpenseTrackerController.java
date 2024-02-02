package com.example.expensetracker;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ExpenseTrackerController {

    public void processNeuButton(ActionEvent event) {
        FXMLLoader newEinkommenLoader = new FXMLLoader();
        newEinkommenLoader.setLocation(getClass().getResource("einkommenView.fxml"));
        try {
            Scene newScene = new Scene(newEinkommenLoader.load());
            Stage newEinkommenStage = new Stage();
            newEinkommenStage.setTitle("Neues Einkommen");
            newEinkommenStage.setScene(newScene);
            newEinkommenStage.show();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
