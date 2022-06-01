package Sorting;
import java.util.*;

public class InsertionSortSwappedNotRight {

    public static void main(String[] args) {
        int arr[]={6,5,4,3,2,1};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }



    public static void insertionSort(int arr[]){

        for(int i=1;i<arr.length;i++){

            for(int j=i;j>0 && arr[j-1]<arr[j];j--){

                int swap=arr[j];
                arr[j-1]=arr[j];
                arr[j]=swap;
            }

            }


        }


    }


