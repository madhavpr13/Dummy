package com.classes.inheritance;

public class Fish extends Animal{

    private int gills;
    private int eyes;
    private int fins;

    public Fish(String name, int brain, int body, int size, int weight, int gills, int eyes, int fins) {
        super(name, brain, body, size, weight);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }

    private void rest() {

    }

    public void swim(int speed){

        moveMuscles();
        moveBackFin();
        super.move(speed);
    }

    private void moveMuscles(){
        System.out.println("Fish.moveMuscles() called");
    }

    private void moveBackFin() {
        System.out.println("Fish.moveBackFin() called");

    }
}
