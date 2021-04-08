package com.zn.struct;

public class BreakDemo {
    public static void main(String[] args) {
        int i = 0;
        while (i<10){
            i++;
            System.out.println(i);
            if (i == 7){
                break;
            }
        }
    }
}
