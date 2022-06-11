package main.java.Practice;

public class FactorialOfNumber {
    public static void main(String[] args) {
        int n =10;
        System.out.println(getFactorial(n));
    }

    public static int getFactorial(int n ) {
        int sum=1;
        while(n!=0){
            sum=sum*n;
            n--;
        }

        return sum;
    }
}
