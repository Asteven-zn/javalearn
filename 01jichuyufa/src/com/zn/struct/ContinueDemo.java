package com.zn.struct;

public class ContinueDemo {
    public static void main(String[] args) {
        int i = 0;
        while (i < 30){
            i ++;
            if (i%2 != 0){
                continue;
            }
            System.out.print(i + "\t"); //print输出不换行
            if (i%(2*3) == 0){
                System.out.println();
            }
        }
    }
}
