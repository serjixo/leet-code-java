package org.example.arrays;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/*
* 1 <= nums.length <= 3 * 104
-100 <= nums[i] <= 100
nums is sorted in non-decreasing order.
* */
public class RemoveDuplicates {

    // return k, counter
    // modify int
    // less efficient in terms of memory but increased readability and implementation.

    private static int removeDuplicates(int[] nums) {

        int counter = 0;

        Set<Integer> seenValues = new HashSet<>();

        for(int num: nums){
            if (!seenValues.contains(num)) {
                seenValues.add(num);
                nums[counter] = num;
                counter++;
            }
        }

        return counter;
    }

    public static void executeRemoveDuplicates() {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4}; // Input array
        int[] expectedNums = {0, 1, 2, 3, 4}; // The expected answer with correct length

        int k = removeDuplicates(nums); // Calls your implementation

        System.out.println(k);
        assert k == expectedNums.length;
        for (int i = 0; i < k; i++) {
            assert nums[i] == expectedNums[i];
        }
    }
}
