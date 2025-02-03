package Array2025;

public class SwapAlternate {

    public static void main(String[] args) {

         int arr[]={1,2,7,8,5};
        //int arr[]={1, 2, 3, 4, 5, 6};

        arr=swapAlternate(arr);

        printArray(arr);

    }

    public static void printArray(int arr[]){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }



    public static int[] swapAlternate(int arr[]){

        for(int i = 0; i<arr.length-1;i=i+2){
            int j=i+1;
            if(j<=arr.length-1){
                int swap=arr[i];
                arr[i]=arr[j];
                arr[j]=swap;
            }else{
                break;
            }

        }

    return arr;
    }
}
