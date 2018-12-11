package com.edX.wordList_edX;

import java.util.Arrays;

public class WordList {

    private String[] words;
    private int count;

    public WordList() {
        words = new String[] {"",""};
        count = 0;
    }

    public String[] getWords() {
        return words;
    }

    public int getCount() {
        return count;
    }



    public int addWord(String wordToAdd) {
        // case1. Word already exists in the word list
        int potentialIndex = getIndexOfWord(wordToAdd);
        if (potentialIndex >= 0) {
            System.out.println("The word " + wordToAdd + " already exists in the wordlist. Returning the original count");
            return this.count;
        }

        // case 2a. The word does not exist and the array isn't filled
        if(words.length <= 2 && words[0].equalsIgnoreCase("")) {
            words[0] = wordToAdd;
            this.count += 1;
            return count;
        }

        else if(words.length <= 2 && words[1].equals("")) {
            words[1] = wordToAdd;
            this.count += 1;
            return count;
        }

        else {  //(words.length > 2) {
            String[] newWordArray = Arrays.copyOf(words, 1 + words.length);
            newWordArray[words.length] = wordToAdd;
            this.words = getNonNullArray(newWordArray);
            this.count = words.length;
            return this.count;
        }

    }

    public void removeWord(String theWord) {
        if( !wordExists(theWord)) {
            System.out.println("The word " + theWord + " does not exist in the word list.");
        } else {
            int removeIndex = getIndexOfWord(theWord);
            for(int i = removeIndex; i < words.length - 1; i++) {
                words[i] = words[i+1];
            }
        }

        this.count -= 1;

    }

    private String[] getNonNullArray(String[] array) {
        String[] returnedArray = array;
        for(int i = 0; i < array.length; i++) {
            if(array[i] != null) {
                returnedArray[i] = array[i];
            }
        }

        return returnedArray;
    }
    public int getIndexOfWord(String word) {
        for(int i = 0; i < words.length; i++) {
            if(word.equalsIgnoreCase(words[i]))
                return i;
        }

        return -1;
    }
    public boolean wordExists(String searchWord) {

        return (getIndexOfWord(searchWord) >= 0 ) ? true : false ;
    }

}
