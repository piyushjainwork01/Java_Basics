package com.java_basics.dsa_practice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DayOne {

    // contains duplicate

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for(int num : nums){
            if(!(seen.add(num))){
                return true;
            }
        }
        return false;
    }



    // Two Sum

/*Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.*/

    public int[] twoSum(int[] nums, int target) {

        Map<Integer,Integer> map = new HashMap<>();
        for(int i =0;i<nums.length;i++){
            int complement = target- nums[i];

            if(map.containsKey(complement)){
                return new int[]{map.get(complement),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{-1,-1};


    }

    /*A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.



Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.*/
    public boolean isPalindrome(String s) {

        int left = 0;
        int right = s.length()-1;

        while(left<right){
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            // Move the right pointer to the previous alphanumeric character
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }

            // Move both pointers inward
            left++;
            right--;
        }
        return true;
    }

    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> jewelSet = new HashSet<>();
        char[] jewelArray = jewels.toCharArray();
        for(char ch : jewelArray){
            jewelSet.add(ch);
        }

        // now fetching the chars in the stones whether they exist in the set or not if  exist then increase the count.

        int count =0;

        char[] stoneArray = stones.toCharArray();
        for(char c : stoneArray){
            if(jewelSet.contains(c))count++;
        }

        return count;


    }


    //  TODO : squares of sorted array

}
