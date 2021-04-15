package com.zn.array;

public class ArrayDemo01 {
    //变量类型     变量名字      =     变量值；
    //数组类型

    public static void main(String[] args) {
        int[] numbers; //1.第一种定义
        //int nums2[]; //2.第二种定义，不常用

        numbers = new int[10]; //定义10个元素的数组

        numbers[0]=1;
        numbers[1]=2;
        numbers[2]=3;
        numbers[3]=4;
        numbers[4]=5;

        //计算数组的元素和
        int sum = 0;
        //获取数组的长度numbers.length;
        for (int i=0; i<numbers.length; i++){
            sum = sum + numbers[i];
        }
        System.out.println("数组的总和为" + sum);
    }
}
