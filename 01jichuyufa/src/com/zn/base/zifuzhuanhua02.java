package com.zn.base;

public class zifuzhuanhua02 {
    public static void main(String[] args) {
        //操作比较大的数的时候，注意溢出问题
        //JDK7新特性，数字之间可以用下划线分割
        int money = 10_0000_0000;
        int years = 20;

        int total = money*years;  //-1474836480计算的时候溢出了
        long total2 = money*years; //默认是int，转换之前已经存在溢出问题了
        long total3 = money*((long)years); //先把一个数转化为long
        long total4 = ((long)money)*((long)years);
        long total5 = ((long)money)*years;
        System.out.println(total);
        System.out.println(total2);
        System.out.println(total3);
        System.out.println(total4);
        System.out.println(total5);
    }
}
