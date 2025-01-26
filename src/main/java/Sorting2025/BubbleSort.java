package Sorting2025;

public class BubbleSort {


    public static void main(String[] args) {
        int arr[]={5,4,2,3,1};

        for(int i =0 ;i< arr.length-1; i++){
            boolean isSwapped= false;
            for (int j=0; j< arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    isSwapped=true;
                    int swap=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]= swap;
                }
            }
            if(isSwapped==false){
                break;
            }

        }
        for(int i=0;i<arr.length;i++)
        System.out.print(arr[i]+" ");


    }
}
