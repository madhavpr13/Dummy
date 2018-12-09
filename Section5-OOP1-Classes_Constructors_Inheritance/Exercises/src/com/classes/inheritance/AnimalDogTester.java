package com.classes.inheritance;

public class AnimalDogTester {

    public static void main(String[] args) {
        Animal animal = new Animal("Animal",1,1,5,50);
        Dog fido = new Dog("Fido",1,1,1,1,1,1,1,1,"Fur");
        fido.bark();
        fido.eat();
        System.out.println();
        fido.walk();
        System.out.println();
        fido.run();
        System.out.println();
        fido.move(5);

        Fish fish = new Fish("Ralph",1,1,1,10,2,2,2);
        fish.swim(10);
    }

}
