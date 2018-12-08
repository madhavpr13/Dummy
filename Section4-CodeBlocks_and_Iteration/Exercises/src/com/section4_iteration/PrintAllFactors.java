package com.section4_iteration;
import java.util.ArrayList;
import java.util.Scanner;

// Code Exercise 20- Print all factors of a given number
public class PrintAllFactors {

    public static ArrayList<Integer> getFactors(int number) {
        ArrayList<Integer> factorsList = new ArrayList<>();
        for(int i = 1; i <= number; i++) {
            if(number % i == 0)
                factorsList.add(i);
        }

        return factorsList;
    }
    public static void main(String[] args) {

        System.out.println("We'll print the factors of a number as an ArrayList");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int number = Math.abs(input.nextInt());
        ArrayList<Integer> factorsList = getFactors(number);
        System.out.println("The factors of " + number + " are: " + factorsList);

    }
}
