package Searching;

public class BinarySearchIteration {
    public static void main(String[] args) {

        int arr[]={1,2,3,4,5,7,8,9,10,11,12,14,18,19,21,24,28,30,35,70,100};
        int arr2[]={2,4,6,8,12,18};
        int arr3[]={3,8,11,14,16};
int key=16;
        System.out.println(binarySearchIterate(arr3,key));


    }
    public static int binarySearchIterate(int arr[],int key){
        int left=0;
        int right=arr.length-1;
        int mid=0;
        while(left<=right){

            mid=left + (right-left)/2;

            if(arr[mid]==key) {
                return mid;
            }
          if(key>arr[mid]){
                left=mid+1;
            } else {
               right = mid - 1;
           }
        }


        return -1;

    }
}
