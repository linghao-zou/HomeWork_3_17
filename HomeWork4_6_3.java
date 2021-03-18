package com.linghao.HomeWork_3_17;

/**
 * @author zoulinghao
 * @create 2021-03-17-22:12
 */
public class HomeWork4_6_3 {
    public static void main(String[] args) {
        System.out.printf("amount is %f %e\n",32.32,32.32);
        //amount is 32.320000 3.232000e+01
        System.out.printf("amount is %5.2f%% %5.4e\n",32.327,32.32);
        //amount is 32.33% 3.2320e+01
        System.out.printf("%6b\n",(1>2));
        // false
        System.out.printf("%6s\n","Java");
        //  Java
        System.out.printf("%-6b%s\n",(1>2),"Java");
        //false Java
        System.out.printf("%6b%-8s\n",(1>2),"Java");
        // falseJava
        System.out.printf("%,5d %,6.1f\n",312342,315562.932);
        //312,342 315,562.9
        System.out.printf("%05d %06.1f\n",32,32.32);
        //00032 0032.3

    }
}
