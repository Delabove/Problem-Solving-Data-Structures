package com.codewithdelayne;

import java.util.Arrays;

public class SparseArrays {

//    / Complete the matchingStrings function below.
    static int[] matchingStrings(String[] strings, String[] queries) {

        // strings size
        int n= strings.length;
        //queries
        int q= queries.length;
//        counter for instances
        int count = 0;
        int [] results = new int[q];

            //dynamic
            if(results.length == count) {
                int[] newResults = new int[count + 1];
            }

//          loop through
            for( int i = 0; i < n; i++){
               if(strings[i].equals(queries[i])){
                    count = count + 1;
                   results[i]= count;
                   count++;
               }

            }

        return results;
    }


    public static void main(String[] args) {
        String[] strings = {"hello", "goodbye", "hi", "hola", "hello"};
        String[] queries = {"hey", "hola", "see ya", "goodbye"};
        System.out.println("String array: " + Arrays.toString(strings));
        System.out.println(" Query array: " + Arrays.toString(queries));

        matchingStrings(strings, queries);
    }
}
// COLLECTION["input", "input", "input"]
//// COLLECTION["query", "query", "query"]
// for each "query" DETERMINE # of times it occurs in ["input", "input", "input"]
//ASKING FOR: NUMBER OF TIMES A QUERY OCCURS IN LIST OF INPUTS

//EXAMPLE:

//for input strings: ['ab', 'ab', 'abc']
//and query strings: ['ab', 'abc', 'bc']
// 2 instances: 'ab'
//1 instance: 'abc'
//0 instances: 'bc'
//____________________________
// store instances in results array: [2,1,0]

//function description:
//complete the function matchingStrings



//>>>>> RETURN ARRAY OF INTEGERS REPRESENTING HOW MANY INSTANCES OF EACH QUERY<<<<<<<<<<<<<<

// loop through n ['ab', 'ab', 'abc'] to find n[i]== q[i]
//when we find 1, add to counter, then add count to end of result array
//restart loop for next count
//once length is reached return results array

//DATA NEEDED TO RUN FUNCTION:
// strings = int n= strings.length;
//LineN = n[i]
//queries= int q= queries.length;
//LineQ = q[i]

//parameters:
//strings -SEARCH
// queries

//SAMPLE OUTPUT
// 2
// 1
// 0

// ALGORITHM:
// to count instances:
//
// for(q : queries)
//
// count = count + 1
//result= count;
//reset counter


// DETERMINE # of times it occurs in ["input", "input", "input"]
