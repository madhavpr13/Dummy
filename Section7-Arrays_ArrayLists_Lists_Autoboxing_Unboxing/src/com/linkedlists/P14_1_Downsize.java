package com.linkedlists;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;

public class P14_1_Downsize {

    public static void main(String[] args) {
        String[] employees = {"Harry", "Sally", "Tom", "Melvin", "Amanda", "Bob", "Cathy", "Darwin", "Elaine", "Foggy"};
        LinkedList<String> employeeNames = new LinkedList(Arrays.asList(employees));
        System.out.println("Employees: " + employeeNames);

        downsize(employeeNames, 1);

    }

    public static void downsize(LinkedList<String> employeeNames, int n) {
        ListIterator<String> listIterator = employeeNames.listIterator();
        int remaining = employeeNames.size();
        System.out.println("Remaining elements is " + remaining);
        while (listIterator.hasNext() && remaining >= n) {
            int index = 0;
            while (index < n) {
                listIterator.next();
                index += 1;
            }
            remaining = remaining - n;
            System.out.println("remaining elements is " + remaining);
            //System.out.println("Removing...");
            listIterator.remove();
            System.out.println(employeeNames);
        }
        //}

    }
}


