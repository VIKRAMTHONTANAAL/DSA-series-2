package Recursion;

public class isSorted {
    public static boolean isSorted(int arr[], int i) {
        boolean isBoolean=true;

        if(i>arr.length-2){
            return isBoolean;
        }

        if(arr[i]>arr[i+1]){
           return false;
        }

   isBoolean=     isSorted(arr,i+1);
return isBoolean;

    }

    public static void main(String[] args) {
        int arr[]={2,3,9,4,11,13,16};
        if(isSorted(arr,0)){
            System.out.println("Sorted");
        }else{
            System.out.println("Not Sorted");
        }

    }
}
