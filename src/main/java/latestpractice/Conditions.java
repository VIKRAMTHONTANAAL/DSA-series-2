package latestpractice2025;
import java.util.Scanner;

public class Conditions {

    public static void main(String[] args) {
        int a,b;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the numbers");
        a=scan.nextInt();
        b=scan.nextInt();

        if(a>b){
            System.out.println(a+" number is bigger");
        }else{
            System.out.println(b+" number is bigger");
        }

        int number;
        number=scan.nextInt();
        if(number>0){
            System.out.println("NUMBER IS POSITIVE");
        } else if (number<0) {
            System.out.println("NUMBER IS NEGATIVE");
        } else{
            System.out.println("NUMBER IS ZERO");
        }

    }
}
