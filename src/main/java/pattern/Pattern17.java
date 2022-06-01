package pattern;

import java.util.Scanner;

public class Pattern17 {
    public static void main(String[] args) {
        System.out.println("Enter the value of N");
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();

        int i=1,j=1;
int count=1;
        while(i<=n)
        {
            j=1;
            count=i;
            while(j<=n){
                if(--count>0){
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
       count=1;
        while(i<=n)
        {
            j=1;
            count=i;
            while(j<=n){
                if(--count>0){
                    System.out.print(" ");
                }
                else{
                    System.out.print(i);
                }
                j=j+1;
            }

            i=i+1;
            System.out.println();
        }

    }
}
