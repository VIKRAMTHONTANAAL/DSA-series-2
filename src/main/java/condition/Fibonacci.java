package condition;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("Enter the value of n");
        Scanner scan=new Scanner(System.in);
        int n= scan.nextInt();
        int sum=0;
        int n1=0,n2=1;

        for(int i=1;i<=n;i++){

            if(i==1){
                System.out.print(n1+" ");
            }
            else if (i==2){
                System.out.print(n2+" ");

            }
            else{
                sum=n1+n2;
                System.out.print(sum+" ");
                n1=n2;
                n2=sum;
            }
        }





    }
}
