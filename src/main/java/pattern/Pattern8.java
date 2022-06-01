package pattern;

import java.util.Scanner;

public class Pattern8 {
    public static void main(String[] args) {
        System.out.println("Enter the value of N");
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        int i = 1, j = 1;
        int count = 1;
        while (i <= n) {
            j = 1;
            count = i;
            while (j <= i) {
                System.out.print(count + " ");
                j = j + 1;
                count = count + 1;
            }

            i = i + 1;
            System.out.println();
        }
        System.out.println();
        i = 1;
        j = 1;

        while (i <= n) {
            j = 1;

            while (j <= i) {
                System.out.print(i + j - 1 + " ");
                j = j + 1;

            }

            i = i + 1;
            System.out.println();
        }


    }
}
