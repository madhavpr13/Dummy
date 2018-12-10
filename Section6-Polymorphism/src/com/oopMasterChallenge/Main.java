package com.oopMasterChallenge;

public class Main {

    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic", 3.56, "Multigrain", "Sausage");
        hamburger.addHamburgerAddition1("Tomato", 0.27);
        hamburger.addHamburgerAddition2("Capsicum", 0.45);
        hamburger.addHamburgerAddition3("Onion", 0.30);
        hamburger.addHamburgerAddition4("Cheese", 0.10);

        System.out.println(hamburger.itemizeHamburger());


    }


}


