package com.zn.operator;

public class Demo03 {
    public static void main(String[] args) {
        //++ --   自增，自减号   一元运算符就是只需要一个变量
        int a = 3;

        int b = a ++;  //执行完这行代码后，先给b赋值，再自增
        //a = a + 1;
        System.out.println(a);
        System.out.println(b);

        int c = ++ a;  //执行完这行代码前，先自增，再给c赋值，
        //a = a + 1;
        System.out.println(a);
        System.out.println(c);
    }
}
