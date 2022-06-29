package com.oodles.Criteria_Builder.util;

public enum States {

    MAHARASHTRA("Maharashtra"),
    MADHYAPRADESH("MadhyaPradesh"),
    TELANGANA("Telangana");

    private final String state;

    private States(String state) {
        this.state = state;
    }

    public String getStates() {
        return this.state;
    }
}