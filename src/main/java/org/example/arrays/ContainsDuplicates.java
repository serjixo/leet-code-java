package org.example.arrays;

import java.util.HashSet;

public class ContainsDuplicates {

    /*
    Given an integer array nums, return true if any value appears at least twice in the array,
     and return false if every element is distinct.

        Example 1:

        Input: nums = [1,2,3,1]
        Output: true
        Example 2:

        Input: nums = [1,2,3,4]
        Output: false
        Example 3:

        Input: nums = [1,1,1,3,3,4,3,2,4,2]
        Output: true


        Constraints:

        1 <= nums.length <= 105
        -109 <= nums[i] <= 109
    */

    public static boolean containsDuplicates(int[] nums) {
        if(nums.length == 0 || nums == null){
            return false;
        }

        HashSet<Integer> duplicatesChecker = new HashSet<>();

        for(int num: nums){
            if(!duplicatesChecker.add(num)){
                return true;
            }
        }

        return false;

    }

    public static void executeContainsDuplicate() {
        int[] expectedInput = {1, 2, 3, 1};
        System.out.println(containsDuplicates(expectedInput));
    }

}
