package com.example.javademo.math;

import javax.sound.midi.Soundbank;
import java.util.Random;

public class MathTest {

/*
算术运算符：
	+ - * /
	final:
		修饰类 不能被继承
		修饰方法 不能被重写
		修饰变量  常量（引用不能发生变化）

 */


/*
方法：
	static double ceil(double a)
	      向上取整
	static double floor(double a)
		向下取整
	static long round(double a)
		四舍五入
	static double random()
	     返回带正号的 double 值，该值大于等于 0.0 且小于 1.0
		[0,1)
		[2,7)
		Math.random()*(7-2)+2->[2,7)
		[2,7]
		Math.random()*(7-2+1)+2=>[2,7]
自定义方法：根据传入的参数，返回参数范围内任意数
 */

    public static void main(String[] args) {
        double number01 = 2.1523;
        System.out.println(Math.ceil(number01));
        System.out.println(Math.floor(number01));
        System.out.println(Math.round(number01));
        double random = Math.random();
        System.out.println(random*(6)+2);

        randomTest();
    }

/*
Random类：
	产生随机数
	构造方法：
		Random()
		          创建一个新的随机数生成器。
		Random(long seed)
		          使用单个 long 种子创建一个新的随机数生成器。

	方法：
		nextInt
			获取int类型的随机数
		int nextInt(int n)
		          返回一个伪随机数，它是取自此随机数生成器序列的、在 0（包括）和指定值（不包括）之间均匀分布的 int 值。

 */


static void randomTest(){
    System.out.println(new Random().nextInt());
    System.out.println(new Random(0).nextInt());
    System.out.println(new Random().nextInt(10));
}


}
