package Searching;

public class PivotElement {

    public static void main(String[] args) {

        int arr[]={8,10,10,17,1};

        int left=0;
        int right=arr.length-1;
        int ans=Integer.MAX_VALUE;

        while(right>left) {
            int mid = left + (right - left) / 2;

            if (mid + 1 <= arr.length - 1 && mid - 1 >= 0) {
                if (arr[mid] >= arr[0]) {
                    left = mid + 1;
                } else {
                    right = mid;
                }
            }
        }

        System.out.println(arr[left]);

    }
}
