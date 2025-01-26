package Sorting2025;

public class InsertionSort2025 {

    public static void main(String[] args) {
        int arr[]={8, 22, 7, 9, 31, 5, 13};


        for(int i=1; i<arr.length;i++){
            for(int j=i; j>0;j--){
                if(arr[j-1]>arr[j]){
                    int swap=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=swap;
                }
            }
        }


        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");}


        }
    }

