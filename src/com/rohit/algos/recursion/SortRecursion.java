package com.rohit.algos.recursion;

public class SortRecursion {

    public static void main(String[] args) {
        int[] arr = {1, 5, 0, 2};
        sort(arr, arr.length - 1);
        for (int i : arr) {
            System.out.println(i);
        }
    }

    public static void sort(int[] arr, int n) {
        if (n == 0)
            return;

        sort(arr, n - 1);
        insert(arr, n);
    }


    public static void insert(int[] arr, int n) {
        if (n==0 || arr[n] >= arr[n - 1]) {
            return;
        }
        int temp = arr[n - 1];
        arr[n - 1] = arr[n];
        arr[n] = temp;
        insert(arr, n - 1);
    }

}
