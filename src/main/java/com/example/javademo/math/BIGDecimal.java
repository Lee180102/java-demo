package com.example.javademo.math;

import java.math.BigDecimal;

public class BIGDecimal {
    public static void main(String[] args) {
        System.out.println(0.01+0.09);
        //BigDecimal
        BigDecimal decimal = new BigDecimal(0.01);
        BigDecimal decima2 = new BigDecimal(0.09);
        System.out.println(decimal.add(decima2));

        //精确值
        BigDecimal decima3 = new BigDecimal("0.01");
        BigDecimal decima4 = new BigDecimal("0.09");
        System.out.println(decima3.add(decima4));
    }
}
