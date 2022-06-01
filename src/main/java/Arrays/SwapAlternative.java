package Arrays;

import java.util.Arrays;

public class SwapAlternative {

    public static void main(String[] args) {
       // int arr[]={5,7,-2,10,22,-2,0,5,22,1};
        int arr[]={11,33,9,76,43};

int left=0;
int right=1;
int swap=0;
while(left<arr.length && right< arr.length){
    swap=arr[left];
    arr[left]=arr[right];
    arr[right]=swap;

    left=left+2;
    right=right+2;
}

        System.out.println(Arrays.toString(arr));

    }
}
