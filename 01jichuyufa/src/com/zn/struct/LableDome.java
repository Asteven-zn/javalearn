package com.zn.struct;

public class LableDome {
    public static void main(String[] args) {
        //打印101-150之间所有质数，质数指大于1的自然数中，除1和它本身外不再有其他因数的自然数
        //这个程序只做了解
        int count = 0;
        outer:for (int i = 101; i < 150; i++) {
            for (int j = 2; j<i/2;j++){
                if (i % j == 0){
                    continue outer;
                }
            }
            System.out.println(i + " ");
        }
    }
}
