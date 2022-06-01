package pattern;

import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of N");
        int n = scanner.nextInt();
        int i = 1, j = 1;
        int k = 1;
        while (i <= n) {
            j = 1;
            while (j <= n) {
                System.out.print(k + " ");
                k = k + 1;
                j = j + 1;
            }
            i = i + 1;
            System.out.println();
        }
    }
}
