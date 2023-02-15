package org.example;

public class Solution {

    public static void main(String[] args) {
        System.out.println(pigLatinize("pig latin"));
    }

    public static String pigLatinize(String phrase){
        String[] wordArray = phrase.split(" ");
        String pigLatinizedPhrase = "";
        for (String word: wordArray) {
            String pigLatinizedWord = "";
            int i = 1;
            if(word.charAt(0)=='a' || word.charAt(0)=='e'|| word.charAt(0)=='i'|| word.charAt(0)=='o'|| word.charAt(0)=='u'){
                pigLatinizedWord += word + "way";
            }else{
                String consonantCluster = String.valueOf(word.charAt(0));
                Boolean vowelFound = false;

                while(!vowelFound){
                    if(word.charAt(i)=='a' || word.charAt(i)=='e'|| word.charAt(i)=='i'|| word.charAt(i)=='o'|| word.charAt(i)=='u'){
                        vowelFound = true;
                    }else{
                        consonantCluster += String.valueOf(word.charAt(i));
                        i++;
                    }
                }
                pigLatinizedWord = word.substring(i) + '-' + consonantCluster + "ay";

            }
            pigLatinizedPhrase += pigLatinizedWord;

            pigLatinizedPhrase+= " ";
        }
        return  pigLatinizedPhrase;
    }
}
