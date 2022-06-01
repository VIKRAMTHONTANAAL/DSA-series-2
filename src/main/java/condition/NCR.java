package condition;

import java.util.Scanner;

public class NCR {
    public static void main(String[] args) {
int n=0,r=0;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the value of N");
n=scan.nextInt();
        System.out.println("Enter the value of R");
        r=scan.nextInt();

        System.out.println(ncr(n,r));

    }

    public static int ncr(int n, int r){
        int sum=1;
sum=factorial(n)/(factorial(r)*factorial(n-r));
        return sum;
    }

    public static int factorial(int n){
        int sum=1;
        while(n!=0){
sum=sum*n--;
        }
        return sum;
    }
}
