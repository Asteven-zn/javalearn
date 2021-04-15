package com.zn.array;

public class ArrayDemo02 {
    public static void main(String[] args) {
        //静态初始化
        int[] a = {1,2,3,4};

        //动态初始化：包含了默认的初始化
        int[] b = new int[10];
        b[0] = 10;

        //遍历数组
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();

        System.out.println(b[0]);
        System.out.println(b[1]);
    }
}
