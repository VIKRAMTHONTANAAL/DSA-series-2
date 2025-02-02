package Practice2025;

public class LinearSearch {
    public static void main(String[] args) {

int arr[]={5,6,4,5,3,2,1};
        System.out.println(elementFound(arr, 0));
    }
    public static boolean elementFound(int arr[], int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){

                return true;
            }
        }
        return false;
    }

}
