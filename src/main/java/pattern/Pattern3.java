package pattern;

import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the N");
        int n = scan.nextInt();
        int i = 1, j = 1;
        while (i <= n) {
            j = 1;
            while (j <= n) {
                System.out.print(j + " ");
                j = j + 1;
            }
            System.out.println();
            i = i + 1;
        }
        System.out.println();
        i = 1;
        j = 1;
        while (i <= n) {
            j = 1;
            while (j <= n) {
                System.out.print(n - j + 1 + " ");
                j = j + 1;
            }
            System.out.println();
            i = i + 1;
        }

    }
}
