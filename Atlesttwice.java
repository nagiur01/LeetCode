package com.nagiur;

public class Atlesttwice {
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4};
        System.out.println(twice(nums));

    }

    public static int twice(int nums[]){

        int max = 0, maxIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] > nums[maxIndex])
                maxIndex = i;
        }

        for (int i = 0; i < nums.length; i++) {
            if(maxIndex != i && nums[maxIndex] < nums[i]*2) return -1;

        }
        return maxIndex;
    }

// 2,147,483,647
}
