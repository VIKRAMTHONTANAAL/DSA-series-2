package SearchOrSorting2025;

public class BinarySearch {

    public static void main(String[] args) {
        int arr[] = { 1,5,8,9,13,17,23,30};
        int search = 13;

        int key = binarySearch(0, arr.length-1, arr, search);
        System.out.println(key);

    }

    public static int binarySearch(int start, int end, int arr[], int key){
        int mid = (start + end)/2;



        if(arr[mid]==key){
            return mid;
        }
        if(start>end){
            return -1;
        }
        if(arr[mid]>key){
            return binarySearch(start, mid-1, arr, key);
        }else{
           return binarySearch(mid+1, end, arr, key);
        }

    }
}
