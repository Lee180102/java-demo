package com.example.javademo.day17.exer;

/**
 * 	用户：用户名（String）、年龄（int）、手机号（String）、密码（String）
 *
 * 		class User
 * 		--属性私有化
 * 		--提供get set方法
 * 		--提供有参构造
 * 	   构造方法：和类同名，没有返回值类型
 *      --重写toString方法
 */
public class User {
    private String username;
    private int age;
    private String phoneNum;
    private String passWord;
    //无参构造 new User();
    public User(){}

    public User(String username, int age, String phoneNum, String passWord) {
        this.username = username;
        this.age = age;
        this.phoneNum = phoneNum;
        this.passWord = passWord;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", age=" + age +
                ", phoneNum='" + phoneNum + '\'' +
                ", passWord='" + passWord + '\'' +
                '}';
    }
}
