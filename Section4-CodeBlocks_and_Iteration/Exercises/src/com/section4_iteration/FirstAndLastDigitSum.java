package com.section4_iteration;

public class FirstAndLastDigitSum {

    public static int firstAndLastDigitSum(int number) {

        if(number < 10)
            return number;

        int lastDigit = number % 10;
        int currLastDigit = lastDigit;
        while(number > 0) {
            currLastDigit = number % 10;
            number = number / 10;
        }

        return lastDigit + currLastDigit;

    }

    public static void main(String[] args) {
        System.out.println(firstAndLastDigitSum(187));

    }

}
