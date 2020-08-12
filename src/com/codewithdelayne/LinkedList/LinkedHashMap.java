package com.codewithdelayne.LinkedList;

import java.util.HashMap;
import java.util.Map;

public class LinkedHashMap<K, V> extends HashMap<K, V>
        implements Map<K, V> {







    public static void main(String[] args) {
        LinkedHashMap<Integer,String> num_map=new LinkedHashMap<Integer,String>();
        num_map.put(1,"ONE");
        num_map.put(2,"TWO");
        num_map.put(3,"THREE");
        num_map.put(4,"FOUR");
        num_map.put(5,"FIVE");
        System.out.println("The contents of LinkedHashMap:");
        //retrieve the key-value pairs as set using entrySet & print each entry
        for(Map.Entry m:num_map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
