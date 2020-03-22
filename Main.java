package com.nagiur;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
       int[] nums = {2, 7, 11, 15};
       int target = 9;

       int[] a = twoSum2(nums, target);
       System.out.print(a[0] +" "+a[1]);
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if(map.containsKey(complement) && map.get(complement) != i) {
                return new int[]{i, map.get(complement)};
            }
        }

        throw new IllegalArgumentException("No two sum solution");
    }

    public static int[] twoSum2(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            if(nums[i] + nums[i+1] == target){

                return new int[] {i, i+1};
            }
        }

        throw new IllegalArgumentException("No two sum solution");
    }
}