package com.zn.struct;

public class ForDemo05 {
    public static void main(String[] args) {
        int[] numbers = {10,20,30,40,50};

        for (int i = 0; i < 5; i++) { //普通for循环
            System.out.println(numbers[i]);
        }
        System.out.println("#############");
        for (int x:numbers){ //普通for循环
            System.out.println(x);
        }
    }
}
