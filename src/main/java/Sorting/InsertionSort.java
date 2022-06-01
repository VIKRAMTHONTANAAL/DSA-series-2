package Sorting;
import java.util.*;

public class InsertionSort {

    public static void main(String[] args) {
        int arr[]={6,5,4,3,2,1};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void insertionSort(int []arr){

        for(int i=1;i<arr.length;i++){
            int j=i-1;
            int temp=arr[i];
            for(;j>=0;j--){

                if(arr[j]>temp){
                    arr[j+1]=arr[j];
                }else{
                    break;
                }

            }

            arr[j+1]=temp;


        }



    }
}
