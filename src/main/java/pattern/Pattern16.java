package pattern;

import java.util.Scanner;

public class Pattern16 {
    public static void main(String[] args) {
        System.out.println("Enter the value of N");
Scanner scan =new Scanner(System.in);
int n=scan.nextInt();
int i=1,j=1;
while (i<=n){
j=1;
    while(j<=n){
        if(j<=n-i){
            System.out.print(" ");
        }
            else{
            System.out.print("*");
        }


        j=j+1;
    }
    i=i+1;
    System.out.println();
}

        System.out.println();
     i=1;
j=1;
        while (i<=n){
            j=1;
            while(j<=n+1-i){

                System.out.print("*");
                j=j+1;
            }
            i=i+1;
            System.out.println();
        }

    }
}
