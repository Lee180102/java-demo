package com.example.javademo.finallyx;

public class FinallyDemo1 {
    public static void main(String[] args) {
        System.out.println(method());
    }

    public static int method(){
        int i = 10;//11
        try{
            i++;
//            return i++;//return 10
        }finally{
            return i++;//return 11
//            System.out.println("finally:"+i);
        }
//        return i;
    }

    /*public static int method(){
        int i = 10;
        try{
            i = 20;
            //return 20; 在编译时此处已经用20替代了i；
            // 当程序return前会检查是否有finally，如果有则需要先执行finally中的代码；
            //执行完finally再回来执行return；此时return的并不再去拿i的值 而是已经编译产生的20
            return i;
//            System.out.println(5/0);
        }catch(Exception e){
            i = 30;
        }finally{
            System.out.println("hello");
            i = 40;
        }
        return i;
    }*/
}
