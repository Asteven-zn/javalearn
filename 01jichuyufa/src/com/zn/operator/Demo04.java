package com.zn.operator;

public class Demo04 {
    public static void main(String[] args) {
        // 与（and） 或（or） 非（取返）
        boolean a = true;
        boolean b = false;

        System.out.println("a && b:"+(a&&b)); //逻辑与，两个都为真，结构为真
        System.out.println("a || b:"+(a&&b)); //逻辑或，两个有一个为真，结构为真
        System.out.println("! (a && b):"+!(a&&b)); //如果是真，则为假，如果为假则为真

        //短路运算
        int c = 5;
        boolean d = (c<4)&&(c++<4);  //第一个条件为假了，后面的也就不用执行了
        System.out.println(d);
        System.out.println(c);
    }
}
