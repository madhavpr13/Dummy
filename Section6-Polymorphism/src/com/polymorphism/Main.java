package com.polymorphism;

class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String plot() {
        return "No plot here...";
    }
}

class Jaws extends Movie {
    public Jaws(){
        super("Jaws");
    }

    public String plot(){

        return "A shark eats lots of people";

    }

}

class IndependenceDay extends Movie {

    public IndependenceDay() {
        super("Independence Day");
    }

    @Override
    public String plot() {
        return "Aliens attempt to take over the Earth";
    }
}

class MazeRunner extends Movie{

    public MazeRunner() {
        super("Maze Runner");
    }

    @Override
    public String plot() {
        return "Kids try and escape a maze";
    }
}


class StarWars extends Movie {

    public StarWars() {
        super("Star Wars");
    }

    @Override
    public String plot() {
        return "Imperial forces try and take over the universe";
    }
}

class ForgettableMovie extends Movie {
    public ForgettableMovie() {
        super("Forgettable Movie");
    }
}


public class Main {

    public static void main(String[] args) {

        for(int i = 1; i <= 10; i++) {
            Movie movie = randomMovie();
            System.out.println("Movie #" + i + ":" + movie.getName());
            System.out.println("Plot:" + movie.plot()); // this is the polymorphism part
            System.out.println();
        }

    }


    public static Movie randomMovie() {
        int randomNumber = (int)(1 + Math.random() * 5);
        System.out.println("Random number generated was " + randomNumber);
        switch(randomNumber) {
            case 1:
                return new Jaws();

            case 2:
                return new IndependenceDay();
            case 3:
                return new MazeRunner();
            case 4:
                return new StarWars();
            case 5:
                return new ForgettableMovie();

        }

        return null; // handle the default case!!

    }
}
