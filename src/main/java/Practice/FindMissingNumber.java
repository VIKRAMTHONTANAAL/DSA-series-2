package main.java.Practice;

public class FindMissingNumber {
    public static void main(String[] args) {
        int arr[]={2,3,4,5,7,8,9,10};
        int sum=0;
        int actualsum=0;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
            if(arr[i]>max){
                max=arr[i];
            }
            actualsum=actualsum+arr[i];
        }
//        System.out.println(min);
//        System.out.println(max);
//        System.out.println(actualsum);
        for(int j=min;j<=max;j++){
           sum=sum+j;
        }
     //   System.out.println(sum);
        System.out.println(sum-actualsum);



        //Array should not have duplicates
        //Array should be in range
        //Array no need to sorted
    }

//
}
