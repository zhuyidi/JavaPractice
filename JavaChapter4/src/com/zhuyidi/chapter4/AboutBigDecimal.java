package com.zhuyidi.chapter4;

import java.math.BigDecimal;

/**
 * Created by dela on 3/3/17.
 */
public class AboutBigDecimal {
    public static void main(String[] args){
        BigDecimal number1 = new BigDecimal("1.0");
        BigDecimal number2 = new BigDecimal("0.8");
        BigDecimal number3 = new BigDecimal("1.8");
        BigDecimal result = number1.subtract(number2);

        System.out.println(result);

        if(number1.add(number2).equals(number3)){
            System.out.println("等于1.8");
        }
        else{
            System.out.println("不等于1.8");
        }
    }
}
