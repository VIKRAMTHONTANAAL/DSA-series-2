package Sorting2025;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[]={64, 25, 12,22,11};

        for (int i=0; i< arr.length-1; i++){
            int min=i;
            for(int j=i+1;j< arr.length;j++){
                if(arr[j]<arr[min]){
                    min = j;
                }
            }
            System.out.println(min);
            int swap=arr[i];
            arr[i]=arr[min];
            arr[min]=swap;

        }

        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
