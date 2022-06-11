package main.java.Practice;

import java.util.Arrays;

public class BinarySearchUsingRecursion {

    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 6, 7, 8, 9};
        int key = 6;
        int n = -1;
        n = binarySearchIterative(arr, 0, arr.length - 1, key);
        if (n == -1) {
            System.out.println("Element Not Found");
        } else {
            System.out.println("Element found on index " + n);
        }
        System.out.println(Arrays.binarySearch(arr,6)) ;

    }


    public static int binarySearchIterative(int[] arr, int left, int right, int key) {


        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == key) {
                return mid;
            } else if (key < arr[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }

        }
        return -1;
    }


}
