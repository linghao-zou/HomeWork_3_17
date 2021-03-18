package com.linghao.HomeWork_3_17;

import java.util.Random;
import java.util.Scanner;

/**
 * @author zoulinghao
 * @create 2021-03-17-22:20
 */
public class HomeWork3_2_3 {
    public static void main(String[] args) {
       int x=0,y;

       int weight=55,height=32;
       boolean isFlag=((weight>50)||height>60)&&!(weight>50&&height>60);
        System.out.println(isFlag);
    }

}
