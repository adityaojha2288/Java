package com.company;

import java.util.Arrays;

public class Insertion_sort {
    public static void main(String[] args) {
        int [] arr = {5,4,1,3,2};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertion(int [] arr){
        for (int i = 0; i < arr.length-1 ; i++) {
            for (int j = i+1; j >0; j--) {
                if (arr[j] < arr[j-1]) {
                    swap(arr, j, j-1);
                }
                else{
                    break;
                }
            }
        }
    }
    static void swap(int [] arr, int f1,int f2){
        int temp = arr[f1];
        arr[f1] = arr[f2];
        arr[f2] = temp;
    }
}
