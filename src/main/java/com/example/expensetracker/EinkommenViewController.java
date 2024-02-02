package com.example.expensetracker;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class EinkommenViewController {

    @FXML
    private TextField tfEinkommen;

    @FXML
    private TextField tfBetrag;

    @FXML
    private DatePicker dpDatum;

    @FXML
    private Button btnOK;

    @FXML
    private Button btnAbbr;

    @FXML
    private void processOKButton(ActionEvent event) {

    }

    @FXML
    private void processAbbrButton(ActionEvent event) {
        Stage stage = (Stage) btnAbbr.getScene().getWindow();
        stage.close();
    }


}
