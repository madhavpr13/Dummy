package com.edX;
import java.util.Arrays;

public class Dummy {
    public static void main(String[] args) {
        int[] arrInt = new int[10];
        for(int i = 0; i < arrInt.length; i++) {
            arrInt[i] = i + 1;
        }

        int[] newArr = Arrays.copyOf(arrInt, 2*arrInt.length);
        for(int a: newArr) {
            System.out.println(a);
        }
    }
}
