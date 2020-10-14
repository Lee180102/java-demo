package com.example.javademo.day22.reflect;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;

public class DataBaseDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        //没有配置文件之前 只能直接创建对象
        /*Mysql mysql = new Mysql();
        mysql.insert();*/
        /*Oracle oracle = new Oracle();
        oracle.insert();*/

        //通过配置文件形式进行优化  在配置文件中指定要使用的是哪个数据库
        //properties加载数据 获取指定的数据库类
        Properties properties = new Properties();
        properties.load(new FileInputStream("database.properties"));
        String value = properties.getProperty("databaseName");
//        System.out.println(value);
//        new value();//注意value是字符串类型 不能new

        //第一种获取Class的方法  类名.class属性获取该类的Class对象
//        Class clz = String.class;//获取字符串对应的Class对象
//        System.out.println(clz);
//        Class clz1 = int.class;//面向对象特征 可以获取基本数据类型对应的Class对象
//        System.out.println(clz1);
//        Mysql.class;//获取MySQL类对应的对象
        //
        //第二种获取Class方法 对象.getClass()方法 该方式得先有类的对象
        /*String s = new String();
        s.getClass();*/
        //第三种获取Class的方法  根据类的全路径名创建该类的Class对象
        Class clz = Class.forName(value);
//        System.out.println(clz);
        //获取Class对象对应的类的实例 只能通过无参构造创建对象
//        Object o = clz.newInstance();
//        Database database = (Database) o;
//        database.insert();
        //通过有参构造创建对象 getConstructor方法需要指定构造方法参数的类型要求是Class对象
//        Constructor constructor = clz.getConstructor(int.class);
        //调用构造方法的newInstance方法来获取对象 传入构造方法需要的参数值
//        Object object = constructor.newInstance(100);
//        Database database = (Database) object;
//        database.insert();
        //获取两个参数的构造方法
//        Constructor constructor = clz.getConstructor(int.class,int.class);
//        Object object = constructor.newInstance(100,200);
//        Database database = (Database) object;
//        database.insert();

        //获取私有构造方法
//        Constructor constructor = clz.getDeclaredConstructor(int.class);
//        System.out.println(constructor);
//        //暴力破解 跳过权限控制
//        constructor.setAccessible(true);
//        Object object = constructor.newInstance(100);
//        System.out.println(object);

        //获取所有public的构造方法
        /*Constructor[] cs = clz.getConstructors();
        for(Constructor c : cs){
            System.out.println(c);
        }*/
        //获取所有的构造方法
        /*Constructor[] cs = clz.getDeclaredConstructors();
        for(Constructor c : cs){
            System.out.println(c);
        }*/

        //获取抛出异常的构造方法
        /*Constructor constructor = clz.getConstructor(double.class,int.class);
        Class[] exces = constructor.getExceptionTypes();
        for(Class c : exces){
            System.out.println(c);
        }*/

        //获取构造方法
        Constructor con = clz.getDeclaredConstructor(String.class);
        con.setAccessible(true);
        Object o = con.newInstance("zhangsan");

        //获取public修饰的属性
//        Field field = clz.getField("str");
        Field field = clz.getField("name");
//        System.out.println(field);
        //获取当前属性的值
        Object val = field.get(o);
        System.out.println(val);
    }


}
abstract class Database{
//    private String name;
    public abstract void insert();
}
class Mysql extends Database{
    public Mysql(int i){
        System.out.println("这是MySQL的有参构造");
    }
    public void insert(){
        System.out.println("从MySQL数据库中插入数据");
    }
}
class Oracle extends Database{
    private String str;
    private int age;
    public String name;

    private Oracle(int i){
        System.out.println("这是Oracle的有参构造");
    }
    public Oracle(int i,int j){
        System.out.println("这是Oracle的两个参数的有参构造");
    }
    public Oracle(double d,int i) throws IOException {
        File file = new File("e:\\a.txt");
        file.createNewFile();
        System.out.println(d+","+i);
    }
    private Oracle(String name){
        this.name=name;
    }
    public void insert(){
        System.out.println("从Oracle数据库中插入数据");
    }
    public void delete() throws IOException {

    }
}