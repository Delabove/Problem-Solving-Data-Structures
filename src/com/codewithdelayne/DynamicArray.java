package com.codewithdelayne;

import java.util.ArrayList;
import java.util.List;



public class DynamicArray {


    private static List<List<Integer>> seqList;

    public static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
        List<Integer> result = new ArrayList<>();
        int lastAnswer = 0;

        for (int i = 0; i <= n; i++) {
            seqList.add(new ArrayList<>());

        }


        for (List<Integer> q : queries) {
            if (q.get(0) == 1) {
                seqList.get((q.get(1) ^ lastAnswer) % n).add(q.get(2));

            } else {
                List<Integer> seq = seqList.get((q.get(1) ^ lastAnswer) % n);
                lastAnswer = seq.get(q.get(2) % seq.size());
                result.add(lastAnswer);
            }
        }
        return result;
    }
}


//Q1
//CREATE LIST OF INTEGERS
//FIND SEQ[0] INDEX
// CHECK TO SEE IF INDEX(X) || LAST ANSWER
//  IF INDEX == 0 && LASTANSWER ==0 THEN Y == 0;

//APPEND Y TO END OF THAT ELEMEMNT;
//    .add to element array


//Q2
//FIND SEQ[1] INDEX[X] OR LASTANSWER
//FIND VALUE OF ELEMENT Y%SIZE AND ASSIGN IT TO LAST ANSWER;
//PRINT VALUE OF LAST ANSWER ON A NEW LINE

//   INPUT  L.ANSW
//    (NQ)     7
//     25      3
//
//   (QXY)
//   Q1 105
//   Q2 117
//   Q1 103
//   Q2 210
//   Q1 211