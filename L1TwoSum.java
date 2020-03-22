package com.nagiur;

import java.util.HashMap;
import java.util.Map;

public class L1TwoSum {

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int m[] = twoSum(nums,target);
        System.out.println(m[0]+ " "+ m[1]);
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int com = target - nums[i];
            if(map.containsKey(com) && map.get(com) != i){
                return new int[] {i, map.get(com)};
            }
        }

        throw new IllegalArgumentException("No two sum solution");
    }
}
