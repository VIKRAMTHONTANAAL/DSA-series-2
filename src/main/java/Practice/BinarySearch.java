package main.java.Practice;

public class BinarySearch {

    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 6, 7, 8, 9};
int key=9;
        int n = -1;
        n = binarySearch2(arr,0,arr.length-1, key);
        if (n == -1) {
            System.out.println("Element Not Found");
        } else {
            System.out.println("Element found on index " + n);
        }

    }

    public static int binarySearch(int[] arr, int left, int right, int key) {

        int mid=left + (right-left)/2;

            if (arr[mid] == key) {
                return mid;
            }
        if(left>=right){
            return -1;
        }

            if (arr[mid] > key) {
             return   binarySearch(arr, left, mid - 1, key);
            } else {
               return binarySearch(arr, mid + 1, right, key);
            }


    }

    public static int binarySearch2(int []arr,int  left,int right, int key ) {

        int mid=left+(right-left)/2;
        if(left>right){
            return -1;
        }

        if(arr[mid]==key){
            return mid;
        }
        else if (key>arr[mid]){
            return binarySearch2(arr, mid+1,right, key);
        }else{
            return binarySearch2(arr,left,mid-1,key);
        }

    }


}
