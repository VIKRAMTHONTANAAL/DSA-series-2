package SearchOrSorting2025;

public class BinarySearchIterative {

    public static int binarySearch(int arr[], int search ) {
        int start = 0, end = arr.length - 1;
        int mid = (start)+ ((end-start)/2);

        while (start <= end) {
            if (arr[mid] == search) {
                return mid;
            }

            if (search > arr[mid]) {
                start= mid+1;
            }else{
                end=mid-1;
            }

            mid= (start + end) / 2;

        }

        return -1;
    }
    public static void main(String[] args) {

        int arr[]={1,3,5,7,9};
        int search=5;

        int key_place= binarySearch(arr, search);
        System.out.println(key_place);

    }

}
