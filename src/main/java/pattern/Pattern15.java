package pattern;

import java.util.Scanner;

public class Pattern15 {
    public static void main(String[] args) {
        System.out.println("Enter the value of N ");
        Scanner scan=new Scanner(System.in);
        int n= scan.nextInt();
        int num='A';
        int i=1,j=1;
        while(i<=n){

            j=1;
            num='A'-1+i;
            while(j<=i){

                System.out.print((char)num);
                j=j+1;
                num=num+1;
            }

            i=i+1;
            System.out.println();
        }
        System.out.println();
        i=1;
        j=1;
        while(i<=n){

            j=1;
        num='A'+n-i;
            while(j<=i){

                System.out.print((char)num);
                j=j+1;
                num=num+1;
            }

            i=i+1;
            System.out.println();
        }

    }
}
