package bitwise;

import java.util.Scanner;

public class BinaryToDecimal {

    public static void main(String[] args) {

        System.out.println("Enter the value of N");
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int number=0;
        int i=0;
        while(n!=0){

            if(n%10==1){
                number=number+ (int)Math.pow(2,i);
            }
            i++;
            n=n/10;
        }
        System.out.println(number);
    }
}
