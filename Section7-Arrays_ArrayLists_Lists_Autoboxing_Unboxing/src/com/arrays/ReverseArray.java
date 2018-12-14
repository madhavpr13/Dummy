package com.arrays;

import java.sql.SQLOutput;
import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {
        int[] intArray = {5,6,2,3,8,9,0,1,4,2};
        System.out.println("Array = " + Arrays.toString(intArray));
        reverseArray(intArray);
        System.out.println("Reversed Array = " + Arrays.toString(intArray));

    }

    public static void reverseArray(int[] array) {
        int maxLength = array.length - 1;
        int halfLength = array.length / 2;
        for(int i = 0; i < halfLength; i++) {
            int temp = array[i];
            array[i] = array[maxLength - i];
            array[maxLength - i] = temp;

        }

    }

}
