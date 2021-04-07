package com.zn.operator;

public class Demo02 {
    public static void main(String[] args) {
        long a = 12334545635676L;
        int b = 123;
        short c = 10;
        byte d = 8;
        float e = 16.0f;
        double f = 0.8;
        System.out.println(a+b+c+d); //结果long
        System.out.println(b+c+d); //结果int
        System.out.println(c+d); //结果int
        System.out.println(e/f); //结果double
    }
}
