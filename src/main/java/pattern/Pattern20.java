package pattern;

import java.util.Scanner;

public class Pattern20 {

    public static void main(String[] args) {
        System.out.println("Enter the n");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int i = 1;
        while (i <= n) {

            int j = 1;
            while (j <= n + 1 - i) {
                System.out.print(j);
                j++;
            }

            int k = 1;
            while (k <= i - 1) {
                System.out.print("*");
                k++;
            }

            int l = 1;
            while (l <= i -1) {
                System.out.print("*");
                l++;
            }

         int m=1;
            while(m<=n+1-i){
                System.out.print(n+2-m-i);
                m=m+1;
            }

            i = i + 1;
            System.out.println();
        }

    }
}
