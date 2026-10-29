package org.anitab;

public enum HeatingType {
    GAS("Gas"),
    OIL("Oil"),
    HEATPUMP("Heat Pump"),
    ELECTRIC("Electric"),
    FORCEDAIR("Forced Air"),
    SOLAR("Solar");

    //variable inside the enum, holds the custom text for each option
    private final String label;

    //constructor, automatically private: saves custom text to label variable
    HeatingType(String label){
        this.label = label;
    }

    //getter
    public String getLabel(){
        return label;
    }
}
