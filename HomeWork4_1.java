package com.linghao.HomeWork_3_17;

import java.util.Scanner;

/**
 * @author zoulinghao
 * @create 2021-03-17-19:43
 */
public class HomeWork4_1 {
    public static void main(String[] args) {
        double s,r,area;
        //创建Scanner实例化对象 从键盘获取参数
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the length from the center to a vertex: ");
        r = in.nextDouble();
        s=2 * r * Math.sin(Math.PI/5);
        area=(5 * Math.pow(s,2)) / (4 * Math.tan( Math.PI /5 ));
        System.out.printf("The area of the pentagon is %.2f\n",area);
    }
}
