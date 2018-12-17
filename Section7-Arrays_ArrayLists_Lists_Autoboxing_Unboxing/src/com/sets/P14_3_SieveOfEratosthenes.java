package com.sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class P14_3_SieveOfEratosthenes  {

    public static void main(String[] args) {
        int number = 458;
        // want all primes up to 45 starting from 2

        Set<Integer> primes = sieve(number);
        System.out.println(primes);

    }

    public static Set<Integer> sieve(int number) {
        Set<Integer> primes = new HashSet<>();
        for(int i = 2; i <= number; i++) {
            primes.add(i);
        }

        for(int mul = 2; mul <= (int)Math.sqrt(number); mul++) {
            int start = 2 * mul;
            while(start <= number) {
                if(start % mul == 0)
                    primes.remove(start);
                start += 1;
            }
        }

        return primes;
    }
}


