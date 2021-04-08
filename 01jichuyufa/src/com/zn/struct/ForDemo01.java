package com.zn.struct;

public class ForDemo01 {
    public static void main(String[] args) {
        int a = 1;
        while (a<=10){
            System.out.println(a);
            a+=2;
        }
        System.out.println("while finsh!!!!!");

        for (int i=1;i<=10;i++){
            System.out.println(i);
        }
        System.out.println("for finsh!!!!!");
    }
}
