package org.anitab;

public enum ACType {
    CENTRAL("Central Air"),
    FAN("Fan Only"),
    WINDOW("Window Unit"),
    MINISPLITS ("Mini-Split System");

    //variable inside the enum, holds the custom text for each option
    private final String label;

    //constructor, automatically private: saves custom text to label variable
    ACType(String label) {
        this.label = label;
    }

    //getter
    public String getLabel() {
        return label;
    }
}
