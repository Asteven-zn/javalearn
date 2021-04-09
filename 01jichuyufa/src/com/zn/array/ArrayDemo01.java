package com.zn.array;

public class ArrayDemo01 {
    //变量类型     变量名字      =     变量值；
    //数组类型

    public static void main(String[] args) {
        int[] numbers; //
        numbers = new int[10]; //

        numbers[0]=1;
        numbers[1]=2;
        numbers[2]=3;
        numbers[3]=4;
        numbers[4]=5;

        int sum = 0;
        for (int i=0; i<numbers.length; i++){
            sum = sum + numbers[i];
        }
        System.out.println("数组的总和为" + sum);
    }
}
