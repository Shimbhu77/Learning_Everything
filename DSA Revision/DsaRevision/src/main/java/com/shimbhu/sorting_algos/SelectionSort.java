package com.shimbhu.sorting_algos;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {

        int[] arr = {3, 7, 1, 9, 6, 5};
        int n = arr.length;

        System.out.println("unsorted array : "+ Arrays.toString(arr));

        for(int i=0;i<n-1;i++)
        {
            int min = arr[i];
            int minIndex = i;

            for(int j=i+1;j<n;j++)
            {
                if(min > arr[j])
                {
                    min = arr[j];
                    minIndex = j;
                }
            }

            swap(arr,i,minIndex);
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
