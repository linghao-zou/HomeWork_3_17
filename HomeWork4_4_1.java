package com.linghao.HomeWork_3_17;

/**
 * @author zoulinghao
 * @create 2021-03-17-21:22
 */
public class HomeWork4_4_1 {
    public static void main(String[] args) {
        String s1="Welcome to Java";
        String s2="Programming is fun";
        String s3="Welcome to Java";
        System.out.println(s1==s3); //true
        System.out.println(s2==s3); //false
        System.out.println(s1.equals(s2));//false
        System.out.println(s2.equals(s3));//false
        System.out.println(s1.compareTo(s2));//7
        System.out.println(s2.compareTo(s3));//-7
        System.out.println(s2.compareTo(s2));//0
        System.out.println(s1.charAt(0)); //W
        System.out.println(s1.indexOf('j'));//-1
        System.out.println(s1.indexOf("to"));//8
        System.out.println(s1.lastIndexOf('a'));//14
    }
}
