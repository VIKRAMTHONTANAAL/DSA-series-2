package main.java.Practice;

import java.util.Arrays;

public class CheckTwoArraysEqual {

    public static void main(String[] args) {
        int arr1[]={12,1234,34,45,456,34};
        int arr2[]={12,1234,34,45,456,345};

        if(checkEqual(arr1,arr2)){
            System.out.println("equal");
        }else {
            System.out.println("unequal");
        }

//        Arrays.sort(arr1);
//        Arrays.sort(arr2);
        if(Arrays.equals(arr1,arr2)){
            System.out.println("equal");
        }else {
            System.out.println("unequal");
        }


    }

    public static boolean checkEqual(int a1[],int a2[]){

        if(a1.length!=a2.length){
            return false;
        }

        for(int i=0;i<a1.length;i++){
            if(a1[i]!=a2[i]){
                return false;
            }
        }

        return true;

    }

}
