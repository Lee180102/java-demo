package com.example.javademo.day17.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        Map<String,Integer> map = new LinkedHashMap<String,Integer>();

        map.put("name1",26);
        map.put("name2",28);
        map.put("name0",39);

        System.out.println(map);
    }
}
