package Recursion;

import java.text.BreakIterator;

public class linearSearch {
    public static boolean linearSearch(int arr[],int i,int key) {

        if(i>=arr.length){
            return false;
        }

        if(arr[i]==key){
            return true;
        }else{

        boolean result =linearSearch(arr,i+1,key);

        return result;
        }

    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};

        if(linearSearch(arr,0,1)){
            System.out.println("Element Found");
        }
        else {
            System.out.println("Element not found");
        }
    }
}
