package Recursion;
import java.util.*;

public class QuickSort {

    public static void main(String[] args) {
        int arr[]={5,4,3,2,1,10,14,15};
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int arr[],int start,int end){


        if(start>=end){
            return ;
        }
        int mid=partition(arr,start,end);
        quickSort(arr,start,mid-1);
        quickSort(arr,mid+1,end);
    }

    public static int partition(int arr[],int start,int end){
        int count=0;
        for(int i=start+1;i<=end;i++){
            if(arr[i]<arr[start]){
                count++;
            }
        }

        //first swap
        int temp=arr[start+count];
        arr[start+count]=arr[start];

        arr[start]=temp;
        int j=start;
        int k=end;
        int l=start+count;

        while(j<l && k>l){
           while(arr[j]<=arr[l] && j<l  ){
               j++;
           }
           while(arr[k]>arr[l] && k>l){
               k--;
           }
           if(j<l && k>l) {
               int temp1 = arr[j];
               arr[j] = arr[k];
               arr[k] = temp1;
               j++;
               k--;
           }
        }

        return l;






    }
}
