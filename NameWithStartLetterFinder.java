package com.lesson1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class NameWithStartLetterFinder {

    public static void main(String[] args) {
     ArrayList<String> names = new ArrayList<>(Arrays.asList("Rhil", "Anny", "Richard", "Chris"));
     char letter = 'R';
     ArrayList<String> namesStartWithLetter = wordFinder(names, letter);
        System.out.println(namesStartWithLetter);
    }

    public static ArrayList<String> wordFinder(ArrayList<String> names, char letter){
        if (names.size()==0) throw new IllegalArgumentException("Incorrect data. List is empty.");
        ArrayList<String> namesWithLetter = new ArrayList<String>();
        for (String name:names){
            if (name.charAt(0)==letter)
                namesWithLetter.add(name);
        }
        return namesWithLetter;
    }
}
