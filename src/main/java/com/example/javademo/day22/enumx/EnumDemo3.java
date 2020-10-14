package com.example.javademo.day22.enumx;

public class EnumDemo3 {

    public static void main(String[] args) {
        Week1 w = Week1.星期六;
        switch (w){
            case 星期一:
                System.out.println("星期一上班");
                break;
            case 星期二:
                System.out.println("上班");
                break;
            case 星期三:
                System.out.println("上班");
                break;
            case 星期六:
                System.out.println("休息");
        }
    }
}
enum Week1{
    星期日,星期一,星期二,星期三,星期四,星期五,星期六
}

