package DP;

public class FibonacciTopDown {

    static int arr[];


    //Using recursion and memoization
    //0,1,1,2,3,5,8,13,21
    public static void main(String[] args) {


        int n = 8;

        arr=new int[n+1];
        System.out.println(fibonacci(n));
    }

    public static int fibonacci(int n) {


        if (n == 0 || n == 1) {

            return n;
        }

        int x = fibonacci(n - 1);
        int y = fibonacci(n - 2);


        if (arr[n]!=0) {
            return arr[n];
        } else {
            arr[n]=x+y;
        }

        return x + y;
    }
}
