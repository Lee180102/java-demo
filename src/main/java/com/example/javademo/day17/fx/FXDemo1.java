package com.example.javademo.day17.fx;

/**
 * 此案例用于讲解在类上定义泛型
 */
public class FXDemo1 {
    public static void main(String[] args) {
//        Paper p = new Paper();
//        p.setContent("要放假了~~");
//        System.out.println(p.getContent());
        //Paper类虽然指定了泛型，但是创建对象时也可以不使用泛型
//        Paper p1 = new Paper();
//        p1.setContent("abc");
//        System.out.println(p1.getContent());
//
//        p1.setContent(100);
//        System.out.println(p1.getContent());

//        Paper<String,String> p2 = new Paper<String,String>();
//        p2.setContent("曹洋");
////        p2.setContent(100);
//        System.out.println(p2.getContent());

        Paper<String,String> p3 = new Paper<String,String>();
        p3.method("abc","123");
        p3.method("dfc","456");
    }
}
//Paper类上可以定义一个或多个泛型
class Paper<T1,T2>{
    //属性类型通过泛型指定
    private T1 content;
//    private String content;

    //get方法返回值通过泛型指定
    public T1 getContent(){
        return this.content;
    }

    //set方法参数类型通过泛型指定
    public void setContent(T1 content){
        this.content = content;
    }
    //方法两个参数通过不同泛型指定
    public void method(T1 content,T2 s){
        System.out.println("定义两个泛型");
    }
}

