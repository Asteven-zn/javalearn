package com.zn.scanner;

import java.util.Scanner;

public class Demo03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入需要打印的内容：");

        String str = scanner.nextLine();

        System.out.println("您打印的内容为:"+str);
    }
}
