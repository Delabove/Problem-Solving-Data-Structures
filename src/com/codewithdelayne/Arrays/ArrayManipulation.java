package com.codewithdelayne.Arrays;

public class ArrayManipulation {
    static long arrayManipulation(int n, int[][] queries) {


//        main list
        int queriesList = queries.length; //number of operations
//       rows of queries
        int[] q = new int[n];
        //each row


//        range
        int a = 1;
        int b = 1;
        int k = 100;


        //output
        long maxVal = 0;



        // FOR
        //loop through n
        for (int j = 1; j < q.length; j++) {
            //find a
           while(j >= a && a < b && b<= n){
               maxVal = j+k;
                j++;
           }

        }
        return maxVal;
    }

    public static void main(String[] args) {
//        arrayManipulation(10,1,5);
    }

}


               // set value

        //insert new value from a - b
        //loop through n
        //find b
        //add value of b to k
        //insert new value from b to length
        //loop through n one last time and find max value
        //return it









// Given: 1-indexed array(1234) of [0 0 0 0 0 0 ]
// list of operations( int[][] queries )
//
// for each operation add a value
// to each of the array elements  between a range -inclusive
//return the max value in the resulting array (ending array)

//    alg
//
//   operation happens
//    add value between
//


//params:
// n = NUMBER OF ELEMENTS IN ARRAY
// queries =  2D [] of queries:

    // **** each queries index contains 3 integers , a, b, and k


                                 // [1, 2, 3] [4,5,6]

//    input format

//LINE 1
//      int N:array.length (3 or more)    int M:# of Operations ( 1 or more)

// LINE 2
//INDEX:  1<= left-index: A <= right-index B inclusive  <= to N

// summand= K 0 and more

//    5   3 Opperations
//
//    1 2 100
//    2 5 100
//    3 4 100
//
//    200
//              0 0 0 0 0
// 1st update: 100 100 0 0 0
// 2nd update: 100 200 100 100 100
// 3rd update: 100 200 200 200 100
//
//
// ANSWER: 200









