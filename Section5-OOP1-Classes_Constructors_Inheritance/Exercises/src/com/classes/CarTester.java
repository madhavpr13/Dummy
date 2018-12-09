package com.classes;

public class CarTester {

    public static void main(String[] args) {

        Car porsche = new Car();
        Car holden = new Car();

        porsche.setModel("Carrera");
        System.out.println("Model is " + porsche.getModel());

        holden.setModel("theModel");
        System.out.println("Holden model is " + holden.getModel());
    }
}
