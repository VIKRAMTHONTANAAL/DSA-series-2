package Arrays;

import java.util.Arrays;

public class PassByValueCheck {

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        System.out.println(Arrays.toString(arr));
        arra(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void arra(int a[]){

a[0]=120;
        System.out.println(Arrays.toString(a));
    }
}
