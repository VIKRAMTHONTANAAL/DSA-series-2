package Maths;

import java.text.BreakIterator;

public class SieveOfEratosthenes {
    public static void main(String[] args) {
        System.out.println(countOfPrime(5000000));
    }
    public static int countOfPrime(int n){
        int count=0;
        boolean arr[]=new boolean[n];
        if(n<=1){
            return 0;
        }

        for(int i=2;i<n;i++){
            if(!arr[i]){
                count++;
                for(int j=i*2;j<n;j=j+i){
                    arr[j]=true;
                }

            }



        }

        return count;
    }
}
