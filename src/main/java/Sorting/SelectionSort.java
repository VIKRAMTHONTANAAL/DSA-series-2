package Sorting;

import java.util.Arrays;

public class SelectionSort {


    public static void main(String[] args) {

        int arr[]={64,25,12,22,11};
selectionSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void selectionSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int min=Integer.MIN_VALUE;

          min=  findMinimum(arr,i);
            int swap=arr[i];
            arr[i]=arr[min];
            arr[min]=swap;

        }

    }

    public static int findMinimum(int arr[], int i){
        int min=arr[i];
        int minimum=i;
        for(int j=i+1;j<arr.length;j++){
           if(arr[j]<min){
               min=arr[j];
               minimum=j;
           }

        }

        return minimum;
    }

}
