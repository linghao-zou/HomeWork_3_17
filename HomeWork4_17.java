package com.linghao.HomeWork_3_17;

import java.util.Scanner;

/**
 * @author zoulinghao
 * @create 2021-03-17-20:09
 */
public class HomeWork4_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = input.nextInt();
        //防止读到空格
        input.nextLine();

        System.out.print("Enter a month: ");
        String month = input.nextLine();

        //判断年份是不是闰年

        boolean isLeapYear = ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0));

        switch (month){
            case "Jan":
            case "Mar":
            case "May":
            case "July":
            case "Aug":
            case "Oct":
            case "Dec":
                System.out.println(month + " " + year + " has 31 days"); break;
            case "Apr":
            case "Jun":
            case "Sep":
            case "Nov":
                System.out.println(month + " " + year + " has 30 days"); break;
            case "Feb":

                System.out.println(month + " " + year + " has 28 days"); break;
            default:
                System.out.println(month +" is not a correct month name");

        }

    }
}
