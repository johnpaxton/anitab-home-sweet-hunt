package org.anitab;

public enum WhoPays {
    LANDLORD("Landlord pays"),
    TENANT("Tenant pays");

    //variable inside the enum, holds the custom text for each option
    private final String label;

    //constructor, automatically private: saves custom text to label variable
    WhoPays(String label) {
        this.label = label;
    }

    //getter
    public String getLabel(){
        return label;
    }
}
