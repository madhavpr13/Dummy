package com.section4_iteration;

public class HasSharedDigit {

    public static boolean hasSharedDigit(int number1, int number2) {
        if(withinRange(number1) && withinRange(number2)) {
            String numberOneString = Integer.toString(number1);
            String numberTwoString = Integer.toString(number2);
            for(int i = 0; i < numberOneString.length(); i++) {
                for(int j = 0; j < numberTwoString.length(); j++) {
                    if(numberOneString.charAt(i) == numberTwoString.charAt(j)) {
                        return true;
                    }
                }
            }

        }
        return false;

    }

    private static boolean withinRange(int n) {
        return 10 <= n && n <= 99;
    }

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(1245, 2367));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));
    }
}
