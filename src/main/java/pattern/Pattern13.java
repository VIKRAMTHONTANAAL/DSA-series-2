package pattern;

import java.util.Scanner;

public class Pattern13 {
    public static void main(String[] args) {
        System.out.println("Enter the value of N");
        Scanner scan = new Scanner(System.in);
        int n =scan.nextInt();
        int i=1, j=1;
int num='A';
        while (i<=n){
            j=1;
num='A'+i-2;
            while(j<=n){
                num=num+1;
                System.out.print((char)num+" ");
j=j+1;
            }
            i=i+1;
            System.out.println();
        }


    }
}
