package Arrays;

public class Intersection {

    public static void main(String[] args) {
    //    int arr1[]={1, 2, 2, 2, 3 ,4};
        int arr1[]={1 ,4,5};
   //     int arr2[]={ 2, 2, 3, 3 };
        int arr2[]={ 3 ,4,5};


        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length ;j++){
                if(arr2[j]>arr1[i]){
                    break;
                }

                if(arr1[i]==arr2[j]){
                    System.out.print(arr1[i]+" ");
                    arr2[j]=Integer.MIN_VALUE;
                    break;
                }

            }
        }

    }
}
