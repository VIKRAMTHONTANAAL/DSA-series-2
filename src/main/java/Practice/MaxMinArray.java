package main.java.Practice;

public class MaxMinArray {

    public static void main(String[] args) {
        int arr[]={50,100,40,20,60};
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(min+ " min "+ max+" max");
    }
}
