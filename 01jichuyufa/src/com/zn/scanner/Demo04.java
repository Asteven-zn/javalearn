package com.zn.scanner;

import java.util.Scanner;

public class Demo04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = 0;
        int m = 0;

        System.out.println("please a number!");

        while (scanner.hasNextDouble()){
            double x = scanner.nextDouble();
            m = m + 1;
            sum = sum + x;
            System.out.println("you int " + m + " number,then sum = " + sum);
        }

        System.out.println(m + " number sum is:" + sum);
        System.out.println(m + " number ave is:" + (sum / m));

        scanner.close();
    }
}
