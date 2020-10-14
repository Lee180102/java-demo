package com.example.javademo.day22.properties;

import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class PropertiesDemo1 {
    public static void main(String[] args) {
        //创建Properties对象 不能加泛型
        Properties properties = new Properties();
        //也是一个Map
        //添加元素  add put
        properties.put("001","张三");
        properties.setProperty("004","zhangwu");
        properties.put("002","lisi");
        properties.put("003","wangwu");
        properties.put(12,10);
//        System.out.println(properties);
        //遍历映射
        //1、先获取key集合 遍历集合 输出当前key对应的value值
        /*Set keys = properties.keySet();
        for(Object key : keys){
            Object value = properties.get(key);
            System.out.println(key+"="+value);
        }*/
        //2、Entry
        /*for(Map.Entry entry : properties.entrySet()){
            System.out.println(entry.getKey()+"="+entry.getValue());
        }*/
    }
}
