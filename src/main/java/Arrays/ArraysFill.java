package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class ArraysFill {
    public static void main(String[] args) {
        System.out.println("Enter the value of N");

        Scanner scan=new Scanner(System.in);
        int n= scan.nextInt();
       // int arr[]=new int[n];
        int a[]=new int[100];
        Arrays.fill(a,n);
        System.out.println(a);
        int i=0;
        System.out.println("");

        char b[]=new char[10];


       // Arrays.fill(b,'v');

        System.out.println(Arrays.toString(a));

        System.out.println(Arrays.toString(b));
    }
}
