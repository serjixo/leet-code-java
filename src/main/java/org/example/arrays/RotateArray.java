package org.example.arrays;

public class RotateArray {


    private static void swapElement(int[] nums, int position) {
        int lastElement = nums[nums.length - 1];
        int ElementSubstituted = nums[position];
        nums[position] = lastElement;
        for (int i = nums.length; i > position - 1; i--) {
            nums[i] = nums[i - 1];
        }
    }

    private static void rotateArray(int[] nums, int steps) {
        if (steps < 0) {
            throw new RuntimeException("Not valid steps input");
        }


        if (nums.length > 1 && steps >= nums.length) {
            steps %= nums.length;
        }

        if (nums.length > 1 && steps < nums.length) {
            if (steps == 0) {
                return;
            }
        }

        if (nums.length > 1 && steps < nums.length) {
            int[] result = new int[nums.length];

            for (int i = 0; i < steps; i++) {
                result[steps - 1 - i] = nums[nums.length - 1 - i];
            }

            int indexNums = 0;

            for (int i = steps; i < result.length; i++) {
                result[i] = nums[indexNums];
                indexNums++;
            }

            int index = 0;
            for (int number : result) {
                nums[index] = number;
                index++;
            }
        }
    }

    public static void executeRotateArray() {
        int[] expectedinput = {1, 2, 3, 4, 5, 6, 7};
        int[] expectedOutput = {5, 6, 7, 1, 2, 3, 4};
        int steps = 3;

        rotateArray(expectedinput, steps);
//        System.out.println(Arrays.toString(result));
    }

}
