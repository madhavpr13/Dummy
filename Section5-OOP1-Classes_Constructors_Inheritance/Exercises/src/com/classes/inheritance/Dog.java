package com.classes.inheritance;

public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int brain, int body, int size, int weight,
               int eyes, int legs, int tail, int teeth, String coat) {
        super(name, brain, body, size, weight);
        this.eyes  = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    public void bark() {
        System.out.println("Bow-wowwww!!");

    }

    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        this.chew();
        super.eat();

    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called");
        moveLegs(speed);
        super.move(speed);
    }

    private void chew(){
        System.out.println("Dog.chew() called");
    }

    public void walk(){
        System.out.println("Dog.walk() called");
        move(5);
    }

    public void run() {
        System.out.println("Dog.run() called")  ;
        super.move(10);
    }

    private void moveLegs(int speed) {
        System.out.println("Dog.moveLegs() called");
    }

}
