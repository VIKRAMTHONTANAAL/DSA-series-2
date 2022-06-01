package Maths;

import java.text.BreakIterator;

public class PrimeNumber {

    public static void main(String[] args) {

        int number=8;

        System.out.println(isPrime(number));

    }

    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }

        for(int i=2;i<n/2;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
