package Sorting;
import java.util.Arrays;
public class Check {

    public static void main(String[] args) {
        int arr[]=new int[10];
      /*  arr[1]++;
        System.out.println(Arrays.toString(arr));*/

        int count=0;

        for(int j : arr){

            count++;
        }
        System.out.println(count);
        for(int i=0;i<5;i++){
            arr[i]=1;
        }

        System.out.println(Arrays.toString(arr));
    }
}
