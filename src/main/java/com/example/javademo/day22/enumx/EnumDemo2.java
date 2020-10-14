package com.example.javademo.day22.enumx;

public class EnumDemo2 {
    public static void main(String[] args) {
//        Week w = Week.星期一;
        /*Week[] ws = Week.values();
        for(Week w : ws){
            System.out.println(w.name());
        }*/
//        Week w = new Week();
    }
}
//定义枚举表示星期
enum Week implements A{
    星期日{
          public void m(){
              System.out.println("星期日");
        }
    },星期一{
        public void m(){
            System.out.println("星期一");
        }
    }/*,星期二(2),星期三(3),星期四(4),星期五(5),星期六(6)*/;
    public int num;

    Week() {

    }

    public void method(){

    }
    //要求私有化
//    private Week(){}
    private Week(int i){
    }

}
interface A{
    public void m();
}
