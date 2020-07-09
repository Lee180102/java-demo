package com.example.javademo.day19.xuliehua;

public class PersonDemo {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("张三");
        person.setAge(30);
        System.err.println(person.getName());

//        Person person1 = new Person("李四",24);

        //10000000 Person对象
        //很多行代码并没有使用person对象
//        person=null;

    }
}
