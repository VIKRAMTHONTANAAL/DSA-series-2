package condition;

import java.util.Scanner;

public class SumOfEvenNumbers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of N");
        int n = scan.nextInt();
        int i = 1;
        int sum = 0;
        while (i <= n) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
            i = i + 1;
        }


        System.out.println(sum);
    }

}
