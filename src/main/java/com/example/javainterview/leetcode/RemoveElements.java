package com.example.javainterview.leetcode;

public class RemoveElements {
    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        removeElement(nums,3);
    }
        public static void removeElement(int[] nums, int val) {
            int k = 0;

            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != val) {
                    nums[k] = nums[i];
                    k++;
                }
            }
        System.out.println(k);
        }
}
