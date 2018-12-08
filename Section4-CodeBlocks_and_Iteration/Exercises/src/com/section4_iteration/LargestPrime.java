package com.section4_iteration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class LargestPrime {

    private static int getFirstFactor(int number) {

        int n = 2;
        while (n <= number) {
            if (number % n == 0) {
                return n;
            }
            n = n + 1;
        }
        return number;
    }


    public static void main(String[] args) {
        ArrayList<Integer> primeFactors = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();
        int initialNumber = number;
        while(number > 1) {
            int first = getFirstFactor(number);
            primeFactors.add(first);
            number /= first;
        }
        System.out.println("Largest prime factor of " +  initialNumber + " is: " + Collections.max(primeFactors));
    }

}