package com.section4_iteration;
import java.util.Scanner;

public class NumberPalindrome {

    public static boolean isPalindrome(String s) {

    return isPalindromeHelper(s, 0, s.length()-1);
    }

    public static boolean isPalindromeHelper(String s, int from, int to) {

    if(from > to) {
        return true;
    }
    else if(s.charAt(from) != s.charAt(to)) {
        return false;
    }
    else return isPalindromeHelper(s, from+1, to-1);

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        String numberString = Integer.toString(number);
        System.out.println(numberString + " is a palindrome? " + isPalindrome(numberString));
    }
}

