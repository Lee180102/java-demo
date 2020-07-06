package com.example.javademo.day17.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 	方案一：
 * 		1、keySet 获取所有key的set集合
 * 		2、遍历set集合
 *      3、根据key的值获取对应value
 *
*  	方案二：
* 		1、entrySet方法获取代表map键值对的Entry对象的Set集合
* 		2、遍历Set集合
* 		3、调用Entry的方法分别获取Key、Value
* 			K getKey()
* 			          返回与此项对应的键。
* 			 V getValue()
*               返回与此项对应的值
 */
public class MapDemo3 {
    public static void main(String[] args) {
        //创建Map的对象
        Map<String,Integer> map = new HashMap<String,Integer>();

        //put 添加元素
//        map.put("001",28);
//        map.put("002",29);
//        map.put("003",26);
//        map.put("004",27);
//        map.put("005",28);
//        map.put(null,null);
//        map.put("006",null);
//        map.put("name1",26);
//        map.put("name2",28);
//        map.put("name0",39);


        /*//遍历
        //keySet 获取所有key的set集合
        Set<String> keys = map.keySet();
        //遍历set集合
        for(String str : keys){
            //根据key的值获取对应value
            System.out.println(str+"="+map.get(str));
        }*/

        //方案二
        //entrySet方法获取代表map键值对的Entry对象的Set集合
        Set<Map.Entry<String,Integer>> entries = map.entrySet();

        //遍历Set集合
        for (Map.Entry<String,Integer> entry :entries) {
            //调用Entry的方法分别获取Key、Value
            //K getKey()
            // V getValue()
            System.out.println(entry.getKey()+"="+entry.getValue());
        }
    }
}
