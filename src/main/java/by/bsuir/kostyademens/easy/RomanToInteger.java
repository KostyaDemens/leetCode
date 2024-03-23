package by.bsuir.kostyademens.easy;

import java.util.HashMap;

/*
Given a roman numeral, convert it to an integer.
 */

public class RomanToInteger {
    public static int romanToInt(String s) {
        HashMap<String, Integer> romanLetters = new HashMap<>();
        romanLetters.put("I", 1);
        romanLetters.put("V", 5);
        romanLetters.put("X", 10);
        romanLetters.put("L", 50);
        romanLetters.put("C", 100);
        romanLetters.put("D", 500);
        romanLetters.put("M", 1000);

        int sum = 0;


        for (int i = s.length() - 1; i >= 0; i--) {
            String key = String.valueOf(s.charAt(i));

            if (i < s.length() - 1) {
                if (romanLetters.get(key) < romanLetters.get(String.valueOf(s.charAt(i + 1))) && i < s.length() + 1) {
                    sum -= romanLetters.get(key);
                } else {
                    sum += romanLetters.get(key);
                }
            } else {
                sum += romanLetters.get(key);
            }
        }
        return sum;

    }
}
