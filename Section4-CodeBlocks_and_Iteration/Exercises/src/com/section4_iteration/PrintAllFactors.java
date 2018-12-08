package com.section4_iteration;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

// Code Exercise 20- Print all factors of a given number
public class PrintAllFactors {

    public static ArrayList<Integer> getFactors(int number) {
        ArrayList<Integer> factorsList = new ArrayList<>();
        for(int i = 2; i < number; i++) {
            if(number % i == 0)
                factorsList.add(i);
        }

        return factorsList;
    }
    public static void main(String[] args) {

        System.out.println("We'll print the factors of a number as an ArrayList excluding 1 and the number itself");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int number = Math.abs(input.nextInt());
        ArrayList<Integer> factorsList = getFactors(number);
        System.out.println("The factors of " + number +  " excluding 1 and " + number + " are: " + factorsList);
        if(!factorsList.isEmpty()) {
            System.out.println("The largest factor of " + number +  " excluding 1 and " + number + " is: " + Collections.max(factorsList));
        } else {
            System.out.println("No factor found");
        }

    }
}
