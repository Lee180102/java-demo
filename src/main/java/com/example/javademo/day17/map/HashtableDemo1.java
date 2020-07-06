package com.example.javademo.day17.map;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class HashtableDemo1 {
    public static void main(String[] args) {
        //创建对象 Hashtable
        Hashtable<Integer,Integer> table = new Hashtable<Integer, Integer>();
        //
        table.put(1,12);//自动装箱
        table.put(5,13);//自动装箱
        table.put(6,11);//自动装箱
        table.put(2,19);//自动装箱
        //键不能为null,否则会抛出NullPointerException
//        table.put(null,18);
        //值不能为null,否则会抛出NullPointerException
//        table.put(2,null);
//        System.out.println(table);

        //elements
//        Enumeration<Integer> enu = table.elements();
//        while(enu.hasMoreElements()){
//            int i = enu.nextElement();
//            System.out.println(i);
//        }
        //entrySet
        /*Set<Map.Entry<Integer,Integer>> entries = table.entrySet();
        for(Map.Entry<Integer,Integer> entry :entries){
            System.out.println(entry.getKey()+"="+entry.getValue());
        }*/
        for(Map.Entry<Integer,Integer> entry:table.entrySet()){
            System.out.println(entry.getKey()+"="+entry.getValue());
        }
    }

}
