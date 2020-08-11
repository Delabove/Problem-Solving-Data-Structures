package com.codewithdelayne;

import java.util.ArrayList;
import java.util.List;



public class DynamicArray {


    public static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
        List<List<Integer>> seqList = new ArrayList<>();
        List<Integer> seq =new ArrayList<Integer>();

        int lastAnswer = 0;

        for (int i = 0; i <= n; i++) {
            seq= new ArrayList<Integer>();
            seqList.add(new ArrayList<Integer>());

        }

        List<Integer> updateAnswer = new ArrayList<>();

        for (List<Integer> q : queries) {

            int index;
            int size=0;
            int queryType= q.get(0);
            int x = q.get(1);
            int y = q.get(2);

            if (queryType == 1) {
                index = (x^lastAnswer)%n;
                seqList.get(index).add(y);

            }
            if(queryType == 2){
                index = (x ^ lastAnswer) % n;
                size=seqList.get(index).size();
                lastAnswer= seqList.get(index).get(y % size);
                updateAnswer.add(lastAnswer);
            }
        }
        return updateAnswer;
    }

}



//Q1
//CREATE LIST OF INTEGERS
//FIND SEQ[0] INDEX
// CHECK TO SEE IF INDEX(X) || LAST ANSWER
//  IF INDEX == 0 && LAST ANSWER ==0 THEN Y == 0;

//APPEND Y TO END OF THAT ELEMEMNT;
//    .add to element array


//Q2
//FIND SEQ[1] INDEX[X] OR LAST ANSWER
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