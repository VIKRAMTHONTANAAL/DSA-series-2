package condition;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the value of A");
        int a=scan.nextInt();
        System.out.println("Enter the value of B");
        int b=scan.nextInt();
        System.out.println("Enter the operator");
        String bit="";
        bit=scan.next();
        char operator=bit.charAt(0);

        switch (operator){
            case '+':{
                System.out.println(a+b);
                break;}
            case '-':
                System.out.println(a-b);
            case '*':
                System.out.println(a*b);
            case '/':
                System.out.println(a/b);
            case '%':
                System.out.println(a%b);
            default:
                System.out.println("Please enter valid operator");
        }
    }
}
