package pattern;

import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
        System.out.println("Enter the value of N");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int i = 1, j = 1;
        while (i <= n) {
            j = 1;
            while (j <= i) {
                System.out.print("*");
                j = j + 1;
            }
            i = i + 1;
            System.out.println();
        }

    }
}
