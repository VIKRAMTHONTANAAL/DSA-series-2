package pattern;

import java.util.Scanner;

public class Pattern19 {
    public static void main(String[] args) {
        System.out.println("Enter the value of N");
        Scanner scan = new Scanner(System.in);
        int i = 1, j = 1;
        int n = scan.nextInt();
        int count = 1;
        boolean flag = false;
        while (i <= n) {
            j = 1;
            count = 1;

            while (j <= n + i - 1) {

                if (j <= n - i) {
                    System.out.print(" ");
                } else if (j <= n) {
                    System.out.print(count++);
                } else {
                    if (!flag) {
                        count--;
                        flag = true;
                    }
                    System.out.print(--count);
                }

                j++;

            }
            flag = false;
            i++;
            System.out.println();
        }


    }
}
