package pattern;

import java.util.Scanner;

public class Pattern18 {
    public static void main(String[] args) {
        System.out.println("Enter the value of N");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int i = 1, j = 1;

        while (i <= n) {
            j = 1;
            while (j <= n) {
                if (j > n - i) {
                    System.out.print(i);
                } else {
                    System.out.print(" ");
                }


                j++;

            }

            i++;
            System.out.println();
        }
        System.out.println();
      i = 1;
        j = 1; int count=1;

        while (i <= n) {
            j = 1;
            while (j <= n) {
                if (j > n - i) {
                    System.out.print(count++);
                } else {
                    System.out.print(" ");
                }


                j++;

            }

            i++;
            System.out.println();
        }



    }
}
