package com.example.javademo.day21.jdk;

//指定只导入静态的sort方法
import java.util.Arrays;

import static java.util.Arrays.sort;

public class Demo {
    public static void main(String[] args) {
        int[] arr= new int[]{1,5,2,4};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
