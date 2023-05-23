package org.example.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class IntersectionMultiple {
    /*
    Given two integer arrays nums1 and nums2, return an array of their intersection.
     Each element in the result must appear as many times as it shows in both arrays
     and you may return the result in any order.

        Example 1:

        Input: nums1 = [1,2,2,1], nums2 = [2,2]
        Output: [2,2]
        Example 2:

        Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
        Output: [4,9]
        Explanation: [9,4] is also accepted.


        Constraints:

        1 <= nums1.length, nums2.length <= 1000
        0 <= nums1[i], nums2[i] <= 1000


Follow up:

What if the given array is already sorted? How would you optimize your algorithm?
What if nums1's size is small compared to nums2's size? Which algorithm is better?
What if elements of nums2 are stored on disk, and the memory is limited such that you cannot load all elements into the memory at once?
     */

    public static int[] intersectionMultiple(int[] firstArray, int[] secondArray) {

        HashMap<Integer, Integer> mapFromFirstArray = createAMapFromArrayCountigOccurencesOfElements(firstArray);
        HashMap<Integer, Integer> mapFromSecondArray = createAMapFromArrayCountigOccurencesOfElements(secondArray);

        List<Integer> intersection = new ArrayList<>();


        for (Integer key : mapFromSecondArray.keySet()) {
            if (mapFromFirstArray.containsKey(key)) {

                int numberOfTimesRepeatedOnBoth =
                        mapFromFirstArray.get(key) < mapFromSecondArray.get(key) ?
                        mapFromFirstArray.get(key) : mapFromSecondArray.get(key);

                for (int i = 0; i < numberOfTimesRepeatedOnBoth; i++) {
                    intersection.add(key);
                }

            }
        }
        return intersection.stream().mapToInt(Integer::intValue).toArray();


    }

    private static HashMap<Integer, Integer> createAMapFromArrayCountigOccurencesOfElements(int[] nums) {

        HashMap<Integer, Integer> elementsOfArray = new HashMap<>();

        for (Integer num : nums) {
            if (elementsOfArray.containsKey(num)) {
                elementsOfArray.put(num, elementsOfArray.get(num) + 1);
            } else {
                elementsOfArray.put(num, 1);
            }
        }

        return elementsOfArray;
    }

    public static void executeIntersectionMultiple() {
    }

}
