package Sorting;
import java.util.*;
public class BubbleSort {

    public static void main(String[] args) {
        int arr[]={64,25,12,22,11};

        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSort(int arr[]){

        for(int i=0;i<arr.length-1;i++){

            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int swap=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=swap;
                }
            }


        }



    }
}
