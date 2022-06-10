package main.java.Practice;

public class sumOfDigits {
    public static void main(String[] args) {
        int n=12345;
        int sum=0;


       while(n!=0) {
           int dig = n % 10;
        sum=sum+dig;
           n=n/10;
       }

        System.out.println(sum+" sum of elements");


    }
}
