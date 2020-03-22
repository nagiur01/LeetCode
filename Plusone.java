package com.nagiur;

public class Plusone {
    public static void main(String[] args) {
        int nums[] = {9,5,9};
        int nums1[] = plusOne(nums);

//        for (int i = 0; i < nums1.length; i++) {
           // System.out.print(nums1[i]);
        //      }
    }

    public static int[] plusOne(int[] digits) {
        int lastDigit = digits[digits.length - 1];
/*
        if (lastDigit == 9) {
            int newDigits[] = new int[digits.length + 1];
            for (int i = 0; i < digits.length - 1; i++) newDigits[i] = digits[i];
            newDigits[newDigits.length - 2] = 0;
            newDigits[newDigits.length - 1] = 0;
            return newDigits;
        }
*/
        if (lastDigit == 9){
            int sum = 0;
            for (int i = digits.length - 1, base = 1; i >= 0; i--, base = base * 10) {
                sum = sum + digits[i]*base;
                //System.out.println(i + " : " + digits[i] + " " + base);
            }

            sum++;
            System.out.println(sum);

            int newDigits[] = new int[digits.length + 1];

            for (int i = newDigits.length - 1; i >= 0 ; i--) {
                newDigits[i] = sum % 10;
                sum = sum / 10;
            }
            System.out.println();
            for (int j = 0; j < newDigits.length; j++) {
                System.out.print(newDigits[j]);
            }


           // return sum;
        }





        digits[digits.length - 1] = digits[digits.length - 1] + 1;
        return digits;
    }
}
