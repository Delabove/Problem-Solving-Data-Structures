package com.codewithdelayne;

public class LeftRotation {
    //input:
    // int[]
    // int d= # of rotations
    public int rotateLeft(int[] numbers, int d){

        int rotatedArr = numbers[0];

       for( int i = 0; i < d; i++){
           numbers[i] = numbers[i + 1];
       }


    }






}
