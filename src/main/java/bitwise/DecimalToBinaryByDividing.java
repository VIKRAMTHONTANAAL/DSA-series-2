package bitwise;

import java.util.Scanner;

public class DecimalToBinaryByDividing {

    public static void main(String[] args) {
        System.out.println("Enter the value of N");
        int bitwiseSum=0;
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int i=0;

        while(n>0){
            bitwiseSum=((n%2)*(int)Math.pow(10,i++))+bitwiseSum;
            n=n/2;


        }


        System.out.println(bitwiseSum);
    }
}
