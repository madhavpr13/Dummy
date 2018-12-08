package com.section4_iteration;


public class FirstThousandPrimes {

    public static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void printPrimes(int limit) {
        int numPrimes = 0;
        int start = 2;

        while(numPrimes < limit) {
            if (isPrime(start)) {
                System.out.println(start + " is prime.");
                numPrimes += 1;
            }

            start += 1;


        }
    }
    public static void main(String[] args) {
        //System.out.println(isPrime(4));
        printPrimes(1000);

    }



}


