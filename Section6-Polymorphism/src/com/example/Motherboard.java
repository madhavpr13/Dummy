package com.example;

public class Motherboard {

    private String model;
    private String manufacturer;
    private int numRamSlots;
    private int numCardSlots;
    private String bios;

    public Motherboard(String model, String manufacturer, int numRamSlots, int numCardSlots, String bios) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.numRamSlots = numRamSlots;
        this.numCardSlots = numCardSlots;
        this.bios = bios;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getNumRamSlots() {
        return numRamSlots;
    }

    public void setNumRamSlots(int numRamSlots) {
        this.numRamSlots = numRamSlots;
    }

    public int getNumCardSlots() {
        return numCardSlots;
    }

    public void setNumCardSlots(int numCardSlots) {
        this.numCardSlots = numCardSlots;
    }

    public String getBios() {
        return bios;
    }

    public void setBios(String bios) {
        this.bios = bios;
    }

    public void loadProgram(String programName) {
        System.out.println("Program " + programName + " is now loading.");
    }
}
