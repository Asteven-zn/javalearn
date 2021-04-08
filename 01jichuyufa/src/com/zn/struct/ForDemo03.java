package com.zn.struct;

public class ForDemo03 {
    public static void main(String[] args) {
        //练习2：用while或for循环输出1——1000能被5整除的数，并且每行输出6个
        for (int i = 0; i < 1000; i++) {
            if (i%5==0) {
                System.out.print(i + "\t"); //print输出不换行
            }
            if (i%(5*6) == 0){
                System.out.println(); //println输出换行
                //System.out.print("\n");
            }
        }
    }
}
