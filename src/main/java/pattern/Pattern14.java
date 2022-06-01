package pattern;

import java.util.Scanner;

public class Pattern14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of N");
        int n = scan.nextInt();
        int i = 1, j = 1;
        int num = 'A';
        while (i <= n) {
            j = 1;
            while (j <= i) {
                System.out.print((char) num);
                j = j + 1;

            }
            num = num + 1;
            i = i + 1;
            System.out.println();


        }
        System.out.println();
         i = 1;
         j = 1;
      num = 'A';
        while (i <= n) {
            j = 1;
            while (j <= i) {
                System.out.print((char) num+" ");
                j = j + 1;
                num = num + 1;
            }

            i = i + 1;
            System.out.println();


        }

    }
}
