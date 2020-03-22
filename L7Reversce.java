package com.nagiur;

public class L7Reversce {
    public static void main(String[] args) {
        int n = -21474836;
        System.out.println(reverse(n));
    }
    public static int reverse(int x) {
        int  rev = 0;

        while (x != 0){
            int pop = x % 10;
            x = x / 10;
            rev = rev * 10 + pop;

            if(rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) return 0;

            System.out.println(rev + " : " + pop + " : " + x);
        }

        return rev;
    }
}
