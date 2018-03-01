package com.lesson1;

import java.util.ArrayList;
import java.util.Arrays;

public class LongestNameFinder {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Phil", "Anny", "Richard", "Chris"));
        System.out.println("Longest name ---> "+longestName(names));
    }

    public static String longestName(ArrayList<String> names){
        if (names.size()==0) throw new IllegalArgumentException("Incorrect data. List is empty.");
        String result = "";
        for (String currentName: names) {
            if (currentName.length()>result.length()) {
                result=currentName;
            }
        }
        return result;
    }
}
