package com.sets;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SpellCheck {

    public static void main(String[] args) throws FileNotFoundException {

        String filePath = "/Users/madhavr/udemy_courses/java-tim_buchalka/Section7-Arrays_ArrayLists_Lists_Autoboxing_Unboxing/src/com/sets/";
        Set<String> dictionaryWords = readWords(filePath + "words.txt"); // absolute path
        Set<String> aliceInWonderlandSet = readWords(filePath + "alice_in_wonderland.txt");
        System.out.println("Size of dictionaryWords: " + dictionaryWords.size() + " words");
        System.out.println("Size of aliceInWonderland set: " + aliceInWonderlandSet.size() + " words");

        // Print all words that are in the document but not in the dictionary
        for(String word: aliceInWonderlandSet) {
            if(!dictionaryWords.contains(word)) {
                System.out.println(word);
            }
        }
    }

    public static Set<String> readWords(String filename) throws FileNotFoundException {

        Set<String> words = new HashSet<>();
        Scanner in = new Scanner(new File(filename));
        in.useDelimiter("[^a-zA-Z]+");
        while(in.hasNext()) {
            words.add(in.next().toLowerCase());
        }

        return words;
    }

}
