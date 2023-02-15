package org.example;

public class Solution {

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static String pigLatinize(String phrase){
        String[] wordArray = phrase.split(" ");
        String pigLatinizedPhrase = "";
        for (String word: wordArray) {
            String pigLatinizedWord = "";
            if(word.charAt(0)=='a' || word.charAt(0)=='e'|| word.charAt(0)=='i'|| word.charAt(0)=='o'|| word.charAt(0)=='u'){
                pigLatinizedWord += word + "way";
            }else{

            }
            pigLatinizedPhrase += pigLatinizedWord;
        }
    }
}
