package Practice;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the value of N");
       // int n =scan.nextInt();
        for(int i=0;i<100;i++) {
            if (isPrimeNumber(i)) {
                System.out.println(i+" is a prime number");
            } else {
                System.out.println(i+" is not a prime number");
            }
        }

    }

    public static boolean isPrimeNumber(int n){

        if(n<=1){
        return false;}

        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

}
