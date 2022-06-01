package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SortZeroOne2 {

    public static void main(String[] args) {

        int arr[]={0,1,1,0,0,1,0,0,0,0};

        int i=0;
        int j=arr.length-1;
        int swap=0;

        while(i<j){
            if(arr[i]>arr[j]) {
                swap = arr[i];
                arr[i] = arr[j];
                arr[j] = swap;
                j--;
            }
            i++;


        }


        System.out.println(Arrays.toString(arr));
    }
}
