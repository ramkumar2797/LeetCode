package com.example.javainterview.leetcode;

import java.util.stream.IntStream;

public class ReverseInteger {
 public static int reverse(int x) {
     boolean isNegative = x < 0;
     String value = Integer.toString(x);
     String str = isNegative ? value.substring(1) : value;
     String reversedStr = IntStream.range(0, str.length())
             .mapToObj(i -> str.charAt(str.length() - 1 - i)) // Reverse characters
             .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
             .toString();

     try {
         int reversedInt = Integer.parseInt(reversedStr);
         return isNegative ? -reversedInt : reversedInt;
     } catch (NumberFormatException e) {
         return 0; // Handle overflow cases
     }

 }


    public static void main(String[] args) {
        System.out.println(reverse(123)); // Outputs 321
        System.out.println(reverse(-456)); // Outputs -654
        System.out.println(reverse(1534236469)); // Outputs 0 (overflow case)
    }
}
