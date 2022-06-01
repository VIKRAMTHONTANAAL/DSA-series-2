package bitwise;

import java.sql.SQLOutput;
import java.util.Scanner;

public class NegativeNumberToBinaryUsingBitwise {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println(Long.MAX_VALUE);
        System.out.println("Enter the value of N");
        int n=scan.nextInt();
        long number=0;
        for(int i=31;i>=0;i--){
int k=n>>i;
if((k&1)>0){
    System.out.print("1");
    number=number+ (long)Math.pow(10,i);
}
else {
    System.out.print("0");
}
        }

      System.out.println();
        System.out.println(number);
        System.out.println("You cannot store 32 bits in LONG");

      /*  long number=0;
        int l=0;
        while(n!=0){
            if((n&1)>0){
                System.out.print("1");
                //number=number+ 1*(long)Math.pow(10,l);
            }else{
                System.out.print("0");
            }

            l++;
            n=n>>1;
        }

        System.out.println(number);*/

    }
}
