package com.company;
import java.util.Scanner;
public class Binary_Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        long num  = sc.nextLong(),n1;
        long reverse = 0;
        n1 = num;
        while (n1>0){
            reverse<<=1;
            if((n1 &1)==1){
                reverse^=1;
            }
            n1>>=1;
        }
        if(num ==reverse){
            System.out.println("Binary representation of "+num+" is palindrome");
        }
        else {
            System.out.println("Binary representation of "+num+" is not palindrome");
        }
    }
}
