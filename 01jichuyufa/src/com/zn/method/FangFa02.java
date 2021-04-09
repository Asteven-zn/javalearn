package com.zn.method;

public class FangFa02 {
    public static void main(String[] args) {
        int test = max(2,3);
        System.out.println(test);
    }
    // 比大小
    public static int max(int num1,int num2){
        int result = 1;

        if (num1 == num2){
            System.out.println("num1 == num2");
            return 0; //终止方法
        }
        if (num1 > num2){
            result = num1;
        }else {
            result = num2;
        }

        return result;
    }
}
