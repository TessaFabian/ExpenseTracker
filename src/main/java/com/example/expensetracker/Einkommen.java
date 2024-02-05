package com.example.expensetracker;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Einkommen {
    private StringProperty einkommen;
    private DoubleProperty betrag;
    private StringProperty datum;

    // Property für Feld Einkommen
    public String getEinkommen() {
        return einkommenProperty().get();
    }

    public void setEinkommen(String einkommen) {
        this.einkommenProperty().set(einkommen);
    }

    public StringProperty einkommenProperty() {
        if (this.einkommen == null) {
            this.einkommen = new SimpleStringProperty(this, "einkommen");
        }
        return this.einkommen;
    }

    //Property für Feld Betrag
    public Double getBetrag() {
        return this.betragProperty().get();
    }

    public void setBetrag(Double betrag) {
        this.betragProperty().set(betrag);
    }

    public DoubleProperty betragProperty() {
        if (this.betrag == null) {
            this.betrag = new SimpleDoubleProperty(this, "betrag");
        }
        return this.betrag;
    }

    //Property für Feld Datum
    public void setDatum(String datum) {
        this.datumProperty().set(datum);
    }

    public String getDatum() {
        return this.datumProperty().get();
    }

    public StringProperty datumProperty() {
        if (this.datum == null) {
            this.datum = new SimpleStringProperty(this, "datum");
        }
        return this.datum;
    }

}
