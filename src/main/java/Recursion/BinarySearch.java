package Recursion;

public class BinarySearch {
    public static boolean binarySearch(int arr[],int left,int right,int key) {

            int mid = left + (right - left) / 2;
        boolean ans=false;
        if(left>right) {
            return false;
        }
            if (arr[mid] == key) {
                return true;
            }
            if (key > arr[mid]) {
             return binarySearch(arr, mid + 1, right, key);
            } else {
                return binarySearch(arr, left, mid-1 , key);
            }

        }



    public static void main(String[] args) {
        int arr[]={1,3,5,7,8,10};
       if( binarySearch(arr,0, arr.length-1 ,1)){
           System.out.println("Element Found");
       }else{
           System.out.println("Element Not Found");
       }
    }
}
