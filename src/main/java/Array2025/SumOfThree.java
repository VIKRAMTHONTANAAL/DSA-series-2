package Array2025;

import java.util.HashSet;

public class SumOfThree {



    public static void main(String[] args) {
        int arr[]={1, 2, 3, 1, 2, 3};

        int sum=6;
        for(int i=0; i<arr.length-2;i++){
            for(int j=i+1;j< arr.length-1;j++){
                for(int k=j+1;k<arr.length;k++){
                    if(arr[i]+arr[j]+arr[k]==sum){
                        System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
                    }
                }
            }
        }
    }
}
