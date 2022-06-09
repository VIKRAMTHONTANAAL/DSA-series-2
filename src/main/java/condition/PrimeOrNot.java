package condition;

import java.util.Scanner;

public class PrimeOrNot {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number");
        int number = scan.nextInt();
        if (number == 0 || number == 1) {
            System.out.println(number + " is not a prime number");
        }

        for (int i = 2; i <=number / 2; i++) {
            if (number % i == 0) {
                System.out.println(number + " is not a prime number");
                System.exit(0);
            }

        }
        System.out.println(number + " is a prime number");
    }
}
