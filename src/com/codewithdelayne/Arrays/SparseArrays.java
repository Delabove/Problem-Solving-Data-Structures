package com.codewithdelayne.Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class SparseArrays {


        static int[] matchingStrings(String[] strings, String[] queries) {
            Map<String, Integer> map = new HashMap<>();
            int result[] = new int[queries.length];

            for (int i = 0; i < strings.length; i++) {
                String inputString = strings[i];
                if (map.containsKey(inputString)) {
                    map.put(inputString, map.get(inputString) + 1);
                } else {
                    map.put(inputString, 1);
                }
            }

            for (int i = 0; i < queries.length; i++) {
                String queryString = queries[i];
                if (map.containsKey(queryString)) {
                    result[i] = map.get(queryString);
                }
            }

            return result;
        }

        public static void main(String[] args) {

            String[] strings= {"farewell", "hello", "goodbye", "hola", "farewell", "goodbye", "goodbye"};
            String[] queries= {"hello", "goodbye", "hola", "farewell"};

            System.out.println(Arrays.toString(matchingStrings(strings, queries)));

        }

    }
