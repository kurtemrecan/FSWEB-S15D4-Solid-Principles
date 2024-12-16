package org.example;


import javax.sound.sampled.Line;
import java.util.LinkedList;
import java.util.Locale;

public class Main {

    public static void main(String[] args){
    WorkintechList workintechList = new WorkintechList();
        workintechList.add("Emre");
        workintechList.add("Büşra");
        workintechList.add("Kerem");
        workintechList.add("EBRU");
        System.out.println(workintechList);
        System.out.println("--------------------------------");
        System.out.println(convertDecimalToBinary(500));
    }

    public static boolean checkForPalindrome(String text){
        if(text == null || text.isEmpty()){
            return false;
        }

        String cleanedStr = text.replaceAll("[^a-zA-Z0-9]","").toLowerCase(Locale.ROOT);
        LinkedList<Character> charList = new LinkedList<>();

        for(char c: cleanedStr.toCharArray()){
            charList.add(c);
        }

        while(charList.size()>1){
            if(!charList.pollFirst().equals(charList.pollLast())){
                return false;
            }
        }
        return true;
    }

    public static String convertDecimalToBinary(int decimal){
        LinkedList<Integer> binaryList = new LinkedList<>();
        while(decimal > 0){
            int remainder = decimal % 2;
            binaryList.addFirst(remainder);
            decimal = decimal / 2;
        }

        StringBuilder binaryString = new StringBuilder();
        for ( int digit: binaryList){
            binaryString.append(digit);
        }
        return binaryString.toString();

    }

}