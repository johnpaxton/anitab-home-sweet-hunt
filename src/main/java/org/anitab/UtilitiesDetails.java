package org.anitab;

import org.anitab.ACType;
import org.anitab.HeatingType;
import org.anitab.WhoPays;

public class UtilitiesDetails {
    private WhoPays water;
    private WhoPays sewage;
    private WhoPays electric;
    private WhoPays garbage;
    private WhoPays internet;
    private WhoPays heat;
    private HeatingType heatType;
    private ACType AC;

    public UtilitiesDetails(WhoPays water, WhoPays sewage, WhoPays electric, WhoPays garbage, WhoPays internet, WhoPays heat, HeatingType heatType, ACType AC) {
        this.water = water;
        this.sewage = sewage;
        this.electric = electric;
        this.garbage = garbage;
        this.internet = internet;
        this.heat = heat;
        this.heatType = heatType;
        this.AC = AC;
    }

    public WhoPays getWater() {
        return water;
    }

    public WhoPays getSewage() {
        return sewage;
    }

    public WhoPays getElectric() {
        return electric;
    }

    public WhoPays getGarbage() {
        return garbage;
    }

    public WhoPays getInternet() {
        return internet;
    }

    public WhoPays getHeat() {
        return heat;
    }

    public HeatingType getHeatType() {
        return heatType;
    }

    public ACType getAC() {
        return AC;
    }
}