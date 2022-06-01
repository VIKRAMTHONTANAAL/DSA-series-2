package pattern;

import java.util.Scanner;

public class Pattern11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = scan.nextInt();
        int i = 1, j = 1;
        char ch = 'A';
        int num = (int) ch;
        while (i <= n) {
            j = 1;
            while (j <= n) {

                System.out.print((char) (num + i - 1) + " ");
                j = j + 1;
            }

                    i = i + 1;
            System.out.println();
        }
    }
}
