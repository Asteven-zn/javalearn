package com.zn.struct;

public class ForDemo02 {
    public static void main(String[] args) {
        //练习1： 计算0-100之间的奇数和偶数的和
        int oddSum = 0; //奇数
        int evenSum = 0; //偶数

        for (int i = 0; i <= 100; i++){
            if (i%2!=0){
                oddSum += i;
            }else {
                evenSum +=i;
            }
        }
        System.out.println("奇数的和=" + oddSum);
        System.out.println("偶数的和=" + evenSum);
    }
}
