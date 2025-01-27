package SearchOrSorting2025;

public class BubbleSort {


    public static void main(String[] args) {
        int arr[]={8, 22, 7, 9, 31, 5, 13};
        int count=0;

        for(int i =0 ;i< arr.length-1; i++){

            boolean isSwapped= false;
            for (int j=0; j< arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    isSwapped=true;
                    int swap=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]= swap;
                    count++;
                }
            }
            if(isSwapped==false){
                break;
            }

        }
        for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");}

        System.out.println();
        System.out.println(count);




    }
}
