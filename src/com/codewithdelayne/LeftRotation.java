package com.codewithdelayne;

public class LeftRotation {
    //input:
    // int[]
    // int d= # of rotations
    public int[] rotateLeft(int[] a, int d){

    int n = a.length;
    int[] rotatedArray= new int[n];

    for(int i = 0; i < a.length-1; i++){
        a[i] = a[n - 1];
    }
        return a;
    }






}
