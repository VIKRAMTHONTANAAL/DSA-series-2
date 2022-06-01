package Arrays;

public class Intersection2 {
    public static void main(String[] args) {
        int i=0,j=0;
        int arr1[]={1 ,4,5};
        int arr2[]={ 3 ,4,5};
        while (i<arr1.length && j<arr2.length){

            if(arr1[i]<arr2[j]){
                i++;
            }
           else if(arr1[i]==arr2[j]){
                System.out.print(arr1[i]+" ");
                i++;
                j++;
            }
          else if(arr1[i]>arr2[j]){
                j++;
            }

        }

    }
}
