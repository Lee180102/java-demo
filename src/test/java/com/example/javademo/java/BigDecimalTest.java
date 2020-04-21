package com.example.javademo.java;

import org.junit.jupiter.api.Test;

import java.text.DecimalFormat;

public class BigDecimalTest {


    @Test
    public void bigDecimalFormatTest(){
        DecimalFormat decimalFormat = new DecimalFormat("###,###.####");
        String format = decimalFormat.format(77.96000000000001);
        System.out.println(format);
    }
}
