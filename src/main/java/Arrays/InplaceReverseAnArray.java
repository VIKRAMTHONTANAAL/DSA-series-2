package Arrays;

import java.util.Arrays;

public class InplaceReverseAnArray {

    public static void main(String[] args) {
        int arr[]={5,7,-2,10,22,-2,0,5,22,1};
        reverseAnArray2(arr);
        System.out.println(Arrays.toString(arr));
    }

   public static void reverseAnArray(int a[]){
        int swap=0;
        for(int i=0;i<a.length/2;i++){
            swap=a[i];
            a[i]=a[a.length-i-1];
            a[a.length-i-1]=swap;
        }

   }

    public static void reverseAnArray2(int arr[]){

        int start=0;
        int end=arr.length-1;
int swap=0;

        while(start<=end){
        swap=arr[start];
        arr[start]=arr[end];
        arr[end]=swap;

            start++;
            end--;

        }

    }

}
