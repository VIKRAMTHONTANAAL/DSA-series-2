package function;

import java.util.Scanner;

public class ArithmeticProgression {

    public static void main(String[] args) {
        System.out.println("Enter the value N");
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        System.out.println(ap(n));
    }
    public static int ap(int n){
        int number=0;

        number= 3*n+7;
        return number;
    }
}
