package org.example;

public class Solution {

    public static void main(String[] args) {
        System.out.println(pigLatinize("Pig Latin"));
    }

    public static String pigLatinize(String phrase){
        String[] wordArray = phrase.split(" ");
        String pigLatinizedPhrase = "";
        for (String word: wordArray) {
            String pigLatinizedWord = "";
            int i = 1;
            Character firstCharacter = Character.toLowerCase(word.charAt(0));
            if(firstCharacter =='a' || firstCharacter=='e'|| firstCharacter=='i'|| firstCharacter=='o'|| firstCharacter=='u'){
                pigLatinizedWord += word + "way";
            }else{
                String consonantCluster = String.valueOf(word.charAt(0));
                Boolean vowelFound = false;

                while(!vowelFound){
                    Character characterAtPosition = Character.toLowerCase(word.charAt(i));
                    if(characterAtPosition=='a' || characterAtPosition=='e'|| characterAtPosition=='i'|| characterAtPosition=='o'|| characterAtPosition=='u'){
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
