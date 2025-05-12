package com.example.javainterview.leetcode;

public class FindingThreeDigitEvenNumbers {
    public static void main(String[] args) {
        int[] digits = {2, 1, 3, 0};
        int[] result = findEvenNumbers(digits);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
    public static int[] findEvenNumbers(int[] digits) {
    java.util.Set<Integer> result = new java.util.TreeSet<>();
    int[] count = new int[10];
    for (int d : digits) count[d]++;
    for (int i = 1; i <= 9; i++) {
        if (count[i] == 0) continue;
        count[i]--;
        for (int j = 0; j <= 9; j++) {
            if (count[j] == 0) continue;
            count[j]--;
            for (int k = 0; k <= 9; k += 2) {
                if (count[k] == 0) continue;
                result.add(i * 100 + j * 10 + k);
            }
            count[j]++;
        }
        count[i]++;
    }
    return result.stream().mapToInt(x -> x).toArray();
}
}
