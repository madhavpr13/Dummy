package com.arrays;
import java.util.Arrays;
import java.util.Scanner;

public class MinElement {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Get count (length of the array)
        System.out.print("Enter the length of the array: ");
        int arrayLength = input.nextInt();
        int[] array = buildArray(arrayLength);
        System.out.println("The array is: " + Arrays.toString(array));

        int minimumElement = minElement(array);
        System.out.println("The minimum element is " + minimumElement);



    }

    public static int[] buildArray(int count) {
        int[] intArray = new int[count];
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < count; i++) {
            System.out.print("Enter element #" + i + ": ");
            intArray[i] = input.nextInt();
        }

        return intArray;
    }

    public static int minElement(int[] intArray) {
        int minElement = intArray[0];
        for(int  i = 1; i < intArray.length; i++) {
                if(intArray[i] < minElement)
                    minElement = intArray[i];
        }

        return minElement;
    }

}
