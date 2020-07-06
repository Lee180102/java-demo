package com.example.javademo.collection;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo4 {
    public static void main(String[] args) {
        //乒乓球 台球 唱歌
        //谁既报了乒乓球比赛，还报了台球比赛
        //乒乓球比赛
        Collection c1 = new ArrayList();
        c1.add("曹洋");//曹大哥
        c1.add("肖旭伟");
        c1.add("朴乾");//朴欧巴

        //台球比赛
        Collection c2 = new ArrayList();
        c2.add("肖旭伟");//肖老板
        c2.add("郝霞");
        c2.add("赵栋");//栋栋

        //谁既报了乒乓球比赛，还报了台球比赛
        c1.retainAll(c2);
        System.out.println(c1);
    }
}
