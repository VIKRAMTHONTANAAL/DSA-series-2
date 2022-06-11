package main.java.Practice;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        //int arr[] = {2, 5, 6, 7, 3, 1, 8};
        int arr[] = { 5, 4, 3, 2, 1};

        System.out.println(Arrays.toString(bubbleSort(arr)));
    }

    public static int[] bubbleSort(int arr[]) {
        for (int j = 0; j < arr.length - 1; j++) {

            boolean flag=false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    flag=true;
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
            if(flag==false){
                break;
            }

        }
return arr;

    }
}
