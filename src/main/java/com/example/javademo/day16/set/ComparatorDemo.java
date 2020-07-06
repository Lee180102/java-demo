package com.example.javademo.day16.set;

import java.util.Comparator;
import java.util.TreeSet;

public class ComparatorDemo {
    public static void main(String[] args) {
        //创建对象TreeSet
        /*TreeSet<Person> tree = new TreeSet<Person>(new Comparator(){

            @Override
            public int compare(Object o1, Object o2) {
                Person p1 = (Person)o1;
                Person p2 = (Person)o2;
                //自定义比较规则
                if((p1.getAge()-p2.getAge())==0){
                    return p1.getName().equals(p2.getName())?0:1;
                }
                return p1.getAge()-p2.getAge();
            }
        });*/
        TreeSet<Person> tree = new TreeSet<Person>(new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                if((p1.getAge()-p2.getAge())==0){
                    return p1.getName().equals(p2.getName()) ? 0 : 1;
                }
                return p1.getAge()-p2.getAge();
            }
        });
        //添加元素
        tree.add(new Person("lisi",34));
        tree.add(new Person("zhangsan",55));
        tree.add(new Person("wangwu",34));
        tree.add(new Person("lisi",34));
        System.out.println(tree);
    }
}
/*class ComparatorImpl implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        Person p1 = (Person)o1;
        Person p2 = (Person)o2;
        //自定义比较规则
        return p1.getAge()-p2.getAge();
    }
}*/
class Person{
    private String name;
    private int age;
    public Person(){}

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    /*@Override
    public int compareTo(Object o) {
        return 0;
    }*/

    /*@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }*/
}
