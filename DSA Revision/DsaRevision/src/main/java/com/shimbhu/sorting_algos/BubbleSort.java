package com.shimbhu.sorting_algos;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {

//        int[] arr = {3, 7, 1, 9, 6, 5};
        int[] arr = {1, 2, 3, 6, 8, 9};
        int n = arr.length;

        System.out.println("unsorted array : "+ Arrays.toString(arr));

        for(int i=n-1;i>=0;i--)
        {
            boolean flag = true;

            for(int j=0;j<i;j++)
            {
                if(arr[j] > arr[j+1])
                {
                    swap(arr,j,j+1);
                    flag = false;
                }
            }

            if(flag)
            {
                break;
            }
        }

        System.out.println("sorted array : "+ Arrays.toString(arr));
    }

    public static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
