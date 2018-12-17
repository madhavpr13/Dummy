package com.linkedlists;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {

    public static void main(String[] args) {

        LinkedList<String> words = new LinkedList<>();
        words.addLast("Scala");
        words.addLast("Java");
        words.addLast("Hi");
        words.addLast("Programming");
        words.addLast("Cup");
        words.addLast("Tea");
        System.out.println("Before removal, the list is " + words);
        ListIterator<String> wordIterator = words.listIterator();

        while(wordIterator.hasNext()) {
            String word = wordIterator.next();
            if(word.length() < 4) {
                wordIterator.remove();
            }
        }

        System.out.println("After removal, the list is " + words);
        System.out.println("Expected: [Scala, Java, Programming]");

        /*
        // R14.4
        LinkedList<String> staff = new LinkedList<>();
        staff.addFirst("Harry");
        staff.addFirst("Diana");
        staff.addFirst("Tom");
        System.out.println(staff.removeFirst());
        System.out.println(staff.removeFirst());
        System.out.println(staff.removeFirst());
        System.out.println(staff.isEmpty());
         */

        // R 14.7
        LinkedList<String> staff = new LinkedList<>();
        ListIterator<String> listIterator = staff.listIterator();
        System.out.println(listIterator.hasNext());
        listIterator.add("Tom");
        listIterator.add("Diana");
        listIterator.add("Harry");
        listIterator = staff.listIterator();
        if(listIterator.next().equals("Tom")) {
            listIterator.remove();
        }
        System.out.println("After removing Tom, staff is " + staff);
        while(listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }


    }
}
