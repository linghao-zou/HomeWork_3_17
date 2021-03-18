package com.linghao.HomeWork_3_17;

import java.util.Scanner;

/**
 * @author zoulinghao
 * @create 2021-03-18-12:33
 */
public class HomeWork3_14_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        double y = in.nextDouble();
        double z = in.nextDouble();
        System.out.println((x<y && y<z)?"sorted":"not sorted");

    }
}
