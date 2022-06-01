package Recursion;

public class FibonacciNumber {


    public static int fibonacciNumber(int n) {

        //base case
        if(n==0){
            return 0;
        }
        if (n==1){
            return 1;
        }



        return fibonacciNumber(n-1)+fibonacciNumber(n-2);




    }
    public static void main(String[] args) {
        System.out.println(fibonacciNumber(8));

    }

}
