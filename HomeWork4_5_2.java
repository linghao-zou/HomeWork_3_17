package com.linghao.HomeWork_3_17;

import java.util.Scanner;

/**
 * @author zoulinghao
 * @create 2021-03-17-22:02
 */
public class HomeWork4_5_2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a hex digit");
        String hexString=input.nextLine();
        if (hexString.length()!=1){
            System.out.println("You must enter exactly one character");
            System.exit(1);
        }
        char ch=Character.toUpperCase(hexString.charAt(0));
        if ('A'<=ch&&ch<='F'){
            int value =ch-'A'+10;
            System.out.println("The decimal value for hex digit "+(char)(ch-'A'+'a')+
                    " is "+value);
        }else if (Character.isDigit(ch)){
            System.out.println("The decimal value for hex digit "+ch+
                    " is "+ch);
        }else{
            System.out.println(ch+" is an invalid input");
        }

    }
}
