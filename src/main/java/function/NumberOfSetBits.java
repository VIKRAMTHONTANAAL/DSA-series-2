package function;

import java.util.Scanner;

public class NumberOfSetBits {


    public static void main(String[] args) {
        System.out.println("Enter a");
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        System.out.println("Enter b");
        int b= scan.nextInt();


        System.out.println(getSetBits(a)+getSetBits(b));


    }

    public static int getSetBits(int n){
        int count=0;

        while(n!=0){
            if((n&1)>0){
                count++;
            }
            n=n>>1;
        }

        return count;
    }

}
