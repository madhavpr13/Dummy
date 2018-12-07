package com.section3.exercises;

public class PetRock {

    private String name;
    private boolean happy = false;

    public PetRock(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String theName) {
        name = theName;
    }


    public boolean isHappy() {
        return happy;
    }

    public void playWithRock() {
        happy = true;

    }
}
