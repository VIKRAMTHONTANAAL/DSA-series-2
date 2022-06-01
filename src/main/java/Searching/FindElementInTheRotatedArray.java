package Searching;
import java.util.*;
public class FindElementInTheRotatedArray {

    public static void main(String[] args) {
        ArrayList <Integer> arr=new ArrayList<Integer>();
        arr.add(10);
        arr.add(1);
        arr.add(2);
        arr.add(5);
        arr.add(6);

        findPosition(arr, arr.size(), 10);
    }
    public static int findPosition(ArrayList<Integer> arr, int n, int k) {
        // Write your code here.
        int left=0;
        int right=n-1;

        while(right>left){
            int mid= left + (right-left) /2;

            if(arr.get(mid)>=arr.get(0)){
                left=mid+1;
            }else{
                right=mid;
            }
        }

        if(arr.get(left)>arr.get(0)){
            left=0;
            right=n-1;
        }
        else{
            if (k>arr.get(n-1)){
                right=left-1;
                left=0;
            }else{
                right=n-1;
            }
        }
        while(right>=left){
            int mid2=left+(right-left)/2;

            if(arr.get(mid2)==k){
                return mid2;
            }
            if(k>arr.get(mid2)){
                left=mid2+1;
            }else{
                right=mid2-1;
            }


        }

        return -1;

    }

}
