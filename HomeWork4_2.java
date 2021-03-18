package com.linghao.HomeWork_3_17;

import java.util.Scanner;

/**
 * @author zoulinghao
 * @create 2021-03-17-19:49
 */
public class HomeWork4_2 {
    public static void main(String[] args) {
        double latitude1,longitude1,latitude2,longitude2,x1,x2,y1,y2,r;
        //地球的半径
        r=6371.01;

        Scanner in=new Scanner(System.in);
        System.out.println("Enter point 1 (latitude and longitude) in degrees");
        latitude1=in.nextDouble();
        longitude1=in.nextDouble();
        System.out.println("Enter point 2 (latitude and longitude) in degrees");
        latitude2=in.nextDouble();
        longitude2=in.nextDouble();
        //将获取到的度 转换成弧度
        x1=Math.toRadians(latitude1);
        y1=Math.toRadians(longitude1);
        x2=Math.toRadians(latitude2);
        y2=Math.toRadians(longitude2);
        //两点之间最大圆距离
        System.out.println("The distance between the two points is "+
                (r*Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1-y2)))
        +" km");

    }
}
