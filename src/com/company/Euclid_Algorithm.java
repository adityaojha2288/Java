package com.company;
import java.util.*;
import java.lang.*;
public class Euclid_Algorithm {
    public static int gcd(int a,int b){
    if(a==0){
    return b;
    }
    return gcd(b%a,a);
    }


    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a = sc.nextInt();
        System.out.println("Enter the second number:");
        int b = sc.nextInt();
        int g = gcd(a, b);
        int count=0;
        if (g==1){
            count+=1;
        }
        System.out.println("GCD(" + a+","+b+")=" + g+ "and coount"+count);

        // int a =10;
        // int b =15,g;
        //g=gcd(a,b);
        //System.out.println("GCD(" + a+","+b+")=" + g);
        //a =35; b = 10;
        //g = gcd(a,b);
        //System.out.println("GCD(" + a+","+b+")=" + g);
        //a =31; b = 2;
        //g = gcd(a,b);
        //System.out.println("GCD(" + a+","+b+")=" + g);
    }
}
