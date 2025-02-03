package Array2025;

import java.lang.reflect.Array;
import java.util.Arrays;

public class UniqueNumberOfOccurence {

    public static void main(String[] args) {
        int arr[]={1,2,2,1,1,3};
        int unique[]= new int[arr.length];

        int idx=0;

        Arrays.sort(arr);

        for(int i =0;i<arr.length;i++){
            int count=1;
            while(i+1<arr.length && arr[i]==arr[i+1]){
                count++;
                i++;
            }
            unique[idx++]=count;
        }

        printArray(arr);

        printArray(unique);

        boolean isUnique=true;

        Arrays.sort(unique);

        for(int j=0;j<unique.length;j++){
            if(j+1< arr.length && unique[j]==unique[j+1] &&unique[j]!=0){
                isUnique=false;
                break;
            }
        }

        System.out.println(isUnique);





    }

    public static void printArray(int arr[]){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
}
