package Recursion;

public class Factorial {

    public static void main(String[] args) {
        int n=0;
        System.out.println(factorial(n));
    }

    public static int factorial(int n){
//base case
        if(n==0){
            return 1;
        }
//recursive relation
        return n*factorial(n-1);
    }
}
