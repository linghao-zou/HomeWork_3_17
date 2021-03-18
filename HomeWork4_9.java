package com.linghao.HomeWork_3_17;

import java.util.Scanner;

/**
 * @author zoulinghao
 * @create 2021-03-17-20:06
 */
public class HomeWork4_9 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a character :");
        String code = in.next();
        System.out.println("The Unicode for the character "+code+" is "+(int)code.charAt(0));

    }
}
