package Searching;

public class BinaryUsingRecursion {


    public static void main(String[] args) {


        int arr[]={1,2,3,4,5,7,8,9,10,11,12,14,18,19,21,24,28,30,35,70,100};
int arr2[]={5,11,13,17,19,27};
        int n =70;

        System.out.println(binarySearch(0,arr.length-1,n, arr));


    }

    public static int binarySearch(int left ,int right,int n, int arr[]){
        int mid=left + (right-left)/2;
        int number=-1;
        if(arr[mid]==n){
            return mid;
        }
        if(left>=right){
            return -1;
        }
        if(n>arr[mid]){
           number =binarySearch(mid+1,right,n,arr);
        }
        if(n<arr[mid]){
          number = binarySearch(left,mid-1,n,arr);
        }

return number;


    }





}
