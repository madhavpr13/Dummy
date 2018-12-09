package com.classes;

public class Car {

    // fields
    private int doors;
    private int numWheels;
    private String model;
    private String engine;
    private String color;

    // methods
    public void setModel(String model) {
        String validString = model.toLowerCase();
        if ( validString.equals("carrera") || validString.equals("commodore")) {
            this.model = model;
        } else {
            this.model = "Unknown";
        }
    }

    public String getModel() {
        return this.model;
    }

}
