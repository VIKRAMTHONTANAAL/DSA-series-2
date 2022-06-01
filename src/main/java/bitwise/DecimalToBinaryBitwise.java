package bitwise;

import java.util.Scanner;

public class DecimalToBinaryBitwise {

    public static void main(String[] args) {
        System.out.println("Enter the value of N");
        int bitwiseSum=0;
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int i=0;

        while(n>0){
            bitwiseSum=((n&1)*(int)Math.pow(10,i++))+bitwiseSum;
            n=n>>1;


        }


        System.out.println(bitwiseSum);
    }
}
