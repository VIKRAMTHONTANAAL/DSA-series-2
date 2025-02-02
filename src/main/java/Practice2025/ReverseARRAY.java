package Practice2025;

public class ReverseARRAY {

    public static int[] reverse(int arr[]){
        int rev[]=new int[arr.length];
        for(int i=arr.length-1,j=0;i>=0;i--,j++){
            rev[j]=arr[i];
        }
        return rev;
    }

    public static int[] swap(int arr[]){

        int start=0;
        int end= arr.length-1;

        while(end>start){
            int swap=arr[start];
            arr[start]=arr[end];
            arr[end]=swap;

            start++;
            end--;
        }


        return arr;


    }

    public static void main(String[] args) {

        int arr[]={2,7,5,9};

        arr= reverse(arr);

         print(arr);
        System.out.println();



         swap(arr);
         print(arr);




    }

    public static void print(int arr[]) {
for(int i=0;i<arr.length;i++) {

    System.out.print(arr[i]+ " ");
}
    }
}
