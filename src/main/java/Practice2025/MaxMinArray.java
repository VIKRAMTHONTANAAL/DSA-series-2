package Practice2025;

public class MaxMinArray {

    public static int max(int arr[]){
        int max=Integer.MIN_VALUE;


        for(int i=0; i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }

        }
        return max;
    }

    public static int min(int arr[]){
        int min=Integer.MAX_VALUE;

        for(int i=0; i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }

        }
        return min;
    }
    public static int sum(int arr[]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {

        int arr[]={1,4,5,6,7,8,9,10,12,16};

        System.out.println(max(arr));
        System.out.println(min(arr));
        System.out.println(sum(arr));


    }
}
