package com.example.javademo.day17.map;


import java.util.*;

public class MapDemo2 {
    public static void main(String[] args) {
        //创建Map的对象
        Map<String,Integer> map = new HashMap<String,Integer>();

        //put 添加元素
        System.out.println(map.put("001",28));
        System.out.println(map.put("002",28));
        System.out.println(map.put("001",68));//编译运行不报错

        //toString重写了 key=value
        System.out.println(map);

        //clear 删除map中所有键值对
//        map.clear();
//        System.out.println(map);

        //containsKey 测试是否包含指定key
//        System.out.println(map.containsKey("007"));
        //containsValue 测试是否包含指定value
//        System.out.println(map.containsValue(58));
        //get 根据键获取对应的值；如果键不存在则会返回null
//        int age = map.get("008");//自动拆箱 null.intValue()->空指针异常
//        System.out.println(age);
//        System.out.println(map.get("008"));//null
        //获取map中所有键组成的集合并遍历
//        Set<String> keys = map.keySet();
//////        System.out.println(keys);
////        //遍历set集合
////        Iterator<String> it = keys.iterator();
////        while(it.hasNext()){
////            System.out.println(it.next());
////        }
            //获取map中所有值组成的集合并遍历
////        Collection<Integer> col = map.values();
////        for(int age : col){
////            System.out.println(age);
////        }
//       int age =  map.remove("001");
//        System.out.println(age);
        System.out.println(map.size());//输出map中键值对的个数
    }
}