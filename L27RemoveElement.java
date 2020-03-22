package com.nagiur;

public class L27RemoveElement {
    public static void main(String[] args) {
        //int[] nums = {2,1,2,2,3,7,4,2};
        //int[] nums = {0,1,2,2,3,0,4,2};
        int[] nums = {1,3,2,2,5,6,7,9,2,2};
        int val = 2;

        System.out.println("\nR : " + removeElementSwap(nums, val));
    }

    public static int removeElement(int[] nums, int val) {
        if(nums.length == 0) return 0;

        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val){
                nums[i] = nums[j];
                i++;
            }
        }

        return i;
    }

    public static int removeElementSwap(int[] nums, int val){
        if(nums.length == 0) return 0;

        for (int j = 0; j < nums.length; j++) {
            System.out.print(nums[j] + " ");
        }
        System.out.println();
        System.out.println();

        int i = 0, temp = 0;
        for (int j = nums.length - 1; j != i; i++) {
            if (nums[i] == val ){
                temp    = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j--;
            }
            System.out.println(i + " " + j);
        }

        System.out.println();
        for (int j = 0; j < nums.length; j++) {
            System.out.print(nums[j] + " ");
        }

        return i;
    }

}
