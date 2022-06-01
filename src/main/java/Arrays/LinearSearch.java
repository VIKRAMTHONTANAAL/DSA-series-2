package Arrays;

public class LinearSearch {

    public static boolean linearSearch(int arr[], int n){


        for(int i=0;i<arr.length;i++){
            if(arr[i]==n){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[]={5,7,-2,10,22,-2,0,5,22,1};
        int n=1;

        System.out.println(linearSearch(arr,n));
    }
}
