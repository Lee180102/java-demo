package com.example.javademo.day22.change;

public class ChangeDemo {
    public static void main(String[] args) {
        System.out.println(add(3,5));
        System.out.println(add(2,3,4));
        int[] arr = new int[]{1,2,3,4,5};
        System.out.println(add(arr));
        add();
    }
    public static int add(int... arr){
        int sum = 0;
        for(int i :arr){
            sum+=i;
        }
        return sum;
    }

    /*public static int add(int... arr){
        int sum = 0;
        for(int i :arr){
            sum+=i;
        }
        return sum;
    }*/
        /*public static int add(int i,int j){
        return i+j;
    }
    public static int add(int i,int j,int k){
        return i+j+k;
    }
    public static int add(int[] arr){
        int sum = 0;
        for(int i:arr){
            sum+=i;
        }
        return sum;
    }*/
}
