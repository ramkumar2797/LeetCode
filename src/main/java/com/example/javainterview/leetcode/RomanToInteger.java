package com.example.javainterview.leetcode;

import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args) {
        romanToInt("XIV");
    }
    public static int romanToInt(String s) {
        Map<Character, Integer> romanMap = Map.of(
                'I', 1,
                'V', 5,
                'X', 10,
                'L', 50,
                'C', 100,
                'D', 500,
                'M', 1000
        );

        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            int current = romanMap.get(s.charAt(i));
            int next = (i + 1 < s.length()) ? romanMap.get(s.charAt(i + 1)) : 0;

            if (current < next) {
                result -= current;
            } else {
                result += current;
            }
        }
       // System.out.println("result = " + result);
        return result;
    }
}
