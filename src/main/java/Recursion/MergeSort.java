package Recursion;
import java.util.Arrays;

public class MergeSort {
    static int count=0;
    public static void mergeSort(int[] arr, int start, int end) {
    if(start>=end) return;

int mid = (start + end)/2;
    mergeSort(arr,start,mid);
    mergeSort(arr,mid+1,end);
    merge(arr,start,end);

    }

    public static void merge(int[] arr, int start, int end) {

        int mid = (start + end)/2;
        int length1=mid-start+1;
        int length2=end-mid;

        int first[]=new int[length1];
        int second[]=new int[length2];

        int k=start;
        for(int i=0;i<length1;i++){
            first[i]=arr[k++];
        }
         k=mid+1;
        for(int j=0;j<length2;j++){
            second[j]=arr[k++];
        }

        //
        int index1=0;
        int index2=0;
        int startIndex=start;

        while(index1<first.length && index2<second.length){

            if(first[index1]<=second[index2]){
                arr[startIndex++]=first[index1++];
            }else{
                arr[startIndex++]=second[index2++];
                count=count + mid-index1;
            }
        }
        while(index1<first.length){
            arr[startIndex++]=first[index1++];
        }
        while(index2<second.length){
            arr[startIndex++]=second[index2++];
        }


    }

    public static void main(String[] args) {
        int arr[]={10,11,64,49,20,21,2,5,1,6,9};
        mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
}
