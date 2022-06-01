package Recursion;

public class sum {
    public static void main(String[] args) {
        int arr[]={1,4,6,7,21,3};
        System.out.println(sumOfArray(arr,0));
    }

    public static int sumOfArray(int arr[],int i) {

        if(i>=arr.length){
            return 0;
        }

        return arr[i]+sumOfArray(arr,i+1);
    }
}
