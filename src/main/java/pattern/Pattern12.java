package pattern;

import java.util.Scanner;

public class Pattern12 {

    public static void main(String[] args) {
        System.out.println("Enter the value of N");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int i = 1, j = 1;
        int num = 'B';
        while (i <= n) {
            j = 1;
            num = 'B';
            while (j <= n) {

                System.out.print((char) num + " ");
                j = j + 1;
                num = num + 1;
            }

            i = i + 1;
            System.out.println();
        }
        i = 1;
        j = 1;
        num = 'A';
        while (i <= n) {
            j = 1;

            while (j <= n) {

                System.out.print((char) num + " ");
                j = j + 1;
                num = num + 1;
            }

            i = i + 1;
            System.out.println();
        }

    }
}
