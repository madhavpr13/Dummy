package com.section4_iteration;

import java.util.ArrayList;

public class PrimeFactors {


    public static void printPrimeFactors(int number) {
        //assert(number > 1);
        if(number == 1) return;

        int n = 2;
        if(number % n == 0) {
            System.out.println("Found: "  + n);
            printPrimeFactors(number / n);
        } else {
            int firstIntDivides = firstIntegerDivides(number);
            System.out.println("Found: " + firstIntDivides);
            printPrimeFactors(number / firstIntDivides);
        }
        //number = number / n;
        //printPrimeFactors(number);
    }

    private static int firstIntegerDivides(int number) {
        for (int i = 2; i < number; i++) {
            if(number % i == 0)
                return i;

        }
        return number;
    }

    public static void main(String[] args) {
        printPrimeFactors(14);
    }
}
