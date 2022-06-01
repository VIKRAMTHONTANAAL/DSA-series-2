package Recursion;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr ={2,5,1,6,9};
        System.out.println(Arrays.toString(bubbleSort(arr,arr.length-1)));
    }

    public static int [] bubbleSort(int []arr, int n) {

       if(n==0){
           return arr;
       }
       arr= compare( arr,0);

        return bubbleSort(arr,n-1);
    }
    public static int[] compare(int[] arr, int n) {

        if(n==arr.length-1){
return arr;
        }
        if(arr[n]>arr[n+1]){
            int temp=arr[n];
            arr[n]=arr[n+1];
            arr[n+1]=temp;

        }

     return compare(arr,n+1);


    }
}
