package function;

import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {
        System.out.println("Enter the value of N");
        Scanner scan=new Scanner(System.in);
        int n= scan.nextInt();

        System.out.println(getFibonacciNumber(n));

    }

    private static int getFibonacciNumber(int n) {
        int a=0;
        int b=1;

        if(n==0){
            return 0;
        }else if (n==1){
            return 1;
        }


        return getFibonacciNumber(n-1)+getFibonacciNumber(n-2);
    }


}
