package LeetCode.Coding.Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*

Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.



Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

*/
public class TwoSum {

    public static void main(String[] agrs) {

        int[] nums = {2, 7, 11, 15};
        int target = 9;


        int[] index = twoSum(nums, target);
        System.out.println("index : " + Arrays.toString(index));
    }

    public static int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> sumMap = new HashMap();

        for (int i = 0; i < nums.length; i++) {
            int remainder = target - nums[i];
            if (sumMap.containsKey(remainder)) {
                return new int[]{sumMap.get(remainder), i};


            }
            sumMap.put(nums[i], i);
        }
        return null;

    }

}

