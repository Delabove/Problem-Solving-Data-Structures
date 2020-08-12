package com.codewithdelayne.Arrays;

import java.util.Arrays;

public class LeftRotation {
    //input:
    // int[]
    // int d= # of rotations
    public static void rotateLeft(int[] a, int d) {

        int[] rotated = rotate(a, d);
        for (int i = 0; i < rotated.length; i++) {
            if (i != 0) {
                System.out.print(" ");
            }
            System.out.print(rotated[i]);
        }
        System.out.println();
    }
    static int[] rotate(int[] a, int d) {
        int[] rotated = new int[a.length];
        for (int i = 0; i < rotated.length; i++) {
            rotated[i] = a[(i + d) % a.length];
        }
        return rotated;
    }

    public static void main(String[] args) {
       int[] a = {1, 2, 3, 4, 5};

        System.out.println("Original: " + Arrays.toString(a));
        System.out.println("Rotated: "); rotateLeft(a, 2);


    }


}
