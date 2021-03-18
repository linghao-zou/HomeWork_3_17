package com.linghao.HomeWork_3_17;

import java.util.Scanner;

/**
 * @author zoulinghao
 * @create 2021-03-17-20:01
 */
public class HomeWork4_8 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter an ASCII code:");
        int code = in.nextInt();
        System.out.println("The character for ASCII code "+code+" is "+(char)code);
    }
}
