package com.shimbhu.sorting_algos;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {

        int[] arr = {3, 7, 1, 9, 6, 5};
        int n = arr.length;

        System.out.println("unsorted array : "+ Arrays.toString(arr));

        for(int i=1;i<n;i++)
        {
            for(int j=i;j>0;j--)
            {
                if(arr[j-1] > arr[j])
                {
                    swap(arr,j-1,j);
                }
                else {
                    break;
                }
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
