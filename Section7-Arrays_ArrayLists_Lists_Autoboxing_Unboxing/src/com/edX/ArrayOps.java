package com.edX;

import java.util.Arrays;

public class ArrayOps {

    public static void main(String[] args) {
        String[] words = {"File", "Edit", "View", "Navigate", "Code", "Analyze", "Refactor"};

        String[] newArray = addWord(words, "Edit");
        newArray = removeWord(newArray, "Help");

        for(int i=0; i < newArray.length && newArray[i] != null ; i++) {
            System.out.print(newArray[i] + " ");
        }
    }

    public static String[] addWord(String[] wordList, String wordToAdd) {

        if(wordExists(wordList, wordToAdd)) {
            return wordList;
        }
        else if(wordList.length >= 2) {
            String[] newArray = Arrays.copyOf(wordList, wordList.length * 2);
            newArray[wordList.length] = wordToAdd;
            return newArray;
        }
        else  // wordList hasn't filled up; there's still space for one more element
        {
            String[] newArray = Arrays.copyOf(wordList, wordList.length * 2);
            newArray[1] = wordToAdd;
            return newArray;
        }
    }


    public static String[] removeWord(String[] wordList, String wordToRemove) {
        if(wordExists(wordList,wordToRemove)) {
            // remove the word only if it exists in the wordList
            // 1. get index of the word to remove
            //2. remove it (shift elements up)

            int removeIndex = getIndex(wordToRemove, wordList);
            for(int i = removeIndex; i < wordList.length - 1; i++) {
                wordList[i] = wordList[i+1];
            }
            wordList[wordList.length - 1] = null;
        }
        else {
            System.out.println("Word " + wordToRemove + " not found");
        }
        return wordList;
    }

    private static int getIndex(String word, String[] wordList) {
        for(int i = 0; i < wordList.length; i++) {
            if(wordList[i].equalsIgnoreCase(word))
                return i;
        }
        return -1;
    }

    private static boolean wordExists(String[] wordList, String searchWord) {
        for(String word : wordList) {
            if(word.equalsIgnoreCase(searchWord))
                return true;
        }
        return false;
    }


}
