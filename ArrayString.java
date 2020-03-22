package com.nagiur;

public class ArrayString {
    public static void main(String[] args) {
        int num[][] = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int l[] = diagonalTraverse(num);

        System.out.println(l);
    }

    public static int[] diagonalTraverse(int[][] matrix ){
        int num[] = new int[matrix.length+matrix[0].length];

        int i, j, k;
        for (i = 0; i < 3; i++) {
            j = i + 1;
            for ( ; j >= 0; j--) {
                System.out.println(matrix[i][j]);
            }

        }

        return num;
    }


}
