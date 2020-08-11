package com.codewithdelayne;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<List<Integer>> seqList = new ArrayList<>(2);

        /*Adding 3 to 0th row created above x(0, 0)*/
        seqList.get(0).add(0, 0);
        seqList.get(1).add(1, 1);


    }
}

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