package com.section3.exercises;
import java.util.Scanner;

public class DecimalComparator {

    public static void main(String[] args ) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double number1 = input.nextDouble();
        System.out.print("Enter the second number: ");
        double number2 = input.nextDouble();

        System.out.println(AreEqualAfterThreeDecimals(number1, number2));


    }

    public static boolean AreEqualAfterThreeDecimals(double number1, double number2) {

        String numberOneString = Double.toString(number1);
        int indexOfDecimalPoint = numberOneString.indexOf(".");
        String resultOneSubstring = numberOneString.substring(0, indexOfDecimalPoint + 4);

        String numberTwoString = Double.toString(number2);
        indexOfDecimalPoint = numberTwoString.indexOf(".");
        String resultTwoSubstring = numberTwoString.substring(0, indexOfDecimalPoint + 4);

        return resultOneSubstring.equals(resultTwoSubstring);


    }





}
