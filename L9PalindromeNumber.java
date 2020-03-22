package com.nagiur;

public class L9PalindromeNumber {
    public static void main(String[] args) {
        int n = Integer.MAX_VALUE + Integer.MAX_VALUE;
        System.out.println(isPalindrome(n));
    }

    public static boolean isPalindrome(int x) {
        int base = x;
        if (base < 0) return false;

        int rev = 0;
        while (base != 0){
            rev = rev * 10 + base % 10;
            base = base / 10;
        }

        if(rev > Integer.MAX_VALUE && rev < Integer.MIN_VALUE) return false;


        return rev == x;
    }
}
