package com.edX.wordList_edX;


import java.util.Arrays;

public class WordListTester {

    public static void main(String[] args) {
        WordList w1 = new WordList();
        System.out.println("Adding the word " + "Oliver: " + w1.addWord("Oliver"));
        System.out.println("Adding the word " + "Queen: " + w1.addWord("Queen"));
        System.out.println("Adding the word " + "Barry: " + w1.addWord("Barry"));
        System.out.println("Adding the word " + "Barry: " + w1.addWord("Allen"));
        System.out.println(Arrays.toString(w1.getWords()));
        System.out.println("Current count: " + w1.getCount());
        System.out.println("Removing the word Queen");
        w1.removeWord("Queen");
        System.out.println("Current count: " + w1.getCount());
        System.out.println(Arrays.toString(w1.getWords()));


//
//        String[] words = w1.getWords();
//
//        for(String word: words) {
//            System.out.println(word);
//        }

    }

}
